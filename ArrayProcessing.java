import java.util.Scanner;

public class ArrayProcessing {
    private int[] numbers;
    private Scanner scanner;


    public ArrayProcessing() {
        numbers = new int[5];
        scanner = new Scanner(System.in);
        getNumbers();
        processNumbers();
    }


    public void getNumbers() {
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter integer #" + (i + 1) + ": ");

            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter an integer.");
                scanner.next();
                System.out.print("Enter integer #" + (i + 1) + ": ");
            }

            numbers[i] = scanner.nextInt();
        }
    }


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
                    System.out.println("Invalid choice. Please choose a valid option.");
            }

            continueProcessing = again();
        }

        scanner.close();
    }

    public int printMenu() {
        System.out.println("Choose an option to perform:");
        System.out.println("1) Add numbers");
        System.out.println("2) Multiply numbers");
        System.out.println("3) Print numbers");
        System.out.println("4) Print number in reverse");

        System.out.print("Enter your choice: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter a number.");
            scanner.next();
            System.out.print("Enter your choice: ");
        }

        return scanner.nextInt();
    }

    public void add() {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("Sum of numbers: " + sum);
    }

    public void mult() {
        int product = 1;
        for (int num : numbers) {
            product *= num;
        }
        System.out.println("Product of numbers: " + product);
    }

    public void print() {
        System.out.println("Numbers:");
        for (int num : numbers) {
            System.out.println(num);
        }
    }

    public void reverse() {
        System.out.println("Numbers in reverse order:");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.println(numbers[i]);
        }
    }

    public boolean again() {
        System.out.print("Choose another option (1) or exit (2): ");
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter 1 to choose another option or 2 to exit.");
            scanner.next(); // Consume the invalid input
            System.out.print("Choose another option (1) or exit (2): ");
        }

        int choice = scanner.nextInt();
        return choice == 1;
    }

    public static void main(String[] args) {
        ArrayProcessing processor = new ArrayProcessing();
    }
}
