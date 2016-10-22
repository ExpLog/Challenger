from itertools import *

k, m = [int(x) for x in input().split()]
lists = []
for _ in range(k):
    current_list = [int(x)**2 for x in input().split()]
    del current_list[0]
    lists.append(current_list)

possibilities = product(*lists)
print(max(map(lambda x: sum(x) % m, possibilities)))