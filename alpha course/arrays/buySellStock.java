package arrays;
import java.util.*;

public class buySellStock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }


        // time complexity: O(n);
        int bp = Integer.MAX_VALUE, sp = arr[0], profit = 0;
        for(int i = 1; i < n; i++){
            bp = Math.min(arr[i-1], bp);
            sp = arr[i];
            if(sp-bp>profit){
                profit = sp-bp;
            }
        } 
        System.out.println(profit);

        sc.close();
    }
}
