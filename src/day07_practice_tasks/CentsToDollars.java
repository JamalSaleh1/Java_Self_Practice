package day07_practice_tasks;

import java.util.Scanner;

public class CentsToDollars {

        public static void main(String[] args) {

        Scanner result = new Scanner(System.in);
        System.out.println("Enter the cents:");
        int cents = result.nextInt();

        int remaining = cents % 100;
        int dollars = cents / 100;

        result.close();

        System.out.println(cents  +" cents is equal to " + dollars + " dollars and " + remaining + " cents");
    }
}






