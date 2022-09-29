package arrays;
import java.util.*;

public class maxSubarraySum3 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }


        // Kadane's Algorithm
        // time complexity: O(n)


        // int cSum = 0, mSum = 0;
        // for(int i = 0; i < n; i++){
        //     cSum += arr[i];
        //     if(cSum >= 0){
        //         mSum = Math.max(mSum, cSum);
        //     }
        //     else{
        //         cSum = 0;
        //     }
        // }


        // this one works for all negative inputs also
        int cSum = 0, mSum = Integer.MIN_VALUE, mEle = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++){
            cSum += arr[i];
            if(cSum < 0){
                cSum = 0;
            }
            mSum = Math.max(mSum, cSum);
            mEle = Math.max(mEle, arr[i]);
        }

        if(mSum == 0){
            mSum = mEle;
        }
        System.out.println("max sum: " + mSum);

        sc.close();
   }
}