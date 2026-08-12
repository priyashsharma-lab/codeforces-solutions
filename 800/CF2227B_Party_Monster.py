t = int(input())

for _ in range(t):
    n = int(input())
    s = input()

    balance = 0

    for c in s:
        if c == '(':
            balance += 1
        else:
            balance -= 1

    if balance == 0:
        print("YES")
    else:
        print("NO")