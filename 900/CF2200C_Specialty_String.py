t = int(input())

for _ in range(t):
    n = int(input())
    s = input()

    stack = []

    for ch in s:
        if stack and stack[-1] == ch:
            stack.pop()
        else:
            stack.append(ch)

    print("YES" if not stack else "NO")