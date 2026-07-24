def solve(s):
    n = len(s)

    prefix = [0] * n
    suffix = [0] * n

    c = 0
    mx = 0

    for i in range(n):
        if s[i] == '2':
            c += 1
        prefix[i] = c

    c = 0
    for i in range(n - 1, -1, -1):
        if s[i] == '1' or s[i] == '3':
            c += 1
        suffix[i] = c

    for i in range(n):
        mx = max(mx, prefix[i] + suffix[i])

    return n - mx


t = int(input())

for _ in range(t):
    s = input().strip()
    ans = solve(s)
    print(ans)