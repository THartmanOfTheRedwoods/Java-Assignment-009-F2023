import java.util.Scanner;
/**
 * @author Olivia McKittrick
 */
public class ArrayProcessing {
    private final int[] intArray = new int[5]; // Array that holds 5 int type objects
    private final Scanner s = new Scanner(System.in); // Scanner object

    public ArrayProcessing() { // Constructor
        getNumbers(); // calls method
        processNumbers(); // calls method
    }

    public void getNumbers() { // Method that gets user to enter 5 integers
        System.out.println("Enter 5 integers: ");
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter integer " + (i + 1) + ": ");
            intArray[i] = s.nextInt();
        }
    }

    public void processNumbers() { // method to process the numbers
        boolean continueProcessing = true;
        while (continueProcessing) {
            int choice;
            choice = printMenu();
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
                    System.out.println("Processing numbers.......");
            }
            continueProcessing = again();
        }

        int add; {
            int sum = 0;
            for (int num : intArray) {
                sum += num;
            }
            System.out.println("Sum of the array element: " + sum);
        }

        int mult; {
            int product = 1;
            for (int num : intArray) {
                product += num;
            }
            System.out.println("Product of the array elements: " + product);
        }

        int print; {
            System.out.print("Array elements: ");
            for (int num : intArray) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

        int reverse; {
            System.out.print("Array elements in reverse: ");
            for (int i = intArray.length - 1; i >= 0; i--) {
                System.out.print(intArray[i] + " ");
            }
            System.out.println();
        }

        boolean again; {
            System.out.print("Enter 1 to choose another option or 2 to exit: ");
            int choice = s.nextInt();
        }

        int printMenu; {
            System.out.println("choose an option to perform:");
            System.out.println("1) Add number");
            System.out.println("2) Multiply numbers");
            System.out.println("3) Print numbers");
            System.out.println("4) Print numbers in reverse");
            System.out.println("Enter your choice: ");
            s.nextInt();
            return;
        }

    }

    private void add() {
    }

    private boolean again() {
        return false;
    }

    private void reverse() {
    }

    private void print() {
    }

    private void mult() {
        
    }

    private int printMenu() {
        return 0;
    }

    public static void main(String[] args) {
        ArrayProcessing arrayProcessing = new ArrayProcessing();
    }
}
