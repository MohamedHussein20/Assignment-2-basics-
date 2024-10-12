import java.util.Scanner;

public class Task3 {
    public static int getMax(int[] arr) {
        int max=arr[0];
        for (int i = 1; i <arr.length ; i++) {
            if (arr[i] >= max)
            {
                max = arr[i];
            }
        }
        return max;
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
        System.out.println("The max number is " + getMax(arr));
    }
}
