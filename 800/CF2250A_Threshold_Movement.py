t = int(input())

for _ in range(t):
    n = int(input())
    weights = list(map(int, input().split()))

    if n % 2 == 1:
        print("NO")
        continue

    max_even = 0
    min_odd = 10 ** 18

    for i in range(n):
        if (i + 1) % 2 == 1:
            if weights[i] < min_odd:
                min_odd = weights[i]
        else:
            if weights[i] > max_even:
                max_even = weights[i]

    if min_odd - max_even >= 2:
        print("YES")
    else:
        print("NO")