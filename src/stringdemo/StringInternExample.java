package stringdemo;

public class StringInternExample {
    public static void main(String[] args) {
        String s1 = "Codekul"; //
        String s2 = new String("Codekul");

        System.out.println(s1==s2);//false
        s2 = s2.intern();
        System.out.println(s1 == s2);//true


    }
}
