import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("===== Student Grade Calculator =====");
        System.out.print("Enter your marks (out of 100): ");
        int marks = sc.nextInt();

        if (marks >= 90) {
            System.out.println("Excellent! You got an A+");
        }
        if (marks >= 75 && marks < 90) {
            System.out.println("Very Good! You got an A");
        }
        if (marks >= 60 && marks < 75) {
            System.out.println("Good Job! You got a B");
        }
        if (marks >= 45 && marks < 60) {
            System.out.println("You passed with C grade");
        }
        if (marks < 45) {
            System.out.println("Sorry, you failed.");
        }

        System.out.println("===================================");
        sc.close();
    }
}
