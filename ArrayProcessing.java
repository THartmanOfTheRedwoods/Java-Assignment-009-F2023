import java.util.Scanner;
/*
  ChrisShortt      12/7/2023
 */
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
        System.out.println("Enter five integers:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }
    }

    public void processNumbers() {
        boolean repeat = true;
        while (repeat) {
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
                    System.out.println("Invalid choice!");
            }
            repeat = again();
        }
    }

    public int printMenu() {
        System.out.println("Choose an option to perform:");
        System.out.println("1) Add numbers");
        System.out.println("2) Multiply numbers");
        System.out.println("3) Print numbers");
        System.out.println("4) Print number in reverse");
        System.out.print("Enter your choice: ");
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
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public void reverse() {
        System.out.println("Numbers in reverse:");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }

    public boolean again() {
        System.out.print("Choose 1 to perform another option, 2 to exit: ");
        int choice = scanner.nextInt();
        return choice == 1;
    }

    public static void main(String[] args) {
        ArrayProcessing arrayProcessing = new ArrayProcessing();
    }
}
