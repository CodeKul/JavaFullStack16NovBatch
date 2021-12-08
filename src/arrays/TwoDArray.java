package arrays;

import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
        int a[][] = new int[2][2];
        Scanner scanner = new Scanner(System.in);
        int no;
        for (int i =0;i< 2;i++){
            for (int j=0;j<2;j++){
                System.out.println("Enter value");
                a[i][j]= scanner.nextInt();
            }
        }
        for (int i =0;i< 2;i++){
            for (int j=0;j<2;j++){
                System.out.print(a[i][j]);
                System.out.print("\t");
            }
            System.out.println();
        }
    }
}
//  *
/// * *
//  * * *