package assignment;

import java.util.Scanner;

public class SwapNo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter No1:");
        int no1 = scanner.nextInt();

        System.out.println("Enter No2:");
        int no2 = scanner.nextInt();

        int temp;
        System.out.println("B4 swapping numbers: "+no1 +"  "+ no2);
        if (no1!=no2){
            temp = no1;
            no1 = no2;
            no2 = temp;
        }
        System.out.println("After swapping: "+no1 +"   " + no2);
    }

}
