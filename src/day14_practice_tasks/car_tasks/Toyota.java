package day14_practice_tasks.car_tasks;

public class Toyota extends Car{

    public Toyota(String make, String model, int year, double price, String color) {
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
