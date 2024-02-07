package day09_practice_task;

import java.util.Arrays;

public class arrayElements {

    public static void main(String[] args) {

        int[] numbers = new int[100];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
    //            System.out.print(numbers[i] + " " );
        }
        System.out.println("\n");
        for (int numb : numbers) {
            System.out.print(numb + " ");
        }

        System.out.println("\n");

        int[] reversedNumbers = new int[numbers.length];

        for (int i = numbers.length - 1, j = 0; i >= 0; i--, j++) {
                reversedNumbers[j] = numbers[i];
        }

        for (int reversedNumber : reversedNumbers) {
            System.out.print(reversedNumber + " ");
        }

        System.out.println("\n");

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 5 == 0){
                System.out.print(numbers[i] + " ");
            }
        }




    }
}
