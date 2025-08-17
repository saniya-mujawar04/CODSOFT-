import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Ask total subjects
        System.out.print("How many subjects do you have? ");
        int subjects = sc.nextInt();

        int totalMarks = 0;

        // Step 2: Take input of marks for each subject
        for (int i = 1; i <= subjects; i++) {
            System.out.print("Enter marks for subject " + i + " (0-100): ");
            int marks = sc.nextInt();

            // Validation: marks should be 0 to 100
            if (marks < 0 || marks > 100) {
                System.out.println("Invalid marks! Please enter between 0 and 100.");
                i--; // repeat same subject input
                continue;
            }

            totalMarks += marks;
        }

        // Step 3: Calculate average percentage
        double percentage = (double) totalMarks / subjects;

        // Step 4: Decide grade
        String grade;   // make sure it's String, not char
        if (percentage >= 90) {
            grade = "A";
        } else if (percentage >= 75) {
            grade = "B";
        } else if (percentage >= 60) {
            grade = "C";
        } else if (percentage >= 40) {
            grade = "D";
        } else {
            grade = "F";
        }

        // Step 5: Display result
        System.out.println("\n--- Final Result ---");
        System.out.println("Total Marks: " + totalMarks + " out of " + (subjects * 100));
        System.out.println("Average Percentage: " + percentage + "%");
        System.out.println("Grade: " + grade);

        sc.close(); // optional: can remove if IDE gives warning
    }
}


