import re


def excel_col_to_number(col):
	n = 0
	for c in col:
		n *= 26
		n += ord(c) - ord('A') + 1
	return str(n)


def number_to_excel_col(num):
	n = int(num)
	s = []
	while n > 0:
		k = n%26 if n%26 else 26
		n -= k
		n = n//26
		s.append(chr(k + ord('A') - 1))
	return "".join(reversed(s))

def excel_to_alternate(row, col):
	return "R" + row + "C" + excel_col_to_number(col)

	
def alternate_to_excel(row, col):
	return number_to_excel_col(col) + row

	
excel_regex = re.compile("([A-Z]+)([0-9]+)")
alternate_regex = re.compile("R([0-9]+)C([0-9]+)")
n = int(input())
for i in range(n):
	line = input()
	match = excel_regex.fullmatch(line)
	if match:
		col, row = match.group(1, 2)
		result = excel_to_alternate(row, col)
	else:
		match = alternate_regex.fullmatch(line)
		row, col = match.group(1, 2)
		result = alternate_to_excel(row, col)
	print(result)