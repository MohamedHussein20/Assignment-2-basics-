import java.util.Scanner;

public class Task7 {
    public static void countGeneral(int[] arr){
        int k = 100005;
        int[] flag = new int[k];
        int[] fr = new int[k];
        for (int i = 0; i < arr.length ; i++) {
            fr[arr[i]]++;
        }

        for (int i = 0; i < arr.length ; i++) {
            if(fr[arr[i]] != -1)
            {
                System.out.println(arr[i] + " " + fr[arr[i]]);
                fr[arr[i]] = -1;
            }
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
        countGeneral(arr);
    }
}
