t = int(input())

for _ in range(t):
    n, a, b = map(int, input().split())

    groups = n // 3
    remaining = n % 3

    ans = groups * min(3 * a, b)

    if remaining > 0:
        ans += min(remaining * a, b)

    print(ans)