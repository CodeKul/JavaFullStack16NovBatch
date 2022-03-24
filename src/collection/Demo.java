package collection;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class Demo {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("");
        String a[] = new String[5];
        a[0] = "";

        String b[] = {""};


       // System.out.println("lenght "+list.get(0).length());
        System.out.println("lenght "+b[0].length());
//        List<String> strings = new ArrayList<>();
//        strings.add("The patient should be informed of his therapeutic options.");
//        strings.add("It wouldn't be as if the lone astronaut would be completely by himself.");
//        strings.add("abc@gmail.com");
//        strings.add("phone 9280018281");
//
//        List<String> regex = new ArrayList<>();
//        regex.add(".*\\.$");
//        regex.add(".*\\d{10}.*");
//
//        strings.forEach(s -> {
//            regex.forEach(r ->{
//                if(Pattern.matches(r,s)){
//                    System.out.println("Regex "+(regex.indexOf(r)+1) + " matches String "+(strings.indexOf(s)+1));
//                }
//            });
//        });
    }
}
