t = int(input())

for _ in range(t):
    k = int(input())
    c = list(map(int, input().split()))

    possible = False
    count_two = 0

    for x in c:
        if x >= 3:
            possible = True

        if x >= 2:
            count_two += 1

    if count_two >= 2:
        possible = True

    print("YES" if possible else "NO")