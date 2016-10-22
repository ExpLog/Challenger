def merge(left, right):
    result = []
    inversions = 0
    
    ll, lr = len(left), len(right)
    i_left, i_right = 0, 0
    while(i_left < ll and i_right < lr):
        if left[i_left] <= right[i_right]:
            result.append(left[i_left])
            i_left += 1
        else:
            result.append(right[i_right])
            i_right += 1
            inversions += ll - i_left
    
    if i_left < ll:
        result.extend(left[i_left:])
    if i_right < lr:
        result.extend(right[i_right:])
    return result, inversions

def mergesort(array):
    la = len(array)
    if la == 1:
        return array, 0
    
    left, right = array[:la//2], array[la//2:]
    left, left_count = mergesort(left)
    right, right_count = mergesort(right)
    res, merge_count = merge(left, right)
    return res, (left_count + right_count + merge_count)

t = int(input())
for _ in range(t):
    n = int(input())
    array = [int(x) for x in input().split()]
    array, inv = mergesort(array)
    print(inv)