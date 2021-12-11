package controlstatements;

import java.util.Scanner;

public class PowerNo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter base: ");
        int base = scanner.nextInt();
        System.out.println("Enter exponent: ");
        int exponent = scanner.nextInt();
        int result = 1;
        while (exponent != 0){
            result = result * base;
            exponent --;
        }
        System.out.println("Result is "+result);
    }
}
