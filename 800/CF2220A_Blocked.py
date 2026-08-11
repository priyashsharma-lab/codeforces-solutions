t = int(input())

for _ in range(t):
    n = int(input())
    a = list(map(int, input().split()))

    # Duplicate elements make it impossible
    if len(set(a)) != n:
        print(-1)
        continue

    # Put larger elements first
    a.sort(reverse=True)

    print(*a)