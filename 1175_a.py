N = int(input())

for input_line in [input() for n in range(N)]:
    n, k = map(int, input_line.split())
    num = 0
    while True:
        #print(n, n % k)
        if n % k == 0:
            n //= k
            num += 1
        else:
            num += n % k
            n -= n % k
        if n == 0:
            break
    print(num)
