package by.epam.jonline.Others.OOP;

public class Car {
    String color;
    String form;
    double engineV;
    double fuelConsumption; //fuel l for 100 km
    String id; // car number
    double fuelInTank; // how much fuel in car

    // fill the car
    // https://youtu.be/CHwzlHpp5CI?t=1483
    public void fillTank(int fuelV){
        fuelInTank = fuelInTank + fuelV;
    }

    // drive distance
    public void drive(double distance){
        fuelInTank = fuelInTank - distance / 100 * fuelConsumption;
    }
}
