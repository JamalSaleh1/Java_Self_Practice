package day05_practice_tasks;

public class Alphabet {

    public static void main(String[] args) {

        for (int i = 'A'; i <= 'E' ; i++) {
            for (int j = 'a'; j <='z' ; j++) {
                System.out.print(i);
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
