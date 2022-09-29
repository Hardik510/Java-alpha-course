package arrays;
import java.util.*;
public class countingSort {

    public static void counting_sort(int arr[], int n){
        int largest = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++){
            largest = Math.max(largest, arr[i]);
        }
        int count[] = new int[largest+1]; // +1 coz 0 is also included
        for(int i = 0; i < n; i++){
            count[arr[i]]++;
        }
        //sorting
        int j = 0;
        for(int i = 0; i < count.length; i++){ // iterating over count array
            while(count[i] > 0){
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        counting_sort(arr, n);

        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}
