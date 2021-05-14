package lesson2.task2;

public class ChessBoard {
    public static void main(String[] args) {
        int[][] chessBoard = new int[8][8];
        for (int a = 0; a < 8; a++) {
            for (int b = 0; b < 8; b++)
                chessBoard[a][b] = (a + b) % 2;
        }
        System.out.println("For");
        for (int a = 0; a < 8; a++) {
            for (int b = 0; b < 8; b++)
                System.out.print(chessBoard[a][b]);
            System.out.println();
        }
        System.out.println("ForEach");
        for (int[] row : chessBoard) {
            for (int value : row)
                System.out.print(value);
            System.out.println();
        }
        System.out.println("While");
        int a = 0;
        while (a < 8) {
            int b = 0;
            while (b < 8) {
                System.out.print(chessBoard[a][b]);
                b++;
            }
            System.out.println();
            a++;
        }
    }
}


