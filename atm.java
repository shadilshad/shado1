import java.util.Scanner;

public class atm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int balance = 5000;
        System.out.println("===== Welcome to Java ATM =====");
        System.out.print("Enter your PIN: ");
        int pin = sc.nextInt();

        if (pin == 1234) {
            System.out.println("Login Successful!");
            System.out.println("1. Check Balance");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Deposit Money");
            System.out.println("Choose an option: ");
            int choice = sc.nextInt();

            if (choice == 1) {
                System.out.println("Your balance is: " + balance);
            } 
            else if (choice == 2) {
                System.out.print("Enter amount to withdraw: ");
                int withdraw = sc.nextInt();
                if (withdraw <= balance) {
                    balance -= withdraw;
                    System.out.println("Withdraw successful! New balance: " + balance);
                } else {
                    System.out.println("Insufficient balance!");
                }
            } 
            else if (choice == 3) {
                System.out.print("Enter amount to deposit: ");
                int deposit = sc.nextInt();
                balance += deposit;
                System.out.println("Deposit successful! New balance: " + balance);
            } 
            else {
                System.out.println("Invalid choice!");
            }
        } else {
            System.out.println("Incorrect PIN. Access Denied!");
        }

        System.out.println("===== Thank You for Using Java ATM =====");
        sc.close();
    }
}
