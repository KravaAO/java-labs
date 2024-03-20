package src;

import src.car.Car;

public class Main {
    public static void main(String[] args) {
        Car[] cars = new Car[10];

        cars[0] = new Car("AA1111AA", "John Doe");
        cars[1] = new Car("BA2222BB", "Jane Smith");
        cars[3] = new Car("AC3333EC", "Alice Johnson");

        for (Car car : cars) {
            if (car != null)
                System.out.println(car);
        }

        String searchedCarNumber = "AA1111AA";

        for (int i = 0; i < cars.length; i++) {
            if (cars[i] != null && cars[i].carNumber.equals(searchedCarNumber)) {
                System.out.println("Car found: " + cars[i]);
            }
        }

        for (int i = 0; i < cars.length; i++) {
            if (cars[i] != null && cars[i].carNumber.equals(searchedCarNumber)) {
                cars[i] = null;
            }
        }

        System.out.println("After removing the src.car:");
        for (Car car : cars) {
            if (car != null)
                System.out.println(car);
        }
    }
}
