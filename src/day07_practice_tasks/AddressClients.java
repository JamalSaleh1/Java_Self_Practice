package day07_practice_tasks;

public class AddressClients {

    public static void main(String[] args) {


        Address address = new Address();

        address.buildingNumber = 7925;
        address.street = "Jones Branch Dr";
        address.city = "McLean";
        address.state = "Va";
        address.zipCode = "22012";

        System.out.print(address.buildingNumber + " ");
        System.out.println(address.street);
        System.out.print(address.city + " ");
        System.out.print(address.state + "," + " ");
        System.out.println(address.zipCode);




    }
}
