package by.epam.jonline.Others;

public class Color {
    public static void main(String[] args) {

        
/*
        Scanner sc = new Scanner(System.in);


        System.out.println("Цвет 1");
        while ((sc.next() != "красный") || (sc.next() != "синий") || (sc.next() != "желтый")) {
            System.out.println("Белиберда! Нормально введите цвет");
            color1 = sc.next();
        }
        
        System.out.println("Цвет 2");
        color2 = sc.next();
        while ((sc.next() != "красный") || (sc.next() != "синий") || (sc.next() != "желтый")) {
            System.out.println("Белиберда! Нормально введите цвет");
            color2 = sc.next();
        }
*/

        String color1 = "красный";
        String color2 = "синий";


        if (color1 == "красный" & color2 == "красный") {
            System.out.println("красный остается");
        } else {
            if ((color1 == "красный" & color2 == "синий") || (color2 == "красный" & color1 == "синий")) {
                System.out.println("фиолетовый");
            } else {
                if ((color1 == "красный" & color2 == "желтый") || (color2 == "красный" & color1 == "желтый")) {
                    System.out.println("оранжевый");
                } else {
                    if (color1 == "синий" & color2 == "синий") {
                        System.out.println("синий остается");
                    } else {
                        if ((color1 == "синий" & color2 == "желтый") || (color2 == "синий" & color1 == "желтый")) {
                            System.out.println("зеленый");
                        } else {
                            if (color1 == "желтый" & color2 == "желтый") {
                                System.out.println("желтый остается");
                            } else {
                                System.out.println("херня какая-то");
                            }
                        }
                    }
                }
            }
        }
    }
}
