package by.epam.jonline.Others.OOP;

public class MainClass {
    public static void main(String[] args) {
        // create object
        // https://youtu.be/CHwzlHpp5CI?t=2406
        Car myCar = new Car();
        myCar.fuelInTank = 10;
        myCar.color = "gray";
        Car myBroCar = new Car();

        myCar.fillTank(20);

        System.out.println("current fuel level = " + myCar.fuelInTank);
        System.out.println("color car = " + myCar.color);
    }
}
