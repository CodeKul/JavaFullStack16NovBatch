package assignment;

public class Divisible {
    public static void main(String[] args) {
        int no = 15;
        if (no % 3 == 0 && no % 5 == 0)
            System.out.println("Divisible by 5 & 3");
        else if (no % 3 == 0)
            System.out.println("Divisible by 3 only");
        else if (no % 5 == 0)
            System.out.println("Divisible by 5 only");
        else
            System.out.println("Non Divisible by 5 & 3");
    }

}
