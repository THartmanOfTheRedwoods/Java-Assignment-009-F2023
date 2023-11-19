
package source;
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
            for (int i = 0; i < numbersArray.length; i++) {
                System.out.print("Enter an integer for position " + (i + 1) + ": ");
                numbersArray[i] = scanner.nextInt();
            }
            System.out.printf("%n");
        }

        // Method to process numbers based on user input
        public void processNumbers() {
            do {

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
            } while (again());

        }

        // Method to print the menu and get user choice
        public int printMenu() {
            System.out.println("Choose an option to perform:");
            System.out.println("1) Add numbers");
            System.out.println("2) Multiply numbers");
            System.out.println("3) Print numbers");
            System.out.println("4) Print numbers in reverse");
            System.out.print("Enter your choice: ");
            return scanner.nextInt();

        }

        // Method to add numbers in the array
        public void add() {
            int sum = 0;
            for (int num : numbersArray) {
                sum += num;
            }
            System.out.println("Sum of numbers: " + sum);
        }

        // Method to multiply numbers in the array
        public void mult() {
            int product = 1;
            for (int num : numbersArray) {
                product *= num;
            }
            System.out.println("Product of numbers: " + product);
        }

        // Method to print numbers in the array
        public void print() {
            System.out.print("Numbers in the array: ");
            for (int num : numbersArray) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

        // Method to print numbers in reverse order
        public void reverse() {
            System.out.print("Numbers in reverse order: ");
            for (int i = numbersArray.length - 1; i >= 0; i--) {
                System.out.print(numbersArray[i] + " ");
            }
            System.out.println();
        }

        // Method to prompt the user to choose another option or exit
        public boolean again() {
            System.out.print("Again? Enter 1 to choose another option or 2 to exit: ");
            int choice = scanner.nextInt();
            return choice == 1;
        }

        // Main method to test the ArrayProcessing class
        public static void main(String[] args) {
            new ArrayProcessing();
        }
    }


