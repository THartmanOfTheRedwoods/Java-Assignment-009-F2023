/**
 *
 * @author Trevor Hartman
 * @author Cameron Meng
 *
 * @since Version 1.0
 *
 */
import java.util.Scanner;

public class ArrayProcessing {
    private int[] numbersArray;
    private Scanner scanner;

    // Constructor
    public ArrayProcessing() {
        numbersArray = new int[5];
        scanner = new Scanner(System.in);
        getNumbers();
        processNumbers();
    }

    // Method to get numbers from the user
    public void getNumbers() {
        System.out.println("Enter five integers:");
        for (int i = 0; i < numbersArray.length; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbersArray[i] = scanner.nextInt();
        }
    }

    // Method to process numbers based on user input
    public void processNumbers() {
        do {
            printMenu();
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    add();
                    break;
                case 2:
                    mult();
                    break;
                case 3:
                    print();
                    break;
                case 4:
                    reverse();
                    break;
                default:
                    System.out.println("Invalid choice. Please choose again.");
            }
        } while (again());
    }

    // Method to print menu and get user choice
    public int printMenu() {
        System.out.println("\nChoose an option to perform:");
        System.out.println("1) Add numbers");
        System.out.println("2) Multiply numbers");
        System.out.println("3) Print numbers");
        System.out.println("4) Print numbers in reverse");
        System.out.print("Enter your choice: ");
        return scanner.nextInt();
    }

    // Method to perform addition
    public void add() {
        int sum = 0;
        for (int num : numbersArray) {
            sum += num;
        }
        System.out.println("Sum of numbers: " + sum);
    }

    // Method to perform multiplication
    public void mult() {
        int product = 1;
        for (int num : numbersArray) {
            product *= num;
        }
        System.out.println("Product of numbers: " + product);
    }

    // Method to print numbers
    public void print() {
        System.out.println("Numbers in the array:");
        for (int num : numbersArray) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Method to print numbers in reverse order
    public void reverse() {
        System.out.println("Numbers in reverse order:");
        for (int i = numbersArray.length - 1; i >= 0; i--) {
            System.out.print(numbersArray[i] + " ");
        }
        System.out.println();
    }

    // Method to prompt the user to choose another option or exit
    public boolean again() {
        System.out.print("\nEnter 1 to choose another option or 2 to exit: ");
        int choice = scanner.nextInt();
        return choice == 1;
    }
    public static void main(String[] args) {
        ArrayProcessing arrayProcessing = new ArrayProcessing();
    }
}