n=int(input("How many numbers of fibonacci series do you want "))
a=1
b=0
c=0
while(n>0):
    if(n>0):
        print(a)
    n=(n-1)
    if(n>0):
        b=a+c
        print(b)
    n=(n-1)
    if(n>0):
        c=a+b
        print(c)
    a=b+c
    n=(n-1)
