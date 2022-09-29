package arrays;
import java.util.*;

public class maxSubarraySum2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }


        // prefix-sum approach
        // time complexity: O(n^2)


        int prefixArr[] = new int[n];
        prefixArr[0] = arr[0];
        for(int i = 1; i < n; i++){
            prefixArr[i] = prefixArr[i-1] + arr[i];
        }

        int ts = 0, max = Integer.MIN_VALUE, sum = 0;
        for(int i = 0; i < n; i++){
            int start = i;
            for(int j = i; j < n; j++){
                int end = j;
                sum = (start == 0) ? prefixArr[end] : prefixArr[end] - prefixArr[start-1];
                if(sum > max){
                    max = sum;
                }
                sum = 0;
                ts++;
            }
        }
        System.out.println("total subarrays: " + ts);
        System.out.println("max sum: " + max);

        sc.close();
   }
}