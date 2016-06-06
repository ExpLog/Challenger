from math import factorial

digits = [int(d) for d in str(factorial(100))]
print(sum(digits))