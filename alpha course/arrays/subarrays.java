package arrays;
import java.util.*;

public class subarrays {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int ts = 0;
        for(int i = 0; i < n; i++){
            int start = i;

            for(int j = i; j < n; j++){
                int end = j;
                System.out.print("( ");
                for(int k = start; k <= end; k++){
                    System.out.print(arr[k] + " ");
                }
                ts++;
                System.out.print("), ");
            }
            System.out.println();
        }
        System.out.println("total subarrays: " + ts);

        sc.close();
   }
}