package day08_practice_tasks;

import java.util.Scanner;

public class CombineWords {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println(" Enter first word : " );
        String firstWord = input.next();

        System.out.println(" Enter the word : ");
        String secondWord = input.next();

        input.close();

        if (firstWord.length() > 0 && secondWord.length() > 0 &&
                firstWord.charAt(firstWord.length() - 1) == secondWord.charAt(0)) {
            // Print the combined words without the repeated character
            System.out.println(firstWord + secondWord.substring(1));
        } else {
            // Print the combined words as is
            System.out.println(firstWord + secondWord);
        }
    }
}
