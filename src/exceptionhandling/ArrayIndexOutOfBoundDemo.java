package exceptionhandling;

import java.util.Scanner;

public class ArrayIndexOutOfBoundDemo {
    public static void main(String[] args) {
        int[] a = new int[5];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array elements");
        for (int i=0;i<a.length;i++){
            a[i] = scanner.nextInt();
        }
        try {
            System.out.println("in try");
            System.out.println(a[10]);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("in finally");
            scanner.close();
        }
        System.out.println("Normal flow");
    }
}
