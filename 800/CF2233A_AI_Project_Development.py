import math

t = int(input())

for _ in range(t):

    n, x, y, z = map(int, input().split())

    # Option 1: Don't use AI
    without_ai = math.ceil(n / (x + y))

    # Option 2: Use AI
    lines_during_setup = x * z

    if lines_during_setup >= n:
        # Project finishes during AI setup
        with_ai = math.ceil(n / x)
    else:
        remaining = n - lines_during_setup

        after_ai = math.ceil(remaining / (x + 10 * y))

        with_ai = z + after_ai

    print(min(without_ai, with_ai))