import java.util.Scanner;

public class Task8 {
    public static void binarySearch(int arr[], int low, int high, int key){
        int mid = (low + high)/2;
        while( low <= high ){
            if ( arr[mid] < key ){
                low = mid + 1;
            }else if ( arr[mid] == key ){
                System.out.println("Element is found at index: " + mid);
                break;
            }else{
                high = mid - 1;
            }
            mid = (low + high)/2;
        }
        if ( low > high ){
            System.out.println("Element is not found!");
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
        binarySearch(arr,0,arr.length-1,5);
    }
}
