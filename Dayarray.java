import java.util.Scanner;

class Dayarray {
    public static void main(String args[]) {
        int[] numbers = {10, 15, 18, 20};
        System.out.println("Normal looping with numbers:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Index " + i + " has value " + numbers[i]);
        }

        int[] copies = {1, 2, 3, 4, 5};
        System.out.println("\nLooping with copies:");
        for (int i = 0; i < copies.length; i++) {
            System.out.println("ahahah " + copies[i]);
        }

        System.out.println("\nUsing for-each loop:");
        for (int value : copies) {
            System.out.println("Value: " + value);
        }

        int sum = 0, max = copies[0], min = copies[0];
        for (int n : copies) {
            sum += n;
            if (n > max) max = n;
            if (n < min) min = n;
        }
        System.out.println("\nSum = " + sum);
        System.out.println("Max = " + max);
        System.out.println("Min = " + min);

        int key = 3;
        boolean found = false;
        for (int i = 0; i < copies.length; i++) {
            if (copies[i] == key) {
                System.out.println("\nElement " + key + " found at index " + i);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("\nElement " + key + " not found");
        }

        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter size of array: ");
        int size = sc.nextInt();
        int[] userArr = new int[size];

        System.out.println("Enter " + size + " numbers:");
        for (int i = 0; i < size; i++) {
            userArr[i] = sc.nextInt();
        }

        System.out.println("\nYou entered:");
        for (int n : userArr) {
            System.out.print(n + " ");
        }
        System.out.println();
    }
}
