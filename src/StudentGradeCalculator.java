/*
CodeSoft Task02 StudentGradeCalculator
Input: Take marks obtained (out of 100) in each subject.
        Calculate Total Marks: Sum up the marks obtained in all subjects.
        Calculate Average Percentage: Divide the total marks by the total number of subjects to get the average percentage.
        Grade Calculation: Assign grades based on the average percentage achieved.
        Display Results: Show the total marks, average percentage, and the corresponding grade to the user
*/
import java.util.Scanner;
public class StudentGradeCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input from user
        System.out.println("Enter the number of subjects: ");
        int numOfSubjects = scanner.nextInt();

        int totalMarks = 0;
        for (int i = 1; i <= numOfSubjects; i++) {
            System.out.println("Enter marks for subject " + i + ": ");
            int marks = scanner.nextInt();
            totalMarks += marks;
        }

        // Calculate average percentage
        double averagePercentage = (double) totalMarks / numOfSubjects ;

        // Calculate grade
        String grade;
        if (averagePercentage >= 90) {
            grade = "A";
        } else if (averagePercentage >= 80) {
            grade = "B";
        } else if (averagePercentage >= 70) {
            grade = "C";
        } else if (averagePercentage >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }

        // Display results
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + averagePercentage + "%");
        System.out.println("Grade: " + grade);

        scanner.close();
    }
}



