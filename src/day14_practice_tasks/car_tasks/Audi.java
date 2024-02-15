package day14_practice_tasks.car_tasks;

public class Audi extends Car implements AutoPark{

    public Audi(String make, String model, int year, double price, String color) {
        super(make, model, year, price, color);
    }

    @Override
    public void autoPark() {
        System.out.println(getMake() + " " + getModel() + " hit the car next to it while auto parking.");
    }

    @Override
    public void start() {
        System.out.println(getMake() + " " + getModel() + " took a minute to start.");
    }

    @Override
    public void drive() {
        System.out.println(getMake() + " " + getModel() + " is speeding on the highway." );
    }
}
