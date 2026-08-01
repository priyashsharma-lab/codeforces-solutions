t = int(input())

for _ in range(t):
    n = int(input())
    a = list(map(int, input().split()))

    s = 0
    mn = 10 ** 18
    ans = []

    for i in range(n):
        s += a[i]
        val = s // (i + 1)
        if val < mn:
            mn = val
        ans.append(mn)

    print(*ans)