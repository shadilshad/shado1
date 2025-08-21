import java.util.Scanner;
class input{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Name: ");
        String name = sc.nextLine();
        System.out.println("WOW! Such a beautiful name, " + name);

        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        sc.nextLine();//
        System.out.println("OW, So, You are " + age + " Years old!.");

        System.out.println("Where do you study?");
        String college = sc.nextLine();
        System.out.println("AH! " + college + " Such a great college!");


        System.out.println("What's your CGPA?");
        Double CGPA = sc.nextDouble();
        sc.nextLine(); //
        System.out.println("WOW! " + CGPA + " Must be a nerd");

        System.out.println("Are'nt I a true person?");
        Boolean Ow = sc.nextBoolean();
        sc.nextLine(); //
        System.out.println("Hmm, I did not expect that. You really said that i am a " + Ow + " Person:)");

    }
}