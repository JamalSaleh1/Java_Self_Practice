package day09_practice_task;

import java.util.Arrays;

public class ClassMatesInitials {

    public static void main(String[] args) {

        String[] classmates = {"Jamal Saleh", "John Cena", "Michel Jordan", "Mike Smith", "Adam Apple",
                "Abe Lincoln", "Johnson Loud", "Smith Park", "Sam Lamp", "Zebra Lion"};

        String[] initials = new String[classmates.length];

        for (int i = 0; i < classmates.length; i++) {
            String eachName = classmates[i];

            //  initials[i] = "\n" + eachName.charAt(0) + "." + eachName.charAt(eachName.lastIndexOf()+ ".");
        }

        System.out.println(Arrays.toString(initials));



    }
}
