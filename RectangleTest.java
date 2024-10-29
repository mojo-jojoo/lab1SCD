/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab1scd;

/**
 *
 * @author se22f-106
 */
class Rectangle {
    private double length;
    private double width;

    // Default constructor
    public Rectangle() {
        this.length = 1.0;
        this.width = 1.0;
    }

    // Parameterized constructor
    public Rectangle(double length, double width) {
        setLength(length);
        setWidth(width);
    }

    // Getters and Setters
    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (isValidDimension(length)) {
            this.length = length;
        } else {
            System.out.println("Length must be a floating-point number greater than 0.0 and less than 20.0.");
        }
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (isValidDimension(width)) {
            this.width = width;
        } else {
            System.out.println("Width must be a floating-point number greater than 0.0 and less than 20.0.");
        }
    }

    // Method to validate dimensions
    private boolean isValidDimension(double dimension) {
        return dimension > 0.0 && dimension < 20.0;
    }

    // Method to calculate perimeter
    public double calculatePerimeter() {
        return 2 * (length + width);
    }

    // Method to calculate area
    public double calculateArea() {
        return length * width;
    }
}

// Test program
public class RectangleTest {
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle();
        System.out.println("Default Rectangle:");
        System.out.println("Length: " + rect1.getLength());
        System.out.println("Width: " + rect1.getWidth());
        System.out.println("Area: " + rect1.calculateArea());
        System.out.println("Perimeter: " + rect1.calculatePerimeter());

        // Testing with valid dimensions
        rect1.setLength(5.0);
        rect1.setWidth(3.0);
        System.out.println("\nUpdated Rectangle:");
        System.out.println("Length: " + rect1.getLength());
        System.out.println("Width: " + rect1.getWidth());
        System.out.println("Area: " + rect1.calculateArea());
        System.out.println("Perimeter: " + rect1.calculatePerimeter());

        // Testing with invalid dimensions
        rect1.setLength(25.0); // Invalid
        rect1.setWidth(-2.0);  // Invalid
    }
}
