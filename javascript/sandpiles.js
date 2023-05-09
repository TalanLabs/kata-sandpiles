
const addMatrix = (matrix1, matrix2) => {
  const result = []
  for (let i = 0; i < matrix1.length; i++) {
    const row = []
    for (let j = 0; j < matrix1[0].length; j++) {
      row[j] = matrix1[i][j] + matrix2[i][j]
    }
    result[i] = row
  }
  return result
}

const diffuseSand = (matrix, i, j) => {
  if (i - 1 >= 0) {
    matrix[i - 1][j] = matrix[i - 1][j] + 1
  }
  if (j - 1 >= 0) {
    matrix[i][j - 1] = matrix[i][j - 1] + 1
  }
  if (i + 1 < matrix.length) {
    matrix[i + 1][j] = matrix[i + 1][j] + 1
  }
  if (j + 1 < matrix[0].length) {
    matrix[i][j + 1] = matrix[i][j + 1] + 1
  }
  matrix[i][j] = matrix[i][j] - 4
  return matrix
}

const reduceSandpile = (matrix) => {
  let shouldReduce = true
  let tmp = matrix
  while (shouldReduce) {
    shouldReduce = false
    for (let i = 0; i < matrix.length; i++) {
      for (let j = 0; j < matrix[0].length; j++) {
        if (tmp[i][j] > 3) {
          tmp = diffuseSand(tmp, i, j)
          shouldReduce = true
        }
      }
    }
  }
  return tmp
}

export const add = (matrix1, matrix2) => {
  const matrix = addMatrix(matrix1, matrix2)
  return reduceSandpile(matrix)
}
