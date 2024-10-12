import java.util.Scanner;

public class Task2 {
    public static int getNumOfElements(int arr[]) {
        int counter=0;
        for (int i = 0; i <arr.length ; i++) {
            counter++;
        }
        return counter;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the size of the array");
        int size = input.nextInt();
        int[] arr = new int[size];
        System.out.println("Please enter "+ size + " Numbers");
        for (int i = 0; i < arr.length ; i++) {
            arr[i] = input.nextInt();
        }
        System.out.println("The number of elements is " + getNumOfElements(arr));
    }
}
