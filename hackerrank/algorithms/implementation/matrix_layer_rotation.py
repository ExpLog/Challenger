def len_ring(matrix, radius):
	m = len(matrix)
	n = len(matrix[0])
	return 2*(m - 2*radius) + 2*(n - 2*radius - 2)


def rotate_array_generator(array, r):
	n = len(array)
	r = r % n
	for i in range(n):
		index = (i - r) % n
		yield array[index]

		
def matrix_ring_generator(matrix, radius):
	m = len(matrix)
	n = len(matrix[0])
	r = radius
	# shift down
	prev = matrix[r][r]
	for i in range(r + 1, m - r):
		yield matrix[i][r]
		# matrix[i][r], prev = prev, matrix[i][r]
	
	# shift right
	for j in range(r + 1, n - r):
		yield matrix[m - r - 1][j]
		# matrix[m - r - 1][j], prev = prev, matrix[m - r - 1][j]
	
	# shift up
	for i in range(m - r - 2, r - 1, -1):
		yield matrix[i][n - r - 1]
		# matrix[i][n - r - 1], prev = prev, matrix[i][n - r - 1]
	
	# shift left
	for j in range(n - r - 2, r - 1, -1):
		yield matrix[i][j]
		# matrix[r][j], prev = prev, matrix[r][j]
		

def place_array_in_matrix_ring(array, matrix, radius):
	if len(array) != len_ring(matrix, radius):
		raise Exception("array and ring have different sizes\n{}\n{}\n{}".format(array, matrix, radius))
	m = len(matrix)
	n = len(matrix[0])
	r = radius
	index = 0
	for i in range(r + 1, m - r):
		matrix[i][r] = array[index]
		index += 1
		
	# shift right
	for j in range(r + 1, n - r):
		matrix[m - r - 1][j] = array[index]
		index += 1
		
	# shift up
	for i in range(m - r - 2, r - 1, -1):
		matrix[i][n - r - 1] = array[index]
		index += 1
		
	# shift left
	for j in range(n - r - 2, r - 1, -1):
		if index == len(array): break
		matrix[i][j] = array[index]
		index += 1


def shift_matrix(matrix, r):
	m = len(matrix)
	n = len(matrix[0])
	radius = min(m, n)//2
	for k in range(radius):
		ring_array = list(matrix_ring_generator(matrix, k))
		rotated_array = list(rotate_array_generator(ring_array, r))
		place_array_in_matrix_ring(rotated_array, matrix, k)


m, n, r = [int(x) for x in input().strip().split(" ")]
rows = [input().strip() for i in range(m)]
matrix = [[int(x) for x in row.split()] for row in rows]
shift_matrix(matrix, r)

for row in matrix:
	print(" ".join(str(x) for x in row))