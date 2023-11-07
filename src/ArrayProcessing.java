
import java.util.Scanner;


public class ArrayProcessing {

    private final int[] intArray;
    private final Scanner s;
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

    private static final String[] intOrder = {
            "first",
            "second",
            "third",
            "fourth",
            "fifth"
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
            System.out.printf("Enter %s integer: ", intOrder[i]);
            intArray[i] = Integer.parseInt(s.nextLine());
        }
    }

    public void processNumbers(){
        boolean repeatProgram = true;
        while (repeatProgram) {
            boolean invalidInput;
            do {
                invalidInput = false;
                switch (printMenu()) {
                    case 1 -> add();
                    case 2 -> mult();
                    case 3 -> print();
                    case 4 -> reverse();
                    default -> {
                        System.out.println(errMessage);
                        invalidInput = true;
                    }
                }
            } while (invalidInput);
            repeatProgram = again();
        }
    }

    public int printMenu(){
        System.out.println(menuProcess[0]);
        for (int i = 1; i < menuProcess.length; i++) {
            System.out.printf("%d: %s%n", i, menuProcess[i]);
        }
        return Integer.parseInt(s.nextLine());
    }

    public void add(){
        int sum = 0;
        for(int i : intArray) {
            sum += i;
        }
        System.out.println("The sum of your numbers is " + sum);
    }

    public void mult(){
        int product = 1;
        for (int i: intArray) {
            product *= i;

        }
        System.out.println("The product of your numbers is " + product);
    }


    public void print(){
        for (int i = 0; i < intArray.length; i++){
            System.out.printf("Index %d = %d%n", i, intArray[i] );
        }
    }

    public void reverse(){
        for (int i = intArray.length - 1; i >= 0; i--){
            System.out.printf("Index %d = %d%n", i, intArray[i] );
        }
    }

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
                case 1 -> {}
                case 2 -> repeatProgram = false;
                default -> {
                    System.out.println(errMessage);
                    invalidInput = true;
                }
            }
        } while (invalidInput);
        return repeatProgram;
    }

    public static void main(String[] args){
        ArrayProcessing test = new ArrayProcessing();
    }
}
