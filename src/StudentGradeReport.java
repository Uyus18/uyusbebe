import java.util.Scanner;

public class StudentGradeReport {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        System.out.print("Enter name: ");
        String name = scanner.nextLine();

        System.out.print("Enter marks in Science: ");
        int science = scanner.nextInt();

        System.out.print("Enter marks in History: ");
        int history = scanner.nextInt();

        System.out.print("Enter marks in Math: ");
        int math = scanner.nextInt();

        System.out.print("Enter marks in Soc: ");
        int soc = scanner.nextInt();

        System.out.print("Enter marks in Arts: ");
        int arts = scanner.nextInt();

        // Processing
        int totalMarks = science + history + math + soc + arts;
        double percentage = totalMarks / 5.0;

        // Determine Remarks
        String remarks;
        if (percentage < 70) {
            remarks = "Fail";
        } else if (percentage <= 75) {
            remarks = "Poor";
        } else if (percentage <= 80) {
            remarks = "Fair";
        } else if (percentage <= 85) {
            remarks = "Good";
        } else if (percentage <= 90) {
            remarks = "Very Good";
        } else {
            remarks = "Excellent";
        }

        // Output
        System.out.println("\nTotal Marks: " + totalMarks);
        System.out.printf("Total percentage: %.2f\n", percentage);
        System.out.println("Remarks: " + remarks);

        if (percentage >= 70) {
            System.out.println("\nCongrats " + name + " you Passed.");
        } else {
            System.out.println("\nTry Again.");
        }

        // Criteria Display
        System.out.println("\n//criteria");
        System.out.println("Fail       - Below 70");
        System.out.println("Poor       - 71 to 75");
        System.out.println("Fair       - 76 to 80");
        System.out.println("Good       - 81 to 85");
        System.out.println("Very Good  - 86 to 90");
        System.out.println("Excellent  - 91 to 100");

        scanner.close();
    }
}