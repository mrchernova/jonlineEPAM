package by.epam.jonline.Others;

public class ArraysLec {
    public static void main(String[] args) {
        int number = 10;
        char ch = 'a';

        String s = "Hola";                          // эти строки идентичны. Просто разработчики Java первой записью упростили нам работу
        String s1 = new String("Hola");
        // new - создает объект класса
        // String - это ссылочный тип данных
        // Массив - ссылочный тип даннтых

        int[] numbers = new int[5];
        System.out.println(numbers[0]);     // 0 1 2 3 4 
        //numbers[0] = 10;
        //numbers[1] = 20;

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i * 10;
            System.out.println(numbers[i]);
        }

    }
}
