package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Select the type of geometric shape: ");
        System.out.println("1.Circle");
        System.out.println("2.Square");
        System.out.println("3.RightTriangle");

        int input = sc.nextInt();
        switch (input) {
            case 1:
                System.out.println("Enter the radius of the circle: ");
                double radius = sc.nextDouble();
                Area circle = new Circle(radius);
                circle.calculateArea();
                break;
            case 2:
                System.out.println("Enter the length of the side of the square: ");
                double lenght = sc.nextDouble();
                Area square = new Square(lenght);
                square.calculateArea();
                break;
            case 3:
                System.out.println("Enter the lengths of the two cathets: ");
                double lenght1 = sc.nextDouble();
                double lenght2 = sc.nextDouble();
                Area triangle = new RightTriangle(lenght1, lenght2);
                triangle.calculateArea();
                break;

        }
    }
}