package day08_practice_tasks;

import java.util.Scanner;

public class FormatFirstandLastNames {

        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);

            System.out.println("Enter your first name:");
            String firstName = input.next();

            System.out.println("Enter your last name:");
            String lastName = input.next();

            firstName = format(firstName);
            lastName = format(lastName);

            String fullName = firstName + " " + lastName;

            System.out.println(fullName);
            input.close();
        }

        public static String format(String name){
            return name.substring(0,1).toUpperCase() + name.substring(1).toLowerCase();
        }

    }
