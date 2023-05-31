/**
 * Составить программу нахождения произведения квадратов первых 200 чисел
 */
package by.epam.jonline.module1.cycle4;

public class Cycle4 {
    public static void main(String[] args) {

        long a = 1;
       
        for (int i = 1; i <= 200; i++) {

            a = a * (i * i);
            
            if (a <= Long.MAX_VALUE & a > 0) {
                System.out.println(i+". " + a + " ");
            } else {
                System.out.println(i+". Переполнение типа long. Программа прервана");
                break;
            }
        }

    }
}

