xml = input()

indent = -1

def printSpaces(w):
    for _ in range(w * 2):
        print(" ", end="")

i = 0
while i < len(xml):
    if i + 1 < len(xml) and xml[i + 1] == '/':
        printSpaces(indent)
        while True:
            print(xml[i], end="")
            i += 1
            if i >= len(xml) or xml[i] == '<':
                break
        if i == len(xml):
            break
        i -= 1
        indent -= 1
        print()
        i += 1
        continue

    if xml[i] == '<':
        if i + 1 < len(xml) and xml[i + 1] != '/':
            indent += 1
        printSpaces(indent)

    print(xml[i], end="")

    if xml[i] == '>':
        print()

    i += 1