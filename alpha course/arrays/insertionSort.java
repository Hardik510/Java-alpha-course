package arrays;
import java.util.*;
public class insertionSort {

    public static void inserton_sort(int arr[], int n){
        for(int i = 1; i < n; i++){
            int curr = arr[i], prev = i-1;
            // find correct position to insert
            while(prev >= 0 && arr[prev] > curr){
                arr[prev+1] = arr[prev];
                prev--;
            }
            arr[prev+1] = curr;
        }
    }
    
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        // inbuilt sort function in java
        // Arrays.sort(arr);
        // Arrays.sort(arr, Collections.reverseOrder()); // descending order
        // this does NOT works for Int type variables as int is a primitive type and this works on "Integer" type as it is a object type variable

        inserton_sort(arr, n);

        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}
