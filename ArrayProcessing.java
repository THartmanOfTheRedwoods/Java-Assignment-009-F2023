import java.util.ArrayList;
import java.util.Scanner;
public class ArrayProcessing {
    public static ArrayList<Integer> arr = new ArrayList<>();
    public static Scanner scan;
    public static boolean choice;
    public ArrayProcessing(){
        scan = new Scanner(System.in);
        ArrayProcessing.getNumbers();
        ArrayProcessing.processNumbers();
    }

    private static void processNumbers() {
        while(choice){
            int result = ArrayProcessing.printMenu();
        if (result >= 1 && result <= 4){
            if(result == 1){
                ArrayProcessing.getNumbers();
                int sum = 0;
                for (int element = 0; element < arr.size(); element++){
                    sum += element;
                }System.out.println(sum);
                break;
            }if (result == 2){
                ArrayProcessing.getNumbers();
                int product = 1;
                for(int element = 0; element < arr.size(); element++){
                    product *= element;
                }System.out.println(product);
                break;
            }if (result == 3){
                ArrayProcessing.getNumbers();
                for(int element : arr){
                    System.out.print(element + ", ");
                    System.out.println();
                    break;
                }
            }if (result == 4){
                ArrayProcessing.getNumbers();
                for(int e = 0; e < arr.indexOf(4); e--){
                    System.out.print(e + ", ");
                    again();
                    break;
                }
            }
        }else {
            System.out.println("Error: Invalid Selection, try again");
            ArrayProcessing.again();
        }
    }
    }
    public static int printMenu(){
        scan = new Scanner(System.in);
        System.out.println("Choose an option to perform:");
        System.out.println("1) Add Numbers");
        System.out.println("2) Multiply Numbers");
        System.out.println("3) Print Numbers");
        System.out.println("4) Print numbers in reverse");
        int result = scan.nextInt();
        return result;
    }

    private static void getNumbers() {
        scan = new Scanner(System.in);
        System.out.println("Enter 5 integers: ");
        for(int e = 0; e < 5; e++){
            arr.add(scan.nextInt());
        }
    }
    public static boolean again(){
        scan = new Scanner(System.in);
        System.out.println("1 to select a different option, 2 to quit: ");
        if(scan.nextInt() == 1){
            choice = true;
        }if (scan.nextInt() == 2){
            choice = false;
        }
        return choice;
    }
    public static void main(String[] args) {
        while (choice = true) {
            ArrayProcessing.processNumbers();
            ArrayProcessing.again();
        }

    }
}
