from decimal import Decimal, getcontext
getcontext().prec = 1000

n, k = map(Decimal, input().split())
import math
#print( k/n) 
print( math.ceil( k/n ) )
