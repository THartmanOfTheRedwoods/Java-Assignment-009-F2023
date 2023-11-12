import java.util.ArrayList;
import java.util.Scanner;
/*Finn Clark
* 11/11/23
* CIS - 12
* Hartman */
public class ArrayProcessing {
    public static int[] arr;
    public Scanner scan;
    public boolean choice = true;
    public ArrayProcessing(){
        scan = new Scanner(System.in);
        arr = new int[5];
        processNumbers();

    }
    // I accidentally flipped the creation of proccessNumbers and getNumbers
    private void processNumbers() {
        while(choice){
            int result = printMenu();
            if (result >= 1 && result <=4){
                switch (result){
                    case (1):
                        add();
                        break;
                    case (2):
                        mult();
                        break;
                    case (3):
                        print();
                        break;
                    case (4):
                        reverse();
                        break;
                }
            } else{
                System.out.println("Error: Invalid Selection, try again");
            }again();
        }
    }
    public void add(){
        getNumbers();
        int sum = 0;
        for (Integer element : arr){
            sum += element;
        }System.out.println(sum);

    }
    public void mult(){
        getNumbers();
        int product = 1;
        for(Integer element : arr){
            product *= element;
        }System.out.println(product);
    }
    public void print(){
        getNumbers();
        for(int element : arr) {
            System.out.print(element + ", ");
        }
        System.out.println();
    }
    public void reverse(){
        getNumbers();
        for(int e = arr.length - 1; e >= 0; e-- ) {
            int index = arr[e];
            System.out.print(index + ", ");
        }
        System.out.println();
    }
    public int printMenu(){
        scan = new Scanner(System.in);
        System.out.println("Choose an option to perform:");
        System.out.println("1) Add Numbers");
        System.out.println("2) Multiply Numbers");
        System.out.println("3) Print Numbers");
        System.out.println("4) Print numbers in reverse");
        int result = (scan.nextInt());
        return result;
    }

    private void getNumbers() {
        scan = new Scanner(System.in);
        System.out.println("Enter 5 integers: ");
        for(int e = 0; e < arr.length; e++){
            arr[e] = scan.nextInt();
        }
    }
    public boolean again(){
        scan = new Scanner(System.in);
        System.out.println("1 to select a different option, 2 to quit: ");
        int in = scan.nextInt();
        if (in == 1){
            choice = true;
        }if (in == 2){
            choice = false;
        }return choice;
    }
    public static void main(String[] args) {
        ArrayProcessing input = new ArrayProcessing();
input.processNumbers();
    }
}
