import java.util.Scanner;

public class ArrayProcessing {
    private int[] numbers = new int[5];
    private Scanner scanner = new Scanner(System.in);

    public ArrayProcessing() {
        getNumbers();
        processNumbers();
    }

    private void getNumbers() {
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }
    }

    private void processNumbers() {
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
                    System.out.println("Invalid choice. Please try again.");
            }
            continueProcessing = again();
        }
    }

    private int printMenu() {
        System.out.println("Choose an option to perform:");
        System.out.println("1) Add numbers");
        System.out.println("2) Multiply numbers");
        System.out.println("3) Print numbers");
        System.out.println("4) Print number in reverse");
        return scanner.nextInt();
    }

    private void add() {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println("Sum: " + sum);
    }

    private void mult() {
        int product = 1;
        for (int number : numbers) {
            product *= number;
        }
        System.out.println("Product: " + product);
    }

    private void print() {
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Number " + (i + 1) + ": " + numbers[i]);
        }
    }

    private void reverse() {
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.println("Number " + (i + 1) + ": " + numbers[i]);
        }
    }

    private boolean again() {
        System.out.println("Enter 1 to choose another option or 2 to exit.");
        int choice = scanner.nextInt();
        return choice == 1;
    }

    public static void main(String[] args) {
        ArrayProcessing arrayProcessing = new ArrayProcessing();
    }

}




