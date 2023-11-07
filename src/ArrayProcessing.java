import java.io.File;
import java.util.Arrays;
import java.util.Scanner;


public class ArrayProcessing {

    private int[] intArray;
    private Scanner s;
    private static final String[] menuProcess = {
            "Choose an option to perform:",
            ") Add numbers",
            ") Multiply numbers",
            ") Print numbers",
            ") Print number in reverse"
        };

    private static final String[] menuAgain = {
            "Would you like to choose another option?",
            ") Choose another option",
            ") Exit program"
    };

    private static final String errMessage = "Invalid Entry";

    public ArrayProcessing(){
        this.intArray = new int[5];
        this.s = new Scanner(System.in);

        getNumbers();
        processNumbers();
    }

    public void getNumbers(){
        for (int i = 0; i < intArray.length; i++){
            System.out.println("Enter an integer: ");
            intArray[i] = Integer.parseInt(s.nextLine());
        }
    }

    public void processNumbers(){
        boolean repeatProgram = true;
        while (repeatProgram) {
            //System.out.println("processNumbers start while loop\n" + repeatProgram);      //scaffold
            boolean invalidInput;
            do {
                //System.out.println("processNumbers do while start\n" + repeatProgram);      //scaffold
                invalidInput = false;
                switch (printMenu()) {
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
                        System.out.println(errMessage);
                        invalidInput = true;
                }
            } while (invalidInput);
//            System.out.println(repeatProgram);              //scaffold
            repeatProgram = again();
            //System.out.println("post again method call\n" + repeatProgram);              //scaffold
        }
    }

    public int printMenu(){
        System.out.println(menuProcess[0]);
        for (int i = 1; i < menuProcess.length; i++) {
            System.out.printf("%d: %s%n", i, menuProcess[i]);
        }
        int userOption = Integer.parseInt(s.nextLine());        //write check on input
        return userOption;
    }


//    Create a method named, add, with a return type of void and no parameters that does the following:
//    Uses a for loop and the array length field to sum the numbers in the array and print the final sum, with the
//    appropriate label, only once to the terminal window.
    public void add(){

    }

//    Create a method named, mult, with a return type of void and no parameters that does the following:
//    Uses a for loop and the array length field to multiply the numbers in the array together and print the final
//    product, with the appropriate label, only once to the terminal window
    public void mult(){
        return;
    }

//    Create a method named, print, with a return type of void and no parameters that does the following:
//    Uses a for loop and the array length field to print each number, with the appropriate label, in the array to
//    the terminal window.
    public void print(){
        return;
    }

//    Create a method named, reverse, with a return type of void and no parameters that does the following:
//    Uses a for loop and the array length field to print each number in the array IN REVERSE ORDER, with the
//    appropriate label, to the terminal window.
    public void reverse(){
        return;
    }

//    Create a method named, again, with a return type of boolean and no parameters that does the following:
//    Prompts the user to enter the integer 1 to choose another option or 2 to exit.
//    Grabs an int from the terminal using the Scanner object.
//    Tests the number entered and returns true if the int is a 1 and false if it is something else.
    public boolean again(){
        boolean repeatProgram = true;
        boolean invalidInput;
        int userAgain;
        do {
            invalidInput = false;
            System.out.println(menuAgain[0]);
            for (int i = 1; i < menuAgain.length; i++) {
                System.out.printf("%d: %s%n", i, menuAgain[i]);
            }
            userAgain = Integer.parseInt(s.nextLine());
            switch (userAgain) {
                case 1:
                    repeatProgram = true;
                    //System.out.println(repeatProgram);      //scaffold
                    break;
                case 2:
                    repeatProgram = false;
                    //System.out.println(repeatProgram);      //scaffold
                    break;
                default:
                    System.out.println(errMessage);
                    invalidInput = true;
            }
        } while (invalidInput);
        System.out.println("again method end\n" + repeatProgram);
        return repeatProgram;
    }

    public static void main(String[] args){
        ArrayProcessing test = new ArrayProcessing();
    }
}
