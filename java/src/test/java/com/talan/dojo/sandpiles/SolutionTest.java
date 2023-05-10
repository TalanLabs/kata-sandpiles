package com.talan.dojo.sandpiles;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Assertions;

public class SolutionTest {

    @Test
    @DisplayName("one simple addition")
    void oneSimpleAddition() {
        //test case
        int[][] sandPile1 = new int[][] {
                new int[] {1, 2, 1},
                new int[] {2, 0, 2},
                new int[] {1, 2, 1},
        };

        int[][] sandPile2 = new int[][] {
                new int[] {0, 2, 0},
                new int[] {2, 0, 2},
                new int[] {0, 2, 0},
        };

        // expected
        int[][] expected = new int[][] {
                new int[] {3, 1, 3},
                new int[] {1, 0, 1},
                new int[] {3, 1, 3},
        };

        int [][] result = Solution.addSandPiles(sandPile1, sandPile2);
        Assertions.assertArrayEquals(expected, result);
    }

    @Test
    @DisplayName("one more simple addition")
    void oneMoreSimpleAddition() {
        //test case
        int[][] sandPile1 = new int[][] {
                new int[] {3, 0, 1},
                new int[] {0, 3, 0},
                new int[] {1, 0, 3},
        };

        int[][] sandPile2 = new int[][] {
                new int[] {1, 0, 0},
                new int[] {0, 1, 0},
                new int[] {0, 0, 1},
        };

        // expected
        int[][] expected = new int[][] {
                new int[] {0, 2, 1},
                new int[] {2, 0, 2},
                new int[] {1, 2, 0},
        };

        int [][] result = Solution.addSandPiles(sandPile1, sandPile2);
        Assertions.assertArrayEquals(expected, result);
    }

    @Test
    @DisplayName("a lot of redistribution")
    void lotOfRedistribution() {
        //test case
        int[][] sandPile1 = new int[][] {
                new int[] {1, 2, 1},
                new int[] {2, 3, 2},
                new int[] {1, 2, 1},
        };

        int[][] sandPile2 = new int[][] {
                new int[] {3, 0, 3},
                new int[] {0, 0, 0},
                new int[] {3, 0, 3},
        };

        // expected
        int[][] expected = new int[][] {
                new int[] {2, 1, 2},
                new int[] {1, 3, 1},
                new int[] {2, 1, 2},
        };

        int [][] result = Solution.addSandPiles(sandPile1, sandPile2);
        Assertions.assertArrayEquals(expected, result);
    }

    @Test
    @DisplayName("pretty packed")
    void prettyPacked() {
        //test case
        int[][] sandPile1 = new int[][] {
                new int[] {3, 3, 3},
                new int[] {3, 3, 3},
                new int[] {3, 3, 3},
        };

        int[][] sandPile2 = new int[][] {
                new int[] {1, 1, 1},
                new int[] {1, 1, 1},
                new int[] {1, 1, 1},
        };

        // expected
        int[][] expected = new int[][] {
                new int[] {0, 3, 0},
                new int[] {3, 0, 3},
                new int[] {0, 3, 0},
        };

        int [][] result = Solution.addSandPiles(sandPile1, sandPile2);
        Assertions.assertArrayEquals(expected, result);
    }

    @Test
    @DisplayName("full sand piles")
    void fullSandPiles() {
        //test case
        int[][] sandPile1 = new int[][] {
                new int[] {3, 3, 3},
                new int[] {3, 3, 3},
                new int[] {3, 3, 3},
        };

        int[][] sandPile2 = new int[][] {
                new int[] {3, 3, 3},
                new int[] {3, 3, 3},
                new int[] {3, 3, 3},
        };

        // expected
        int[][] expected = new int[][] {
                new int[] {2, 1, 2},
                new int[] {1, 2, 1},
                new int[] {2, 1, 2},
        };

        int [][] result = Solution.addSandPiles(sandPile1, sandPile2);
        Assertions.assertArrayEquals(expected, result);
    }

    @Test
    @DisplayName("bigger grids")
    void biggerGrids() {
        //test case
        int[][] sandPile1 = new int[][] {
                new int[] {3, 1, 1, 3},
                new int[] {1, 2, 2, 1},
                new int[] {1, 2, 2, 1},
                new int[] {3, 1, 1, 3},
        };

        int[][] sandPile2 = new int[][] {
                new int[] {1, 0, 0, 2},
                new int[] {0, 3, 0, 0},
                new int[] {0, 0, 3, 0},
                new int[] {2, 0, 0, 1},
        };

        // expected
        int[][] expected = new int[][] {
                new int[] {0, 3, 3, 1},
                new int[] {3, 3, 0, 3},
                new int[] {3, 0, 3, 3},
                new int[] {1, 3, 3, 0},
        };

        int [][] result = Solution.addSandPiles(sandPile1, sandPile2);
        Assertions.assertArrayEquals(expected, result);
    }


    @Test
    @DisplayName("even bigger grids")
    void evenBiggerGrids() {
        //test case
        int[][] sandPile1 = new int[][] {
                new int[] {3, 1, 0, 0, 3},
                new int[] {1, 3, 1, 2, 0},
                new int[] {0, 1, 3, 1, 0},
                new int[] {0, 2, 1, 3, 1},
                new int[] {3, 0, 0, 1, 3},
        };

        int[][] sandPile2 = new int[][] {
                new int[] {1, 1, 1, 1, 1},
                new int[] {1, 2, 2, 2, 1},
                new int[] {1, 2, 3, 2, 1},
                new int[] {1, 2, 2, 2, 1},
                new int[] {1, 1, 1, 1, 1},
        };

        // expected
        int[][] expected = new int[][] {
                new int[] {2, 2, 1, 1, 2},
                new int[] {2, 3, 3, 2, 1},
                new int[] {1, 3, 2, 3, 1},
                new int[] {1, 2, 3, 3, 2},
                new int[] {2, 1, 1, 2, 2},
        };

        int [][] result = Solution.addSandPiles(sandPile1, sandPile2);
        Assertions.assertArrayEquals(expected, result);
    }
}
