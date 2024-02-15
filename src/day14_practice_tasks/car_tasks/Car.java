package day14_practice_tasks.car_tasks;

public abstract class Car {

    private final String make;
    private final String model;
    private final int year;
    private double price;
    private String color;

    public Car(String make, String model, int year, double price, String color) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
        this.color = color;
    }

    public String getMake() {
        if (make == null || make.isEmpty() || make.isBlank()){
            System.err.println("Enter valid make");
            System.exit(1);
        }
        return make;
    }

    public String getModel() {
        if (model == null || model.isEmpty() || model.isBlank()) {
            System.err.println("Enter valid Model");
            System.exit(1);
        }
        return model;
    }

    public int getYear() {
        if (year < 1886 && year >= 2024) {
            System.err.println("Enter valid Year (1886 t0 2024");
            System.exit(1);
        }
        return year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price <= 0){
            System.err.println("Value must be over 0.");
            System.exit(1);
        }
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if(color == null || color.isBlank() || color.isEmpty()){
            System.err.println("Color cannot be blank or null.");
            System.exit(1);
        }
        this.color = color;
    }

    public abstract void start();
    public abstract void drive();

    public void stop(){
        System.out.println(make + "is stopping");
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}


