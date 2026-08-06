t = int(input())

for _ in range(t):
    s = input()

    # Alice removes the first 0
    first_zero = s.index('0')
    after_alice = s[:first_zero] + s[first_zero + 1:]

    # Bob chooses which 1 to remove
    remove_one = -1

    for i in range(len(after_alice)):
        if after_alice[i] == '1':
            if '0' in after_alice[i + 1:]:
                remove_one = i
                break

    # If every remaining 1 is at the end,
    # remove the last 1.
    if remove_one == -1:
        remove_one = after_alice.rfind('1')

    answer = after_alice[:remove_one] + after_alice[remove_one + 1:]

    print(answer)