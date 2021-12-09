package controlstatements;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        int a[] = {1,2, 3,4,5,6,7,8,9,10};
        int i = 0;
        int sum = 0;
        while (i<10){                   //i=0,1
            sum = sum + a[i];           //sum=3
            // or  sum += a[i];
            i++;
        }
        System.out.println("Sum = "+sum);

        int arr[] = new int[10];
        System.out.println("Enter nos ");
        Scanner scanner = new Scanner(System.in);
        for (i=0;i<arr.length;i++){
            arr[i] = scanner.nextInt();
        }
        int k = 0;
        sum = 0;
        while (k<arr.length){  //k 0,1,2
            sum = sum + arr[k];
            k++;
        }
        System.out.println("Sum = "+sum);
    }
}

// take 2 nos from user and 2nd no is power of 1st no
// swap 2 nos. a=10,b=20 --> a=20,b=10
//
