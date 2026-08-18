t = int(input())

for _ in range(t):
    n = int(input())
    a = list(map(int, input().split()))

    ans = []

    for i in range(n):
        smaller = 0
        greater = 0

        for j in range(i + 1, n):
            if a[j] < a[i]:
                smaller += 1
            elif a[j] > a[i]:
                greater += 1

        ans.append(max(smaller, greater))

    print(*ans)