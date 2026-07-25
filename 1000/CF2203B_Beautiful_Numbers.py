def solve(s):
    n = len(s)
    sortedS = [0] * n
    digitSum = 0
    ans = 0
    res = 0
    temp = 0

    for i in range(n):
        sortedS[i] = int(s[i])
        digitSum += sortedS[i]

    if digitSum <= 9:
        return 0

    # Sort only from index 1 onwards
    sortedS[1:] = sorted(sortedS[1:])

    # Case 1: First digit unchanged
    temp = sortedS[0]
    for i in range(1, n):
        temp += sortedS[i]
        if temp >= 10:
            break
        ans += 1

    # Case 2: First digit changed to 1
    temp = 1
    for i in range(1, n):
        temp += sortedS[i]
        if temp >= 10:
            break
        res += 1

    return min(n - res, n - 1 - ans)


t = int(input())
for _ in range(t):
    s = input().strip()
    print(solve(s))