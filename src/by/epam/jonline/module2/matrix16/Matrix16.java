/**
 * 16. Магическим квадратом порядка n называется квадратная матрица размера NxN,
 * составленная из чисел 1, 2, 3, * ...,2n  так, что суммы по каждому столбцу,
 * каждой строке и каждой из двух больших диагоналей равны между собой.
 * Построить такой квадрат
 */

package by.epam.jonline.module2.matrix16;

public class Matrix16 {
    public static void main(String[] args) {

        int n = 7;
        int[][] magicSquare = new int[n + 1][n + 1];

        int col = 0;
        int row = 0;

        int tekCol = 0;
        int tekRow = 0;

        if (n % 2 != 0) {

            initEmptySquare(magicSquare);
            generateMagicSquare(magicSquare, n, tekCol, tekRow, col, row); //Магический квадрат нечетного порядка. Метод де ла Лубера
            printMagicSquare(magicSquare);

        } else {
            System.out.println("n - нечетное число > 1");
        }

    }

    public static void generateMagicSquare ( int[][] magicSquare, int n, int tekCol, int tekRow, int col, int row){

        int number = 1;
        col = n / 2;
        row = 1;
        magicSquare[row][col] = number;

        for (number = 2; number <= n * n; number++) {

            tekCol = col;
            tekRow = row;
            col++;
            row--;

            if (row < 1) {
                row = n;
            }

            if (col > n - 1) {
                col = 0;
            }

            if (magicSquare[row][col] != 0) {
                col = tekCol;
                row = tekRow + 1;
            }

            magicSquare[row][col] = number;
        }

    }

    public static void initEmptySquare ( int[][] magicSquare){
        for (int i = 0; i < magicSquare.length; i++) {
            for (int j = 0; j < magicSquare[i].length; j++) {
                magicSquare[i][j] = (int) (0);
            }
        }

    }

    public static void printMagicSquare ( int[][] magicSquare){
        for (int i = 1; i < magicSquare.length; i++) {
            for (int j = 0; j < magicSquare[i].length - 1; j++) {
                System.out.format("%5s", magicSquare[i][j]);
            }
            System.out.println();
        }

    }


}
