import java.util.Scanner;

public class NumberCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = input.nextInt();

        if (num == 0) {
            System.out.println("Inputted number Zero");
        } else if (num > 0) {
            System.out.println(num + " is a positive number");
            if (num % 2 == 0) {
                System.out.println("Inputted number is even");
            } else {
                System.out.println("Inputted number is odd");
            }
        } else {
            System.out.println(num + " is a negative number");
            if (num % 2 == 0) {
                System.out.println("Inputted number is even");
            } else {
                System.out.println("Inputted number is odd");
            }
        }

        input.close();
    }
}
