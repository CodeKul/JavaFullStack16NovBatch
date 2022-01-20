package stringdemo;

import java.util.Arrays;

public class StringDemo {
    public static void main(String[] args) {
        String s1 = "codekul";
        System.out.println(s1.toUpperCase());
        System.out.println(s1.substring(1));
        System.out.println(s1.substring(1,3));

        String s2 = "Codekul,Kothrud,Pune,India";
        String[] s3 = s2.split(",");
        System.out.println(Arrays.toString(s3));
        System.out.println(s3[0]);
        System.out.println(s3[2]);

    }
}

/***Homework
 * Reverse given string.
 */