
from collections import Counter

n, k = map(int, input().split()) 
s = input()

source = {c for i, c in enumerate('ABCDFEGHIJKLMNOPQRSTUVWXYZ') if i < k } 
#print(source)
max_num = int('1'*n,2)


lens = []
for i in range(max_num+1):
  filt = f'{max_num-i:0{n}b}'
  monos = [ c for (f,c) in zip(filt, s) if f == '1' ]
  count = [v for k,v in dict(Counter(monos)).items() ] 
  # print(count)
  try:
    head = count[0]
  except:
    continue
  allres = all([head == x for x in count ])
  if allres:
    uniq = set(monos)
    if uniq == source:
      #print(allres)
      #print(monos)
      lens.append( len(monos) )
#print( lens)
if len(lens) != 0:
  print( max(lens) )
else:
  print( 0 )
