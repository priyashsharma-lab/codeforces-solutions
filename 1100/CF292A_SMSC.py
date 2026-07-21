n = int(input())

time = 0
SMSC = 0
maxMsg = 0

for i in range(n):
    ti, ci = map(int, input().split())

    if ti != time + 1:
        while True:
            if SMSC == 0:
                time = ti
                break
            if ti == time:
                break
            SMSC -= 1
            time += 1
    else:
        time += 1
        if SMSC != 0:
            SMSC -= 1

    SMSC += ci

    if SMSC > maxMsg:
        maxMsg = SMSC

    if i == n - 1:
        time += SMSC

print(time, maxMsg)