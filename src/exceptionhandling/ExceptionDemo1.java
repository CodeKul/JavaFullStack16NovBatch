package exceptionhandling;

import java.io.FileInputStream;

public class ExceptionDemo1 {
    public static void main(String[] args) {
        //Unchecked Exception
        System.out.println(1);
        System.out.println(2);
        System.out.println(3);
       // System.out.println(10/0); //Arithmetic Exception
        System.out.println(4);
        System.out.println(5);
        String name = null; //null pointer exception
        System.out.println(name.length());

        //checked Exception
      //  Class.forName("com.mysql.jdbc.");//class Not Found exception
        //FileInputStream inputStream = new FileInputStream("abc.txt"); //io Exception

    }
}
