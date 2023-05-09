from typing import List

Matrix = List[List[int]]

def diffuse_sand(matrix: Matrix, i: int, j:int) -> Matrix:
    n = len(matrix)
    m = len(matrix[0])

    if i - 1 >= 0:
        matrix[i-1][j] = matrix[i-1][j] + 1
    if j - 1 >= 0:
        matrix[i][j-1] = matrix[i][j-1] + 1
    if i + 1 < n:
        matrix[i+1][j] = matrix[i+1][j] + 1
    if j + 1 < n:
        matrix[i][j+1] = matrix[i][j+1] + 1
    matrix[i][j] = matrix[i][j] - 4
    return matrix

def reduce_sandpile(matrix: Matrix) -> Matrix:
    tmp = matrix
    should_reduce = True
    while should_reduce:
        should_reduce = False
        # detect if sandpile should be reduce
        for i, row in enumerate(tmp):
            for j, value in enumerate(row):
                if value > 3: 
                    should_reduce = True
                    tmp = diffuse_sand(tmp, i, j)
    return tmp

def add_matrix(matrix1: Matrix, matrix2: Matrix) -> Matrix:
    result = list()
    for i, row in enumerate(matrix1):
        new_row = list()
        for j, value in enumerate(row): 
            new_row.append(value + matrix2[i][j])
        result.append(new_row)
    return result

def add(matrix1: Matrix, matrix2: Matrix) -> Matrix:
    matrix = add_matrix(matrix1, matrix2)
    return reduce_sandpile(matrix)