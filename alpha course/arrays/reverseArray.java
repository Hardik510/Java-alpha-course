package arrays;
import java.util.*;

public class reverseArray {

    public static void printArr(int arr[], int n){ // Output array
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void reverse(int arr[]){
        int n = arr.length, temp;

        for(int i = 0; i < n/2; i++){
            temp = arr[n-i-1];
            arr[n-i-1] = arr[i];
            arr[i] = temp;
        }
        // return arr; // no need to return array bcoz arrays are passed by reference in java.
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
        
        reverse(arr);
        printArr(arr, n);
        // int arrRev[] = reverse(arr);
        // printArr(arrRev, n);

        sc.close();
    }
}
