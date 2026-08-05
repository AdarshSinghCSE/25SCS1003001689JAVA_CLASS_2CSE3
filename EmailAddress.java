import java.util.Scanner;
public class EmailAddress {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter user full name: ");
        String fullName = scanner.nextLine();
        System.out.print("Enter your email address: ");
        String email = scanner.nextLine();
        System.out.println("\nYour email address is: " + email);
        System.out.println("\nYour full name is: " + fullName);
        scanner.close();
    }
}