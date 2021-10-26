t=int(input())
while(t>0):
    op=int(input())
    dict1=dict()
    while(op>0):
        a=list(map(int,input().split()))
        if(a[0]==0):
            dict1[a[1]]=a[2]
        elif(a[0]==1):
            if a[1] in dict1.keys():
                print("true",end=" ")
            else:
                print("false",end=" ") 
        elif(a[0]==2):
            print(dict1[a[1]],end=" ")
        elif(a[0]==3):
            print(len(dict1),end=" ")
        else:
            if a[1] in dict1.keys():
                del dict1[a[1]]
        op=op-1 
    t=t-1
        
        
            
