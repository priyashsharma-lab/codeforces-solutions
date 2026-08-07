INF = 10 ** 9

t = int(input())

for _ in range(t):
    n, k = map(int, input().split())
    s = input().strip()

    ans = INF

    for m in range(n + 1):

        if m < k or (n - m) < k:
            continue

        dp = [[INF] * (m + 2) for _ in range(n + 1)]
        dp[0][0] = 0

        for i in range(n):
            for r in range(min(i, m) + 1):

                if dp[i][r] == INF:
                    continue

                # Make current pig L
                if r >= k:
                    cost = dp[i][r] + (s[i] == 'R')
                    dp[i + 1][r] = min(dp[i + 1][r], cost)

                # Make current pig R
                if r < m:
                    l_before = i - r
                    l_after = (n - m) - l_before

                    if l_after >= k:
                        cost = dp[i][r] + (s[i] == 'L')
                        dp[i + 1][r + 1] = min(dp[i + 1][r + 1], cost)

        ans = min(ans, dp[n][m])

    print(-1 if ans == INF else ans)