package controlstatements;

import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. ");
        int no = sc.nextInt();
      //  int no = Integer.parseInt(args[0]);
        System.out.println("No is "+no);
        for (int i=1;i<=10;i++){
            System.out.println(no*i);
        }
        // infinite for loop
        for (;;){
            System.out.println("Hello");
        }
    }
}

// int i[] = {1...10};
//
// int even[];
// int odd[];
//