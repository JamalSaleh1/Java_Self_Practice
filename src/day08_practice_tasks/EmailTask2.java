package day08_practice_tasks;

import java.util.Scanner;

public class EmailTask2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your email : ");
        String email = input.nextLine();
        input.close();

        if (email.contains("_") && email.contains("@") && email.contains(".")) {
            int u_nderscore = email.indexOf("_");
            int at = email.indexOf("@");
            int domain = email.indexOf(".");
            if (u_nderscore < at && at < domain) {
                String Firstname = email.substring(0, 1).toUpperCase() + email.substring(1, u_nderscore).toLowerCase();
                String Lastname = email.substring(u_nderscore + 1, u_nderscore + 2).toUpperCase() + email.substring(u_nderscore + 2, at).toLowerCase();
                String Domain = email.substring(at + 1, at + 2).toUpperCase() + email.substring(at + 2, domain).toLowerCase();

                System.out.println("Firstname : " + Firstname);
                System.out.println("Lastname : " + Lastname);
                System.out.println("Domain : " + Domain);

            } else {
                System.out.println("pls re-enter");
            }


        }
    }
}
