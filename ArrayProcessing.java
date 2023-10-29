import java.util.Scanner;

public class ArrayProcessing {
    private int[] array;
    private Scanner scanner;

    public ArrayProcessing() {
        array = new int[5];
        scanner = new Scanner(System.in);
        getNumbers();
        processNumbers();
    }
    public void getNumbers() {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Give me a number: ");
            array[i] = Integer.parseInt(scanner.nextLine());
        }
    }
    public void processNumbers() {
        do {
            int x = printMenu();
            if (x == 1) {
                add(array);
            } else if (x == 2) {
                mult(array);
            } else if (x == 3) {
                print(array);
            } else if (x == 4) {
                reverse(array);
            } else {
                System.err.println("Input Invalid");
            }
        } while(again());



    }
    public int printMenu() {
        System.out.println("Choose an option to perform: \n1) Add numbers\n2) Multiply numbers\n3) Print numbers\n4) Print number in reverse");
        return Integer.parseInt(scanner.nextLine());
    }
    public void add(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println(sum);
    }
    public void mult(int[] array) {
        int x = 1;
        for (int i = 0; i < array.length; i++) {
            x = x * array[i];
        }
        System.out.println(x);
    }
    public void print(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
    public void reverse(int[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.println(array[i]);
        }
    }
    public boolean again() {
        System.out.println("Enter 1 to choose another option or enter 2 to exit");
        int x = Integer.parseInt(scanner.nextLine());
        return x == 1;
    }

    public static void main(String[] args) {
        new ArrayProcessing();
    }
}
