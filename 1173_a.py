x,y,z=map(int,input().split())

a=x-y
if -z <= a <= z and z != 0:
        print('?')
elif 0 < a:
        print('+')
elif 0 == a:
        print(0)
elif a < 0:
        print('-')
