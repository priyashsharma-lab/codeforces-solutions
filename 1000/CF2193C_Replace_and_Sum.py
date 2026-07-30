import sys

input = sys.stdin.readline

t = int(input())

for _ in range(t):
    n, q = map(int, input().split())

    a = [0] + list(map(int, input().split()))
    b = [0] + list(map(int, input().split()))

    # Make every position as large as possible
    for i in range(n, 0, -1):
        best = a[i]
        if b[i] > best:
            best = b[i]
        if i < n and a[i + 1] > best:
            best = a[i + 1]
        a[i] = best

    # Prefix sums
    pref = [0] * (n + 1)
    for i in range(1, n + 1):
        pref[i] = pref[i - 1] + a[i]

    ans = []
    for _ in range(q):
        l, r = map(int, input().split())
        ans.append(str(pref[r] - pref[l - 1]))

    print(" ".join(ans))