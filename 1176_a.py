
import math


def trial_division(n):
    c = 0 
    while True:
        if n%2 == 0:
            n//=2
            c+=1
        else:
            break
    while True:
        if n%3 == 0:
            n//=3
            #n*=2
            c+=2
        else:
            break
    while True:
        if n%5 == 0:
            n//=5
            #n*=4
            c+=3
        else:
            break
    return c, n
def main():

    for q in range(int(input())):
        num = int(input())
        c,n = trial_division(num)
        if n == 1:
            print(c)
        else:
            print(-1)


if __name__ == "__main__":
    main()
