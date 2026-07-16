from math import ceil
n, m, a = map(int, input().split())
vertical=int(ceil(float(n)/a))
horizontal=int(ceil(float(m)/a))
ans=horizontal*vertical
print(ans)