package stringdemo;

public class StringImmutable {
    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 20;
        n1 = 50;
       String s1 = "Mumbai";
       String s2 = "Mumbai";
       s1 = "Pune";
        System.out.println(s1); //Pune
       s1.concat("123");
        System.out.println(s1); //Pune
        s1 = s1.concat("123");
        System.out.println(s1); //Pune123
    }
}
