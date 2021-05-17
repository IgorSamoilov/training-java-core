package lesson2.task5;

import java.util.Random;

public class Transposition {

    public static void main(String[] args) {
        final int m = new Random().nextInt(3) + 3;
        final int n = new Random().nextInt(3) + 3;

        int[][] firstMatrix = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                firstMatrix[i][j] = new Random().nextInt(9);
            }
        }

        int[][] secondMatrix = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                secondMatrix[i][j] = firstMatrix[j][i];
            }
        }

        System.out.println("Исходная матрица");
        for (int[] row : firstMatrix) {
            for (int element : row)
                System.out.print(element);
            System.out.println();
        }

        System.out.println("Транспонированная матрица");
        for (int[] row : secondMatrix) {
            for (int element : row)
                System.out.print(element);
            System.out.println();
        }
    }
}
