package arrays;

import java.util.Scanner;

public class MatrixAddition2D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter no of rows:");
        int row = scanner.nextInt();
        System.out.println("Enter no of columns:");
        int column = scanner.nextInt();
        int m1[][] = new int[row][column];
        int m2[][] = new int[row][column];
        int res[][] = new int[row][column];
        System.out.println("Enter the elements of matrix1");
        for (int i=0;i<row;i++){
            for (int j=0;j<column;j++){
                m1[i][j] = scanner.nextInt();
                System.out.println();
            }
        }

        System.out.println("Enter the elements of matrix2");
        for (int i=0;i<row;i++){
            for (int j=0;j<column;j++){
                m2[i][j] = scanner.nextInt();
                System.out.println();
            }
        }

        for (int i= 0 ; i < row ; i++ ) {
            for (int j = 0; j < column; j++) {
                res[i][j] = m1[i][j] + m2[i][j];
            }
        }

        System.out.println("Sum of matrices:-");

        for ( int i= 0 ; i < row ; i++ ) {
            for (int j = 0; j < column; j++)
                System.out.print(res[i][j] + "\t");

            System.out.println();
        }
    }
}
