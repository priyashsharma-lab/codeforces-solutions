players=input()
key=players[0]
c=0

if len(players)<7:
    print("NO")
    exit(0)

for i in range(0,len(players)):
    if players[i]==key:
        c+=1
    else:
        key=players[i]
        c=1
    
    if c==7:
        print("YES")
        exit(0)

print("NO")