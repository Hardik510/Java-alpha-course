package bitManipulation;
import java.util.*;
public class bitMan_countSetBits {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int count = 0;
        while(n != 0){
            if((n & 1) != 0){
                count ++;
            }
            n = n>>1;
        }

        System.out.print(count);

        sc.close();
    }
}