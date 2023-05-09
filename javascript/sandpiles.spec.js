import { add } from './sandpiles'

describe('sandpiles', () => {
  test('one simple addition', () => {
    const matrix1 = [[1, 2, 1], [2, 0, 2], [1, 2, 1]]
    const matrix2 = [[0, 2, 0], [2, 0, 2], [0, 2, 0]]
    const expected = [[3, 1, 3], [1, 0, 1], [3, 1, 3]]

    expect(expected).toEqual(add(matrix1, matrix2))
  })

  test('one more simple addition', () => {
    const matrix1 = [[3, 0, 1], [0, 3, 0], [1, 0, 3]]
    const matrix2 = [[1, 0, 0], [0, 1, 0], [0, 0, 1]]
    const expected = [[0, 2, 1], [2, 0, 2], [1, 2, 0]]

    expect(expected).toEqual(add(matrix1, matrix2))
  })

  test('a lot of redistribution', () => {
    const matrix1 = [[1, 2, 1], [2, 3, 2], [1, 2, 1]]
    const matrix2 = [[3, 0, 3], [0, 0, 0], [3, 0, 3]]
    const expected = [[2, 1, 2], [1, 3, 1], [2, 1, 2]]

    expect(expected).toEqual(add(matrix1, matrix2))
  })

  test('pretty packed', () => {
    const matrix1 = [[3, 3, 3], [3, 3, 3], [3, 3, 3]]
    const matrix2 = [[1, 1, 1], [1, 1, 1], [1, 1, 1]]
    const expected = [[0, 3, 0], [3, 0, 3], [0, 3, 0]]

    expect(expected).toEqual(add(matrix1, matrix2))
  })

  test('full sandpiles', () => {
    const matrix1 = [[3, 3, 3], [3, 3, 3], [3, 3, 3]]
    const matrix2 = [[3, 3, 3], [3, 3, 3], [3, 3, 3]]
    const expected = [[2, 1, 2], [1, 2, 1], [2, 1, 2]]

    expect(expected).toEqual(add(matrix1, matrix2))
  })

  test('bigger grids', () => {
    const matrix1 = [[3, 1, 1, 3], [1, 2, 2, 1], [1, 2, 2, 1], [3, 1, 1, 3]]
    const matrix2 = [[1, 0, 0, 2], [0, 3, 0, 0], [0, 0, 3, 0], [2, 0, 0, 1]]
    const expected = [[0, 3, 3, 1], [3, 3, 0, 3], [3, 0, 3, 3], [1, 3, 3, 0]]

    expect(expected).toEqual(add(matrix1, matrix2))
  })

  test('even bigger grids', () => {
    const matrix1 = [[3, 1, 0, 0, 3], [1, 3, 1, 2, 0], [0, 1, 3, 1, 0], [0, 2, 1, 3, 1], [3, 0, 0, 1, 3]]
    const matrix2 = [[1, 1, 1, 1, 1], [1, 2, 2, 2, 1], [1, 2, 3, 2, 1], [1, 2, 2, 2, 1], [1, 1, 1, 1, 1]]
    const expected = [[2, 2, 1, 1, 2], [2, 3, 3, 2, 1], [1, 3, 2, 3, 1], [1, 2, 3, 3, 2], [2, 1, 1, 2, 2]]

    expect(expected).toEqual(add(matrix1, matrix2))
  })
})
