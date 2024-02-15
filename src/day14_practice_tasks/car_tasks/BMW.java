package day14_practice_tasks.car_tasks;

public class BMW extends Car {


    public BMW(String make, String model, int year, double price, String color) {
        super(make, model, year, price, color);
    }

    @Override
    public void start() {
        System.out.println(getMake() + " is starting.");
    }

    @Override
    public void drive() {
        System.out.println(getMake() + " is driving");
    }
}
