import java.util.Scanner;

public class ArrayProcessing {
    private int[] numbers;
    private Scanner scanner;

    // Constructor
    public ArrayProcessing() {
        numbers = new int[5];
        scanner = new Scanner(System.in);
        getNumbers();
        processNumbers();
    }

    //  to get numbers from the user
    public void getNumbers() {
        System.out.println("Enter five integers:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }
    }

    // to print the menu and get choice from user
    public int printMenu() {
        System.out.println("Choose an option to perform:");
        System.out.println("1) Add numbers");
        System.out.println("2) Multiply numbers");
        System.out.println("3) Print numbers");
        System.out.println("4) Print number in reverse");
        System.out.print("Enter your choice: ");
        return scanner.nextInt();
    }

    //  to process user choice and run each method to check it
    public void processNumbers() {
        boolean continueProcessing = true;
        while (continueProcessing) {
            int choice = printMenu();
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
                    System.out.println("Invalid option. Please choose again.");
            }
            continueProcessing = again();
        }
        System.out.println("Exiting program.");
    }

    // Method to add numbers
    public void add() {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("Sum of numbers: " + sum);
    }

    // Method to multiply numbers
    public void mult() {
        int product = 1;
        for (int num : numbers) {
            product *= num;
        }
        System.out.println("Product of numbers: " + product);
    }

    // Method to print numbers
    public void print() {
        System.out.println("Numbers:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Method to reverse order of numbers and print it
    public void reverse() {
        System.out.println("Numbers in reverse order:");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }

    // Method to choose another option or exit
    public boolean again() {
        System.out.print("Enter 1 to choose another option, or 2 to exit: ");
        int choice = scanner.nextInt();
        return choice == 1;
    }

    public static void main(String[] args) {
        ArrayProcessing arrayProcessing = new ArrayProcessing();
    }
}
