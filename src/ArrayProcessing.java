import java.util.Scanner;


public class ArrayProcessing {

    private int[] intArray;
    private Scanner s;

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
        return;
    }

    public void printMenu(){
        return;
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

    public void again(){
        return;
    }
}
