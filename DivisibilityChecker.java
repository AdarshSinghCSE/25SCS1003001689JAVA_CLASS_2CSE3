import java.util.Scanner;

public class DivisibilityChecker {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num % 5 == 0) {
            System.out.println("The number is divisible by 5.");

            if (num % 10 == 0) {
                System.out.println("The number is also divisible by 10.");
            } else {
                System.out.println("The number is not divisible by 10.");
            }

        } else {
            System.out.println("The number is not divisible by 5.");
        }

        sc.close();
    }
}