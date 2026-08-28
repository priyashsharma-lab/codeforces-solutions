q = int(input())

for _ in range(q):
    n = int(input())
    s, t = input().split()

    freq = [0] * 26

    for ch in s:
        freq[ord(ch) - ord('a')] += 1

    for ch in t:
        freq[ord(ch) - ord('a')] -= 1

    if all(x == 0 for x in freq):
        print("YES")
    else:
        print("NO")