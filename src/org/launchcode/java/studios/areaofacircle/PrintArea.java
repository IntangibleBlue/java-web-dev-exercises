package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class PrintArea {
    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a radius:");
        Double radius = in.nextDouble();
        if ( radius.isNaN() ){
            System.err.println("You didn't enter a number. Please enter a valid number.");
        } else if ( radius < 0 ) {
            System.err.println("You entered a negative number!");
            return;
        }

        Double areaOfCircle = Circle.getArea(radius);
        System.out.println("The aea of a circle of radius " + radius + " is: " + areaOfCircle + ".");

    }
}
