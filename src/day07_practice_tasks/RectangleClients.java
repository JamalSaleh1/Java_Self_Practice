package day07_practice_tasks;

public class RectangleClients {

    public static void main(String[] args) {


        Rectangle rectangle1 = new Rectangle();

        rectangle1.length = 32;
        rectangle1.width = 20;

        System.out.println("Length: " + rectangle1.length);
        System.out.println("Width " + rectangle1.width);

        rectangle1.calculateArea();
        rectangle1.calculatePerimeter();

        System.out.println(rectangle1);





    }
}
