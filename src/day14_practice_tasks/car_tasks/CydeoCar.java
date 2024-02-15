package day14_practice_tasks.car_tasks;

public class CydeoCar extends Car implements AutoPilot, Flyable, AutoPark{

    public CydeoCar(String make, String model, int year, double price, String color) {
        super(make, model, year, price, color);
    }

    @Override
    public void autoPark() {
        System.out.println(getMake() + " " + getModel() + " parked upside by itself");
    }


    public void selfDrive() {

        System.out.println(getMake() + " " + getModel() + " can drive by itself up buildings.");

    }

    @Override
    public void start() {

        System.out.println(getMake() + " " + getModel() + " started after pouring water on it");
    }

    @Override
    public void drive() {

        System.out.println(getMake() + " " + getModel() + " drives over 400 MPH");
    }


    public void fly() {

        System.out.println(getMake() + " " + getModel() + " can fly when given Red Bull");
    }

    @Override
    public void autoPilot() {
        System.out.println(getMake() + " " + getModel() + " auto parked in the middle of highway.");
    }

    @Override
    public void Fly() {

    }
}

