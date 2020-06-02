t=int(input())
while(t):
    n=int(input())
    x=list()
    y=list()
    for i in range(0,n):
        k,j=map(int,input().split())
        x.append(k)
        y.append(j)
    x.sort()
    y.sort()
    x1=x[n-1]-x[0]
    y1=y[n-1]-y[0]
    a=max(x1,y1)
    print(a*a)
    
    t=t-1
