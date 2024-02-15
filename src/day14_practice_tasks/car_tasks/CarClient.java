package day14_practice_tasks.car_tasks;

public class CarClient {

    public static void main(String[] args) {

        Car car1 = new Toyota("Toyota", "Camary", 2000, 20_000,"Black");
        System.out.println(car1);
        car1.start();
        car1.drive();


        Car car2 = new Honda("Honda","Pilot", 2004, 50_000, "Black" );
        System.out.println(car2);
        car2.start();
        car2.drive();

        Car car3 = new BMW("BMW", "M5", 2024,150_000, "Grey");
        System.out.println(car3);
        car3.start();
        car3.drive();

        Audi audi = new Audi("Audi", "A6", 2018, 17_000, "Black");
        System.out.println(audi);

        audi.start();
        audi.autoPark();
        audi.drive();

        System.out.println("-----------------------");

        Mercedes mercedes = new Mercedes("Mercedes","AMG C63", 2015, 30_000, "White");
        System.out.println(mercedes);

        mercedes.start();
        mercedes.autoPark();
        mercedes.drive();

        System.out.println("------------------------------");

        Tesla tesla = new Tesla("Tesla", "X", 2022, 38_000, "Red");
        System.out.println(tesla);
        tesla.start();
        tesla.drive();
        tesla.selfDrive();
        tesla.autoPark();

        System.out.println("---------------------------");

        Nio nio = new Nio("Nio", "6", 2017, 20_000, "White");

        System.out.println(nio);

        nio.start();
        nio.drive();
        nio.autoPark();
        nio.selfDrive();


        System.out.println("---------------------------");
        CydeoCar cydeoCar = new CydeoCar("Cydeo", "Car", 1965, 1_000_000_000, "Invisible" );
        System.out.println(cydeoCar);
        cydeoCar.drive();
        cydeoCar.start();
        cydeoCar.autoPark();
        cydeoCar.selfDrive();
        cydeoCar.fly();
    }
}
