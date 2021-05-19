package lesson2.task6;

import java.util.Random;

public class InvertingArray {
    public static void main(String[] args) {
        int m = new Random().nextInt(3) + 3;
        int n = new Random().nextInt(3) + 3;
        int [][] firstArray = new int [m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                firstArray[i][j] = new Random().nextInt(2);
            }
        }

        int length = new Random().nextInt(m - 2);

        int width = new Random().nextInt(m - 2);
        firstArray[length][width] = 2;

        int[][] secondMatrix = new int[m][n];
        boolean isTwo = false;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (firstArray[i][j] == 2) {
                    secondMatrix[i][j] = 2;
                    isTwo = true;
                } else secondMatrix[i][j] = isTwo
                        ? (firstArray[i][j] + 1) % 2
                        : firstArray[i][j];
            }
        }
        System.out.println("Исходная матрица");
        for (int[] row : firstArray) {
            for (int element : row)
                System.out.print(element + " ");
            System.out.println();
        }
        System.out.println("Инвертированная матрица");
        for (int[] row : secondMatrix) {
            for (int element : row)
                System.out.print(element + " ");
            System.out.println();
        }
    }
}