n=int(input())

c = 0
for x in list(input()):
    if x == '+':
        c += 1
    else:
        if c > 0:
            c -= 1
        else:
            c = 0
print(c)

