package starpattern;

import java.util.Scanner;

/**
 *   Pattern       *
 *               * *
 *             * * *
 *           * * * *
 */

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows ");
        int rows = scanner.nextInt();
        for (int i=1; i<=rows; i++)
        {
            for (int j=rows; j>i; j--)
            {
                System.out.print(" ");
            }
            for (int k=1; k<=i; k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        scanner.close();
    }

}
