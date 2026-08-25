t = int(input())

for _ in range(t):
    n, k = map(int, input().split())

    a = list(map(int, input().split()))
    b = list(map(int, input().split()))

    ans = []

    # Process higher levels first
    for level in range(k, 0, -1):

        for i in range(n):

            if b[i] == level:

                # Keep moving until k+1
                while b[i] <= k:
                    b[i] += 1
                    ans.append(i + 1)

    print(len(ans))
    print(*ans)