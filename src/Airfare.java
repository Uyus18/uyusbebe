import java.util.Scanner;

public class Airfare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter distance (km): ");
        double distance = scanner.nextDouble();

        System.out.print("Enter class (1 for Economy, 2 for Business): ");
        int classType = scanner.nextInt();

        
        double baseFarePerKm = 0;

        
        switch (classType) {
            case 1:
                baseFarePerKm = 250;
                break;
            case 2:
                baseFarePerKm = 500;
                break;
            default:
                System.out.println("Invalid class selection.");
                return;
        }

        
        double totalFare = distance * baseFarePerKm;

        
        if (distance > 1000) {
            totalFare -= totalFare * 0.10;
        }

        // Output: Total fare
        System.out.println("\n//INSTANCE");
        System.out.println("Input:");
        System.out.println("Distance (km): " + (int)distance);
        System.out.println("Class: " + classType);
        System.out.println("Output:");
        System.out.println("Total fare: " + String.format("%.2f", totalFare));
    }
}
