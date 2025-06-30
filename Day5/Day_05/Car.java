package day5;

public class Car {
    static int numWheels = 4;
    String color;
    String model;
    String brand;
    int year;
    double mileage;
    public Car(String color, String model, String brand, int year, double mileage) {
        this.color = color;
        this.model = model;
        this.brand = brand;
        this.year = year;
        this.mileage = mileage;
    }
    public void startEngine() {
        System.out.println("Engine started.");
    }
    public void drive() {
        System.out.println("The car is driving.");
    }
    public void stopEngine() {
        System.out.println("Engine stopped.");
    }
    public static void main(String[] args) {
        Car myCar = new Car("White", "Hydai", "Maruthi", 2020, 90000);
        System.out.println("Brand: " + myCar.brand);
        System.out.println("Model: " + myCar.model);
        System.out.println("Year: " + myCar.year);
        System.out.println("Color: " + myCar.color);
        System.out.println("Mileage: " + myCar.mileage);
        System.out.println("Wheels: " + Car.numWheels);
        myCar.startEngine();
        myCar.drive();
        myCar.stopEngine();
    }
}

