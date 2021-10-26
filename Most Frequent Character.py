from collections import Counter
t=int(input())
while(t>0):
    a=input()
    a1=list(a)
    b=Counter(a1)
    x=[]
    x1=[]
    for i in b.values():
        x.append(i)
    for j in b.keys():
        x1.append(j)
    c=x.index(max(x))
    print(x1[c])
    
    t=t-1
   
    
    
