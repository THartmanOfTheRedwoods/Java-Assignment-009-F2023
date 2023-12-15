import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;
public class ArrayProcessing {
    private static int[] intArray = new int[5];
    private static Scanner scan = new Scanner(System.in);

    public static void getNumbers() {
        for (int i = 0; i < intArray.length; i++) {
            System.out.println("Enter an integer to add it to the list: ");
            int userInput = scan.nextInt();
            intArray[i] = userInput;
        }
    }

    public static void processNumbers() {
        int choice = printMenu();
        if (choice == 1) {
            add();
        } else if (choice == 2) {
            mult();
        } else if (choice == 3) {
            print();
        } else if (choice == 4) {
            reverse();
        }
    }

    public static int printMenu() {
        System.out.printf("Choose an option to perform: %n 1) Add numbers %n 2) Multiply numbers %n 3) Print numbers %n 4) Print numbers in reverse %n");
        return scan.nextInt();
    }

    public static void add() {
        int sum = 0;
        for (int i = 0; i < intArray.length; i++) {
            sum = sum + intArray[i];
        }
        System.out.println("Sum of integers in array: " + sum);
    }

    public static void mult() {
        int ans = 1;
        for (int i = 0; i < intArray.length; i++) {
            ans = ans * intArray[i];
        }
        System.out.println("Integers in array multiplied together: " + ans);
    }

    public static void print() {
        System.out.println("Integers in array: ");
        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }

    public static void reverse() {
        System.out.println("Integers in array, reverse order: ");
        for (int i = 4; i < intArray.length; i--) {
            System.out.println(intArray[i]);
        }
    }

    public static boolean again() {
        System.out.println("Type 1 to choose another option, or 2 to quit: ");
        int choice = scan.nextInt();
        if (choice == 1) {
           return true;
        } else {
           return false;
        }
    }

    public static void main(String[] args) {
        getNumbers();
        while (true) {
            processNumbers();
            boolean again = again();
            if (again = true) {
                continue;
            } else if (again = false) {
                break;
            }
        }
    }
}
