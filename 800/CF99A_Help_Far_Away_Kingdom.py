s = input()

integer_part, fraction_part = s.split('.')

# If integer part ends with 9
if integer_part[-1] == '9':
    print("GOTO Vasilisa.")

# Fractional part < 0.5
elif fraction_part[0] < '5':
    print(integer_part)

# Fractional part >= 0.5
else:
    last = int(integer_part[-1])
    last += 1

    integer_part = integer_part[:-1] + str(last)

    print(integer_part)