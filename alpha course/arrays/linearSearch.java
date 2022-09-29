package arrays;
import java.util.*;

public class linearSearch {

    public static void printArr(int arr[], int n){ // Output array
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static int linearSearchArr(int arr[], int x){
        int n = arr.length;
        for(int i = 0; i < n; i++){
            if(arr[i] == x){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input aray
        System.out.print("Input number of elements: ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.print("Input elements of array: ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Input element to be found: ");
        int x = sc.nextInt();

        printArr(arr, n);
        System.out.print("element found at: " + linearSearchArr(arr, x));

        sc.close();
    }
}
