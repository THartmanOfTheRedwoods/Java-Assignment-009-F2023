import java.util.Scanner;

public class ArrayProcessing {
    private int[] numbers = new int[5];
    private Scanner scanner = new Scanner(System.in);

    public ArrayProcessing() {
        getNumbers();
        processNumbers();
    }

    public void getNumbers() {
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter an integer: ");
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
                    System.out.println("Invalid option. Please choose again.");
            }

            continueProcessing = again();
        }
    }

    public int printMenu() {
        System.out.println("Choose an option to perform:");
        System.out.println("1) Add numbers");
        System.out.println("2) Multiply numbers");
        System.out.println("3) Print numbers");
        System.out.println("4) Print numbers in reverse");
        System.out.print("Enter your choice: ");
        return scanner.nextInt();
    }

    public void add() {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println("Sum of the numbers: " + sum);
    }

    public void mult() {
        int product = 1;
        for (int number : numbers) {
            product *= number;
        }
        System.out.println("Product of the numbers: " + product);
    }

    public void print() {
        System.out.println("Numbers in the array:");
        for (int number : numbers) {
            System.out.println(number);
        }
    }

    public void reverse() {
        System.out.println("Numbers in reverse order:");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.println(numbers[i]);
        }
    }

    public boolean again() {
        System.out.print("Enter 1 to choose another option or 2 to exit: ");
        int choice = scanner.nextInt();
        return choice == 1;
    }

    public static void main(String[] args) {
        ArrayProcessing arrayProcessing = new ArrayProcessing();
    }
}
