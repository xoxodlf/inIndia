'''
Created on 2018. 7. 19.

@author: xoxod
'''
import tensorflow as tf

X= [1,2,3]
Y=[1,2,3]

W=tf.Variable(5.0)
hypothesis = W*X
cost = tf.reduce_mean(tf.square(hypothesis-Y))

optimizer = tf.train.GradientDescentOptimizer(learning_rate=0.1)
train = optimizer.minimize(cost)

sess= tf.Session()

sess.run(tf.global_variables_initializer())

for step in range(100):
    print(step,sess.run(cost),sess.run(W))
    sess.run(train)