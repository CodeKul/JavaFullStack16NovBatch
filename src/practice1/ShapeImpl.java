package practice1;

import java.util.Scanner;

public class ShapeImpl {
    public static void main(String[] args) {
        int ch;
        do {
            System.out.println("1.Triangle");
            System.out.println("2.Square");
            System.out.println("3.Circle");
            System.out.println("4.Rectangle");
            System.out.println("5.Exit");
            System.out.println("Enter your choice");
            Scanner scanner = new Scanner(System.in);
            ch = scanner.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("Enter breadth & height: ");
                    int breadth = scanner.nextInt();
                    int height = scanner.nextInt();
                    Shape shape = new Triangle(breadth, height);
                    System.out.println("Area of triangle is " + shape.calculateArea());
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Wrong choice");
            }
        } while (ch < 6);
    }
}
