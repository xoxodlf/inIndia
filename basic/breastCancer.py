'''
Created on 2018. 8. 28.

@author: xoxod
'''
import tensorflow as tf
import numpy as np
def MinMaxScaler(data):
    numerator = data - np.min(data, 0)
    denominator = np.max(data, 0) - np.min(data, 0)
    # noise term prevents the zero division
    return numerator / (denominator + 1e-7)

tf.set_random_seed(777)

xy = np.loadtxt('data.csv', delimiter=',',dtype=np.float32)
xy = MinMaxScaler(xy)
x_data = xy[0:500,6:12]
y_data = xy[0:500,[1]]
print(x_data)
print(y_data)
X= tf.placeholder(tf.float32, [None, 6])
Y= tf.placeholder(tf.float32, [None, 1])
W=tf.Variable(tf.random_normal([6,1]), name='weight');
b= tf.Variable(tf.random_normal([1]), name='bias')
hypothesis = tf.nn.softmax(tf.matmul(X,W)+b)
cost=tf.reduce_mean(Y*tf.log(hypothesis)+(1-Y)*tf.log(1-hypothesis))
optimizer = tf.train.GradientDescentOptimizer(learning_rate=0.00000000001).minimize(cost)

predicted = tf.cast(hypothesis > 0.5, dtype=tf.float32)
accuracy = tf.reduce_mean(tf.cast(tf.equal(predicted, Y), dtype=tf.float32))

with tf.Session() as sess:
    # Initialize TensorFlow variables
    sess.run(tf.global_variables_initializer())

    for step in range(10001):
        cost_val, _ = sess.run([cost, optimizer], feed_dict={X: x_data, Y: y_data})
        if step % 200 == 0:
            print(step, cost_val)

    # Accuracy report
    h, c, a = sess.run([hypothesis, predicted, accuracy],
                       feed_dict={X: x_data, Y: y_data})
    print("\nHypothesis: ", h, "\nCorrect (Y): ", c, "\nAccuracy: ", a)
        
    #print("Accuracy: {:.2%}".format( sess.run(accuracy, feed_dict={X: x_test_data, Y:y_test_data})))
