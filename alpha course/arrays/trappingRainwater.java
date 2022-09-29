package arrays;
import java.util.*;
public class trappingRainwater {
    public static void main(String args[]){
        //input
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        // auxuliary arrays
        int left_max[] = new int[n];
        int right_max[] = new int[n];
        // left_max
        left_max[0] = arr[0];
        for(int i = 1; i < n; i++){
            left_max[i] = Math.max(left_max[i-1], arr[i]);
        }
        // right_max
        right_max[n-1] = arr[n-1];
        for(int i = n-2; i >= 0; i--){
            right_max[i] = Math.max(right_max[i+1], arr[i]);
        }

        // trapped rainwater
        int sum = 0;
        for(int i = 0; i < n; i++){
            sum += Math.min(left_max[i], right_max[i]) - arr[i];
        }
        System.out.println(sum);

        sc.close();
    }   
}