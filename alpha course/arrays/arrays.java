package arrays;
import java.util.*;

public class arrays {

    public static void printArr(int arr[], int n){ // Output array
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static int sumArr(int arr[]){ // sum of all elements of an array
        int sum = 0;
        for(int i = 0; i < arr.length; i++){ // arr.length finds length of array
            sum += arr[i];
        }
        return sum;
    }

    public static int[] updateArr(int arr[]){ // update array
        arr[2] = 100;
        arr[1] = arr[1] + 5;
        int percent = sumArr(arr) / arr.length;
        System.out.println("percentage = " + percent);
        return arr;
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

        updateArr(arr);
        printArr(arr, n);

        sc.close();
    }
    
}
