// Daniel Faulkner, CIS 12, 10/28/23
import java.util.Scanner;
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
        System.out.println("Enter 5 integers:");
        for (int i = 0; i < numbers.length; i++) {
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
                    System.out.println("Error");
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
        System.out.println("4) Print numbers in reverse");
        return scanner.nextInt();
    }

    public void add() {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println("Sum of numbers: " + sum);
    }

    public void mult() {
        int product = 1;
        for (int number : numbers) {
            product *= number;
        }
        System.out.println("Product of numbers: " + product);
    }

    public void print() {
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Number " + (i + 1) + ": " + numbers[i]);
        }
    }

    public void reverse() {
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.println("Number " + (numbers.length - i) + ": " + numbers[i]);
        }
    }

    public boolean again() {
        System.out.println("Choose 1 to continue or 2 to exit:");
        int choice = scanner.nextInt();
        return choice == 1;
    }

    public static void main(String[] args) {
        ArrayProcessing arrayProcessor = new ArrayProcessing();
    }
}
