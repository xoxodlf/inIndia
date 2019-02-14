'''
Created on 2018. 7. 31.

@author: xoxod
'''

import tensorflow as tf
import matplotlib.pyplot as plt
x_data=[[73,80,75],[93,88,93],[89,91,90],[96,98,100],[73,66,70]]
y_data=[[152],[185],[180],[196],[142]]

X=tf.placeholder(tf.float32,[None,3])
Y=tf.placeholder(tf.float32,[None,1])

w=tf.Variable(tf.random_normal([3,1],name='weight'))
b=tf.Variable(tf.random_normal([1],name='bias'))

h=tf.matmul(X, w)+b

cost=tf.reduce_min(tf.square(h-Y))

optimizer=tf.train.GradientDescentOptimizer(learning_rate=0.00001)

train=optimizer.minimize(cost)

sess= tf.Session()

sess.run(tf.global_variables_initializer())

for step in range(2001):
    cost_val,hy_val,_=sess.run(
        [cost,h,train], feed_dict={X:x_data,Y:y_data})
    if step%10==0:
        print(step,"Cost : ", cost_val, "\n prediction: \n",hy_val)
        
        
print('your score is',sess.run(h,feed_dict={X:[[77,89,95]]}))
print('your score is',sess.run(h,feed_dict={X:[[95,89,77]]}))
