import java.util.Scanner;

public class Task5 {
    public static void calculateEven(int[] arr){
        int sum = 0;
        int counter = 0;
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i]%2 == 0){
                sum += arr[i];
                counter++;
            }
        }
        System.out.println("The array has " + counter + " even numbers and their sum is " + sum);
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
        calculateEven(arr);
    }
}
