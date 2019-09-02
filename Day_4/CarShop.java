package Assignment_4;

import java.util.ArrayList;

public class CarShop {
    public static void main(String[] args) {
        var carArrayList = new ArrayList<Car>();

        var car_01 = new Car("Nike", "Sedan", 210);
        var car_02 = new Car("Omi", "Hatchback", 150);
        var car_03 = new Car("Suraj", "SUV", 180);

        carArrayList.add(car_01);
        carArrayList.add(car_02);
        carArrayList.add(car_03);

        System.out.println("Number of cars in Carshop= " + carArrayList.size());

        car_01.printInfo();
    }
}
