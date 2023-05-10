package com.talan.dojo.sandpiles;

public class Solution {


    private static int [][] addMatrix(int[][] matrix1, int[][] matrix2) {
        int n = matrix1.length;
        int[][] result = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return result;
    }

    private static int[][] diffuseSand(int[][] matrix, int i, int j) {
        if (i - 1 >= 0) {
            matrix[i - 1][j] = matrix[i - 1][j] + 1;
        }
        if (j - 1 >= 0) {
            matrix[i][j - 1] = matrix[i][j - 1] + 1;
        }
        if (i + 1 < matrix.length) {
            matrix[i + 1][j] = matrix[i + 1][j] + 1;
        }
        if (j + 1 < matrix[0].length) {
            matrix[i][j + 1] = matrix[i][j + 1] + 1;
        }
        matrix[i][j] = matrix[i][j] - 4;
        return matrix;
    }

    private static int[][] reduceSandPiles(int[][] matrix) {
        int[][] tmp = matrix;
        boolean shouldReduce = true;
        int n = matrix.length;
        while (shouldReduce) {
            shouldReduce = false;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (tmp[i][j] > 3) {
                        tmp = diffuseSand(tmp, i, j);
                        shouldReduce = true;
                    }
                }
            }
        }
        return tmp;
    }


    public static int[][] addSandPiles(int[][] piles1, int[][] piles2) {
        int[][] matrix = addMatrix(piles1, piles2);
        return reduceSandPiles(matrix);
    }
}
