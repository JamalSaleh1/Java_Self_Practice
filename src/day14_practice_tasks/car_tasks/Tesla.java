package day14_practice_tasks.car_tasks;

public class Tesla extends Car implements AutoPilot{

    public Tesla(String make, String model, int year, double price, String color) {
        super(make, model, year, price, color);
    }


    public void autoPark() {
        System.out.println(getMake() + " " + getModel() + " is parking itself");
    }


    public void selfDrive() {

        System.out.println(getMake() + " " + getModel() + " has no one in driver seat on street");
    }

    @Override
    public void start() {
        System.out.println(getMake() + " " + getModel() + " turned the battery on");

    }

    @Override
    public void drive() {
        System.out.println(getMake() + " " + getModel() + " drove 2 seconds after starting");

    }

    @Override
    public void autoPilot() {
        System.out.println(getMake() + " " + getModel() + " auto parked in the middle of highway.");
    }
}
