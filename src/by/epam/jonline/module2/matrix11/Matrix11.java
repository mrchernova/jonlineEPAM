/**
 * 11. Матрицу 10х20 заполнить случайными числами от 0 до 15.
 * Вывести на экран саму матрицу и номера строк, в которых число 5 встречается три и более раз
 */

package by.epam.jonline.module2.matrix11;

public class Matrix11 {

    public static void main(String[] args) {

        int n = 10;
        int m = 20;
        
        int[][] matrix = new int[n][m];

        initMatrix(matrix);
        printMatrix(matrix);

        System.out.println("Номера строк, в которых число 5 всчтречается три и более раз: ");
        C5ThreeAndMore(matrix);


    }

    public static void initMatrix(int[][] matrix) {

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * 16);
            }
        }
    }

    public static void printMatrix(int[][] matrix) {

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.format("%4s", matrix[i][j]);
            }
            System.out.println();
        }
    }

    public static void C5ThreeAndMore(int[][] matrix) {
      int q = 0;
        for (int i = 0; i < matrix.length; i++) {
            int k = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                
                if (matrix[i][j] == 5){
                    k++;
                }
            }
            if (k >= 3){
                // вывести номер строки
                System.out.print(i+1 + " ");
                q++;// счетчик были ли выводимые строки
            }
        }
        if (q == 0){
            System.out.println("Нет строк, подходящих к данному условию");
        }
    }
    

}
