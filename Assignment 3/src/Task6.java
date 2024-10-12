import java.util.Scanner;

public class Task6 {
    public static int count2(int[] arr) {
        int numberOfTwos = 0;
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i] == 2){
                numberOfTwos++;
            }
        }
        return numberOfTwos;
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
        System.out.println("The number of twos in the array is " + count2(arr));
    }
}
