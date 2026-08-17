t = int(input())

for _ in range(t):
    n, c, k = map(int, input().split())
    a = list(map(int, input().split()))

    a.sort()

    for x in a:
        if x > c:
            break

        used = min(k, c - x)
        k -= used

        c += x + used

    print(c)