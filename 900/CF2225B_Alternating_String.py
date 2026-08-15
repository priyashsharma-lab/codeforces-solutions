t = int(input())

for _ in range(t):
    s = input().strip()

    count = 0

    for i in range(len(s) - 1):
        if s[i] == s[i + 1]:
            count += 1

    if count <= 2:
        print("YES")
    else:
        print("NO")