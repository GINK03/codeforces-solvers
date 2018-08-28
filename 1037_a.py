from math import sqrt
N = int(input())

# referr to this url
# https://blog.csdn.net/qq_37685156/article/details/82351421

# このアプローチはだめ
'''
def primes(n):
    primfac = []
    d = 2
    while d*d <= n:
        while (n % d) == 0:
            primfac.append(d)  # supposing you want multiple factors repeated
            n //= d
        d += 1
    if n > 1:
       primfac.append(n)
    return primfac

if N in [1,2]:
  print(N)
else:
  primefac = primes(N)
  print(set(primefac))
'''

# bit長の長さで見ていくのがいいらしい
if N == 0:
  print(0)
else:
  print(len(f'{N:b}'))
