def read_matrix():
    n = int(input().strip())
    matrix = [list(input().strip()) for i in range(n)]
    return matrix

def col_sorted(matrix):
    n = len(matrix)
    for j in range(n):
        for i in range(1, n):
            if matrix[i-1][j] > matrix[i][j]:
                return False
    return True

tests = int(input().strip())
for t in range(tests):
    matrix = read_matrix()
    for row in matrix:
        row.sort()
    print("YES" if col_sorted(matrix) else "NO")