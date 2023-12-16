/*
 *
 * @author Kevin Sicairos
 * @author Trevor Hartman
 *
 * @since Version 1.0
 */

import java.util.Scanner;
public class Array {
    private int[] numbers = new int[5];
    private Scanner s = new Scanner(System.in);

    public Array() {
        getNumbers();
        processNumbers();
    }

    public void getNumbers() {
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter a number");
            numbers[i] = s.nextInt();
        }
    }

    public void processNumbers() {
        do {
            int choice = printMenu();
            if (choice == 1) {
                add();
            } else if (choice == 2) {
                mult();
            } else if (choice == 3) {
                print();
            } else if (choice == 4) {
                reverse();
            } else {
                System.out.println("Invalid option. Try again.");

            }
        } while (again());
    }

    public int printMenu() {
        System.out.println("Choose an option to perform:/n1) Add numbers/n2) Multiply numbers/n3) Print numbers/n4) Print number in reverse");
        return s.nextInt();
    }

    public void add() {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println("The sum is:" + sum);


    }

    public void mult() {
        int sum = 1;
        for (int i = 0; i < numbers.length; i++) {
            sum *= numbers[i];

        }
        System.out.println("The product is:" + sum);
    }

    public void print() {
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
    public void reverse() {
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.println(numbers[i]);

        }
    }
    public boolean again() {
        System.out.println("Enter 1 to choose another option or 2 to exit:");
        int choice = s.nextInt();
        return choice ==1;
    }
    public static void main(String[] args) {
        new Array();
    }
}