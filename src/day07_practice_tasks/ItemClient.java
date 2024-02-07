package day07_practice_tasks;

public class ItemClient {

    public static void main(String[] args) {

        Item item = new Item();

        item.itemName = "Computer";
        item.unitPrice = 5_000;
        item.quantity = 5;

        System.out.println("Item Name: " + item.itemName);
        System.out.println("Item Price: " + item.unitPrice);
        System.out.println("Item Quantity: " + item.quantity);

        item.calcCost();

        System.out.println(item);
    }
}
