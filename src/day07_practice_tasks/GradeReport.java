package day07_practice_tasks;

import java.util.Scanner;

public class GradeReport {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("enter your score:");
        double score = input.nextDouble();

        input.nextLine();

        if (score >= 90 && score <= 100){
            System.out.println('A');
        } else if (score >= 80 && score < 90 ) {
            System.out.println('B');
        }else if (score >= 70 && score < 80) {
            System.out.println('C');
        }else if (score >= 60 && score < 70){
            System.out.println('D');
        } else if (score < 60) {
            System.out.println('F');
        }else {
            System.out.println("Invalid score");
        }

        System.out.println("Your grade is " + score);

        input.close();










    }
}
