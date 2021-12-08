package arrays;

import java.util.Scanner;

public class SimpleOneDArray {
    public static void main(String[] args) {
        int arr[];//declare
        arr = new int[5];// instantation
        int a[] = {10,20,30};
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);
        System.out.println(arr.length);
        //System.out.println(arr[5]);
         // throw Exception -- ArrayIndexOutOfBoundsException
        //for STring array
        String empName[] = {"A","B"};//
        String []names = new String[2];
        names[0] = "X";
        names[1] = "Y";
        System.out.println(names[0]); // X
        System.out.println(empName[1]);
        System.out.println(names);

        Scanner scanner = new Scanner(System.in);
    }
}
