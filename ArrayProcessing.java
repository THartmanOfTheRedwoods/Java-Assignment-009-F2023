import java.util.Scanner;
public class ArrayProcessing {
    private int[] nums;
    private Scanner sc;

    public ArrayProcessing() {
        nums = new int[5];
        sc = new Scanner(System.in);
        getNumbers();
        processNumbers();
    }

    public void getNumbers() {
        System.out.println("Enter 5 integers:");
        for (int i = 0; i < nums.length; i++) {
            System.out.println("Number " + (i + 1) + ": ");
            nums[i] = sc.nextInt();
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
                    System.out.println("Invalid. Pick a valid option.");
            }

            repeat = again();
        }

        System.out.println("Exiting...");
    }

    public int printMenu() {
        System.out.println("Choose an option to perform:");
        System.out.println("1) Add numbers");
        System.out.println("2) Multiply numbers");
        System.out.println("3) Print numbers");
        System.out.println("4) Print numbers in reverse");
        return sc.nextInt();
    }

    public void add() {
        int sum = 0;
        for (int number : nums) {
            sum += number;
        }
        System.out.println("Sum of numbers: " + sum);
    }

    public void mult() {
        int product = 1;
        for (int number : nums) {
            product *= number;
        }
        System.out.println("Product of numbers: " + product);
    }

    public void print() {
        System.out.println("Numbers:");
        for (int number : nums) {
            System.out.print(number + " ");
        }
        System.out.println();
    }

    public void reverse() {
        System.out.println("Numbers in reverse:");
        for (int i = nums.length - 1; i >= 0; i--) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }

    public boolean again() {
        System.out.println("Choose an option:");
        System.out.println("1) Choose another option");
        System.out.println("2) Exit");
        int choice = sc.nextInt();
        return choice == 1;
    }

    public static void main(String[] args) {
        ArrayProcessing Launch = new ArrayProcessing();
    }
}
