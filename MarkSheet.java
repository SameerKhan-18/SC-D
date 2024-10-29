import java.util.Scanner;

public class MarkSheet {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Student details
        System.out.print("Enter Student Name: ");
        String studentName = scanner.nextLine();

        System.out.print("Enter Total Marks: ");
        int totalMarks = scanner.nextInt();

        System.out.print("Enter Obtained Marks: ");
        int obtainedMarks = scanner.nextInt();

        // Calculations
        double percentage = calculatePercentage(obtainedMarks, totalMarks);
        String grade = calculateGrade(percentage);
        double gpa = calculateGPA(percentage);

        // Output: Mark Sheet
        displayMarkSheet(studentName, totalMarks, obtainedMarks, percentage, grade, gpa);
        
        scanner.close();
    }

    // Method to calculate percentage
    private static double calculatePercentage(int obtained, int total) {
        if (total == 0) return 0; // Avoid division by zero
        return (double) obtained / total * 100;
    }

    // Method to determine grade based on percentage
    private static String calculateGrade(double percentage) {
        if (percentage >= 90) return "A+";
        else if (percentage >= 80) return "A";
        else if (percentage >= 70) return "B";
        else if (percentage >= 60) return "C";
        else if (percentage >= 50) return "D";
        else return "F";
    }

    // Method to calculate GPA
    private static double calculateGPA(double percentage) {
        return percentage / 20; // Simple conversion from percentage to GPA (assuming out of 5)
    }

    // Method to display the mark sheet
    private static void displayMarkSheet(String name, int total, int obtained, double percentage, String grade, double gpa) {
        System.out.println("\n--- Mark Sheet ---");
        System.out.printf("Student Name: %s%n", name);
        System.out.printf("Total Marks: %d%n", total);
        System.out.printf("Obtained Marks: %d%n", obtained);
        System.out.printf("Percentage: %.2f%%%n", percentage);
        System.out.printf("Grade: %s%n", grade);
        System.out.printf("GPA: %.2f%n", gpa);
        System.out.println("------------------");
    }
}
