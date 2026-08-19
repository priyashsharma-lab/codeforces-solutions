t = int(input())

for _ in range(t):
    n = int(input())
    a = input()
    b = input()

    ones_a = a.count('1')
    ones_b = b.count('1')

    balance_a = 0
    balance_b = 0

    for i in range(n):
        if a[i] == '1':
            if i % 2 == 0:
                balance_a += 1
            else:
                balance_a -= 1

        if b[i] == '1':
            if i % 2 == 0:
                balance_b += 1
            else:
                balance_b -= 1

    if ones_a == ones_b and balance_a == balance_b:
        print("YES")
    else:
        print("NO")