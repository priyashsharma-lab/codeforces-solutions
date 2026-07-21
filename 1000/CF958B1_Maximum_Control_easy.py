import sys

data = list(map(int, sys.stdin.read().split()))

n = data[0]
planets = [0] * (n + 1)
remotePlanets = 0

for planet in data[1:]:
    planets[planet] += 1

for i in planets:
    if i == 1:
        remotePlanets += 1

print(remotePlanets)