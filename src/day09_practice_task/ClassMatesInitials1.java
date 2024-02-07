package day09_practice_task;

import java.util.Arrays;

public class ClassMatesInitials1 {

    public static void main(String[] args) {

        //2.1 Create an array of strings named classmates.
        //2.2 Store full names of 10 classmates.
        String [] classmates = {"Jamal Saleh", "John Cena", "Michel Jordan", "Mike Smith", "Adam Apple",
                "Abe Lincoln", "Johnson Loud", "Smith Park", "Sam Lamp", "Zebra Lion"};
        String [] initials = new String[classmates.length];

        //2.3 Print the initials of each student's name in separate lines.
        for (int i = 0; i < classmates.length; i++) {
            String eachName = classmates[i];
            initials[i] = "\n" + eachName.charAt(0) + "." + eachName.charAt(eachName.lastIndexOf(" ")+ 1)+ ".";

        }
        System.out.println(Arrays.toString(initials));

    }

}
