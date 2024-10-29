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
import java.util.Scanner;

class Student {
    private String name;
    private double totalMarks;
    private double obtainedMarks;

    public Student(String name, double totalMarks, double obtainedMarks) {
        this.name = name;
        this.totalMarks = totalMarks;
        this.obtainedMarks = obtainedMarks;
    }

    public String getName() {
        return name;
    }

    public double getTotalMarks() {
        return totalMarks;
    }

    public double getObtainedMarks() {
        return obtainedMarks;
    }

    public double calculatePercentage() {
        return (obtainedMarks / totalMarks) * 100;
    }

    public String calculateGrade() {
        double percentage = calculatePercentage();
        if (percentage >= 90) {
            return "A+";
        } else if (percentage >= 80) {
            return "A";
        } else if (percentage >= 70) {
            return "B";
        } else if (percentage >= 60) {
            return "C";
        } else if (percentage >= 50) {
            return "D";
        } else {
            return "F";
        }
    }

    public double calculateGPA() {
        double percentage = calculatePercentage();
        if (percentage >= 90) {
            return 4.0;
        } else if (percentage >= 80) {
            return 3.7;
        } else if (percentage >= 70) {
            return 3.0;
        } else if (percentage >= 60) {
            return 2.7;
        } else if (percentage >= 50) {
            return 2.0;
        } else {
            return 0.0;
        }
    }
}

public class Lab1SCD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter Student Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Total Marks: ");
        double totalMarks = scanner.nextDouble();

        System.out.print("Enter Obtained Marks: ");
        double obtainedMarks = scanner.nextDouble();

        Student student = new Student(name, totalMarks, obtainedMarks);
        
        // Displaying the results
        System.out.println("\n--- Mark Sheet ---");
        System.out.printf("Student Name: %s%n", student.getName());
        System.out.printf("Total Marks: %.2f%n", student.getTotalMarks());
        System.out.printf("Obtained Marks: %.2f%n", student.getObtainedMarks());
        System.out.printf("Percentage: %.2f%%%n", student.calculatePercentage());
        System.out.printf("Grade: %s%n", student.calculateGrade());
        System.out.printf("GPA: %.2f%n", student.calculateGPA());

        scanner.close();
    }
}
