'''
Created on 2018. 7. 17.

@author: xoxod
'''
n=int(input())
array=[[0]*2 for i in range(n)]
peopleArray=[[1]*14 for i in range(14)]
for i  in range(n):
    for j  in range(2):
        array[i][j]=int(input())


for i in range(14):
    sum=0
    for j  in range(14):
        if(i==0):
            peopleArray[i][j]=j+1
        else:
            sum=peopleArray[i-1][j]+sum
            peopleArray[i][j]=sum
             


for i in range(n):
    print(peopleArray[array[i][0]][array[i][1]-1])    