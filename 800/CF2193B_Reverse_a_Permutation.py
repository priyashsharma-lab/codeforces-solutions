t = int(input())

for _ in range(t):
    n = int(input())
    p = list(map(int, input().split()))

    # suffix maximum value and its position
    suffix_max = [0] * n
    suffix_pos = [0] * n

    suffix_max[n - 1] = p[n - 1]
    suffix_pos[n - 1] = n - 1

    for i in range(n - 2, -1, -1):
        if p[i] > suffix_max[i + 1]:
            suffix_max[i] = p[i]
            suffix_pos[i] = i
        else:
            suffix_max[i] = suffix_max[i + 1]
            suffix_pos[i] = suffix_pos[i + 1]

    # Find first position that can be improved
    for i in range(n - 1):
        if suffix_max[i + 1] > p[i]:
            j = suffix_pos[i + 1]

            p[i:j + 1] = reversed(p[i:j + 1])
            break

    print(*p)