import java.util.Scanner;
public class ArrayProcessing {
    private int[] numbers = new int[5];
    private Scanner input;
    public ArrayProcessing() {
        input = new Scanner(System.in);
        getNumbers();
        processNumbers();
    }
    private void getNumbers() {
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = input.nextInt();
        }
    }
    private void processNumbers() {
        while (again()) {
            int option = printMenu();
            switch (option) {
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
                    System.out.println("Invalid option, please try again.");
            }
        }
    }
    private int printMenu() {
        System.out.println("\nChoose an option to perform:");
        System.out.println("1) Add numbers");
        System.out.println("2) Multiply numbers");
        System.out.println("3) Print numbers");
        System.out.println("4) Print numbers in reverse");
        System.out.print("Your choice: ");
        return input.nextInt();
    }
    private void add() {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("Sum: " + sum);
    }
    private void mult() {
        int product = 1;
        for (int num : numbers) {
            product *= num;
        }
        System.out.println("Product: " + product);
    }
    private void print() {
        for (int num : numbers) {
            System.out.println("Number: " + num);
        }
    }
    private void reverse() {
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.println("Number: " + numbers[i]);
        }
    }
    private boolean again() {
        System.out.print("Enter 1 to choose another option or 2 to exit: ");
        int choice = input.nextInt();
        return choice == 1;
    }
    public static void main(String[] args) {
        new ArrayProcessing();
    }
}