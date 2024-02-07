package day07_practice_tasks;

import java.util.Scanner;

public class Circle {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter radius of circle.");
        double radius = input.nextInt();

        input.nextLine();

        System.out.println("Area of circle is " + (3.14 * radius) * (radius) );

        System.out.println("Perimeter of circle is " + 2 * 3.14 * radius);

        input.close();

    }
}
