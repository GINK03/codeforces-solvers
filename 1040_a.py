N, white, black = map(int, input().split())

xs = [int(x) for x in input().split()]
mid = len(xs)//2
#print(xs, mid, xs[mid])

if len(xs)%2 == 1:
  left =  list(reversed(xs[0:mid]))
  right = xs[mid+1:]
  #print(left, xs[mid], right)
  cost = 0
  impossible = False
  if xs[mid] == 2: cost += min([white, black])
  for l,r in zip(left, right):
    if l == 2 and r == 2:
      cost += min([white, black]) * 2
    if l == 2:
      if r == 1:
        cost += black
      elif r == 0:
        cost += white 
    if r == 2:
      if l == 1:
        cost += black
      elif l == 0:
        cost += white 
    if r != 2 and l != 2 and r != l:
      impossible = True

  if impossible == True:
    print(-1)
  else:
    print(cost)
else:
  left =  list(reversed(xs[0:mid]))
  right = xs[mid:]
  #print(left, right)
  cost = 0
  impossible = False
  #if xs[mid] == 2: cost += min([white, black])
  for l,r in zip(left, right):
    if l == 2 and r == 2:
      cost += min([white, black]) * 2
    if l == 2:
      if r == 1:
        cost += black
      elif r == 0:
        cost += white 
    if r == 2:
      if l == 1:
        cost += black
      elif l == 0:
        cost += white 
    if r != 2 and l != 2 and r != l:
      impossible = True

  if impossible == True:
    print(-1)
  else:
    print(cost)
