package day08_practice_tasks;

public class StartsWithX {

    public static void main(String[] args) {

        String str = "xcodex";

        char s1 = str.charAt(0);
        if(s1 == 'x')

        str = str.replaceFirst("x", "a");

        System.out.println(str);







    }
}
