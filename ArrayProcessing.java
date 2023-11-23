/**
 * @author Trevor Hartman
 * @author MJ Fracess
 * @since Version 1.0
 **/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayProcessing {
    private static final int[] stuff = new int[5];  //New array, named stuff
    private static final Scanner s = new Scanner(System.in); //New Scanner object

    public ArrayProcessing() { //Constructor
        getNumbers(); //Method call
        processNumbers(); //Method call
    }

    public static void getNumbers() {
        System.out.println("Input 5 numbers and press enter between each"); // prompts the user to input 5 integers
        for (int i = 0; i < stuff.length; i++) { //loop
            stuff[i] = s.nextInt();
        }
    }

    public static int printMenu() {
        //prints menu to prompt user
        System.out.println("Choose an option to perform:");
        System.out.println("1) Add numbers");
        System.out.println("2) Multiply numbers");
        System.out.println("3) Print numbers");
        System.out.println("4) Print number in reverse");

        return s.nextInt();
    }

    public static void processNumbers() {
        boolean askAgain = true;
        while(askAgain) {
            int answer = printMenu();

            switch (answer) {
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
                    System.out.println("Error...Please try again");
            }
            askAgain = again();
        }
    }

    public static void add() {
        int sum = 0;
        for (int e : stuff) {
            sum += e;
        }
        System.out.printf("Sum of all numbers entered is %d%n", sum);
    }

    public static void mult() {
        int num = 1;
        for (int e : stuff) {
            num *= e;
        }
        System.out.printf("All your number multiplied together equals %d%n", num);
    }

    public static void print () {
        for (int e : stuff) {
            System.out.print(e + " ");
        }
        System.out.println(" ");
    }
    public static void reverse() {
        for (int i = stuff.length -1; i >= 0; i--) {
            System.out.print(stuff[i]+ " ");
        }
        System.out.println(" ");
    }

    public static boolean again(){
        System.out.println("enter the integer 1 to choose another option or 2 to exit.");
        int choiceInt = s.nextInt();

            /*
            I wanted to make it so there was an error message if a 1 or a 2 wasn't entered
            this was my start from what I learned on assignment 005, but I got stuck
            String choice = s.next();
            List<Object> validChoice = new ArrayList<>();
            validChoice.add("1");
            validChoice.add("2");
            if(validChoice.contains(choice)){
                if(choice.equals("2")) {
                    System.exit(0);
                } else if ((choice.equals("1")){
                    int choiceInt = Integer.parseInt(choice);
                    return choiceInt == 1;
                } else if (!validChoice){
                    System.out.println("Error, looking for 1 or 2");
                }
            }*/

        return choiceInt == 1;
    }

    public static void main (String[]args){
        ArrayProcessing run = new ArrayProcessing();
// I am not really happy with how this runs, but I have hit a wall and need to move on till I can get help
    }
}
