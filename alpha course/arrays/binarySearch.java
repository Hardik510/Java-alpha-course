package arrays;
import java.util.*;

public class binarySearch {

    public static void printArr(int arr[], int n){ // Output array
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static int binarySearchArr(int arr[], int x){
        int n = arr.length;
        int s = 0, e = n-1, mid;

        while(s <= e){
            mid = (s+e)/2;
            if(arr[mid] > x){
                e = mid-1;
            }
            else if(arr[mid] < x){
                s = mid+1;
            }
            else{
                return mid;
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
        System.out.print("element found at: " + binarySearchArr(arr, x));

        sc.close();
    }
}
