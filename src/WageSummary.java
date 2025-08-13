import java.util.Scanner;

public class WageSummary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter employee name: ");
        String employeeName = scanner.nextLine();

        System.out.print("Enter hourly rate: ");
        double hourlyRate = scanner.nextDouble();

        System.out.print("Enter total hours worked this week: ");
        double hoursWorked = scanner.nextDouble();

        double grossWeeklyWage = hourlyRate * hoursWorked;
        double sssContribution = grossWeeklyWage * 0.10;
        double netWeeklyWage = grossWeeklyWage - sssContribution;

        System.out.println("\n---- Wage Summary ----");
        System.out.println("Employee: " + employeeName);
        System.out.println("Hourly Rate: ₱" + String.format("%.2f", hourlyRate));
        System.out.println("Hours Worked: " + (int)hoursWorked);
        System.out.println("Gross Weekly Wage: ₱" + String.format("%.2f", grossWeeklyWage));
        System.out.println("SSS Contribution (10%): ₱" + String.format("%.2f", sssContribution));
        System.out.println("-------------------------------------");
        System.out.println("Net Weekly Wage: ₱" + String.format("%.2f", netWeeklyWage));
    }
}
