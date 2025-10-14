package edu.cifo.view;

import java.util.Scanner;

public class CircleView {

    private Scanner scan;

    public CircleView() {
        scan = new Scanner(System.in);
    }

    public double requestRadius() {
        System.out.print("Enter the circle's radius: ");
        return scan.nextDouble();
    }

    public void displayResults(double perimeter, double area) {
        System.out.printf("Perimeter: %.2f%n", perimeter);
        System.out.printf("Area: %.2f%n", area);
    }

    public void displayMessage(String message) {
        System.out.println(message);
    }
}
