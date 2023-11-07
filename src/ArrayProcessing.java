import java.io.File;
import java.util.Arrays;
import java.util.Scanner;


public class ArrayProcessing {

    private int[] intArray;
    private Scanner s;
    private static final String[] menu = {
            "Choose an option to perform:",
            ") Add numbers",
            ") Multiply numbers",
            ") Print numbers",
            ") Print number in reverse"
        };

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
        do{
            switch (printMenu()) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Invalid Entry");
            }
        } while (again());

    }

    public int printMenu(){
        System.out.println(menu[0]);
        for (int i = 1; i < menu.length; i++) {
            System.out.printf("%d: %s%n", i, menu[i]);
        }
        int userOption = Integer.parseInt(s.nextLine());        //write check on input
        return userOption;
    }

    public void add(){
        return;
    }

    public void mult(){
        return;
    }

    public void print(){
        return;
    }

    public void reverse(){
        return;
    }

    public boolean again(){
        return false;
    }

    public static void main(String[] args){
        ArrayProcessing test = new ArrayProcessing();           //scaffold
        test.printMenu();
    }
}
