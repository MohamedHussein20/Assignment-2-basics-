import java.util.Scanner;

public class Task9 {
    public static void selectionSort(int[] arr){
        for (int i = 0; i < arr.length-1; i++)
        {
            int index = i;
            for (int j = i+1; j < arr.length; j++){
                if (arr[j] < arr[index]){
                    index = j;
                }
            }
            int smallerNumber = arr[index];
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }
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
        System.out.println("Array before sorting: ");
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
        selectionSort(arr);
        System.out.println("Array after sorting: ");
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i]+ " ");
        }

    }
}
