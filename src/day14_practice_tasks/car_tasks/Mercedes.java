package day14_practice_tasks.car_tasks;

public class Mercedes extends Car implements AutoPark{

    public Mercedes(String make, String model, int year, double price, String color) {
        super(make, model, year, price, color);
    }

    @Override
    public void autoPark() {
        System.out.println(getMake() + " " + getModel() + " auto parked in the middle of highway.");
    }

    @Override
    public void start() {
        System.out.println(getMake() + " " + getModel() + " started up loudly");

    }

    @Override
    public void drive() {

        System.out.println(getMake() + " " + getModel() + " dropped the exhaust while turning");
    }
}