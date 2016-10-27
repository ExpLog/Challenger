n, m = [int(x) for x in input().split()]
data = []
for _ in range(n):
    new_data = [int(x) for x in input().split()]
    data.append(new_data)
k = int(input())
data.sort(key=lambda l: l[k])
for row in data:
    print(" ".join(map(str, row)))
