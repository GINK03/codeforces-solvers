import statistics

H, W = map(int, input().split())
ws = set()
hs = set()
for h in range(H):
  raw = input()
  lw = [ index for index, w in enumerate(raw) if w == 'B']
  lh = [ h for index, w in enumerate(raw) if w == 'B']
  #print(lw)
  ws |= set(lw)
  hs |= set(lh)

left = statistics.mean(ws) + 1
right = statistics.mean(hs) + 1

print(right, left)
