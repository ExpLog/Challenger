from math import ceil

n, m, a = map(int, input().split())
side_n = ceil(n/a)
side_m = ceil(m/a)
print(side_n * side_m)