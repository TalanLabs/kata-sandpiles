import unittest
from sandpile import add


class SandpileTest(unittest.TestCase):
    def test_case_one_simple_addition(self):
        matrix1 = [[1,2,1], [2,0,2], [1,2,1]]
        matrix2 = [[0,2,0], [2,0,2], [0,2,0]]

        expected_matrix = [[3,1,3], [1,0,1], [3,1,3]]

        self.assertEqual(add(matrix1, matrix2), expected_matrix)

    def test_case_one_more_simple_addition(self):
        matrix1 = [[3,0,1], [0,3,0], [1,0,3]]
        matrix2 = [[1,0,0], [0,1,0], [0,0,1]]
        
        expected_matrix = [[0,2,1], [2,0,2], [1,2,0]]

        self.assertEqual(add(matrix1, matrix2), expected_matrix)

    def test_case_a_lot_of_redistribution(self):
        matrix1 = [[1,2,1], [2,3,2], [1,2,1]]
        matrix2 = [[3,0,3], [0,0,0], [3,0,3]]
        
        expected_matrix = [[2,1,2], [1,3,1], [2,1,2]]

        self.assertEqual(add(matrix1, matrix2), expected_matrix)

    def test_case_pretty_packed(self):
        matrix1 = [[3,3,3], [3,3,3], [3,3,3]]
        matrix2 = [[1,1,1], [1,1,1], [1,1,1]]
        
        expected_matrix = [[0,3,0], [3,0,3], [0,3,0]]

        self.assertEqual(add(matrix1, matrix2), expected_matrix)

    def test_case_full_sandpiles(self):
        matrix1 = [[3,3,3], [3,3,3], [3,3,3]]
        matrix2 = [[3,3,3], [3,3,3], [3,3,3]]
        
        expected_matrix = [[2,1,2], [1,2,1], [2,1,2]]

        self.assertEqual(add(matrix1, matrix2), expected_matrix)

    def test_case_bigger_grid(self):
        matrix1 = [[3,1,1,3], [1,2,2,1], [1,2,2,1], [3,1,1,3]]
        matrix2 = [[1,0,0,2], [0,3,0,0], [0,0,3,0], [2,0,0,1]]

        expected_matrix = [[0,3,3,1], [3,3,0,3], [3,0,3,3], [1,3,3,0]]

        self.assertEqual(add(matrix1, matrix2), expected_matrix)

    def test_case_event_bigger(self):
        matrix1 = [[3,1,0,0,3], [1,3,1,2,0], [0,1,3,1,0], [0,2,1,3,1], [3,0,0,1,3]]
        matrix2 = [[1,1,1,1,1], [1,2,2,2,1], [1,2,3,2,1], [1,2,2,2,1], [1,1,1,1,1]]

        expected_matrix = [[2,2,1,1,2], [2,3,3,2,1], [1,3,2,3,1], [1,2,3,3,2], [2,1,1,2,2]]

        self.assertEqual(add(matrix1, matrix2), expected_matrix)
    