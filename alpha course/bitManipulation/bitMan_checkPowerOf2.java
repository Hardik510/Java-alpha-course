package bitManipulation;
import java.util.*;

public class bitMan_checkPowerOf2 {
    public static boolean checkPowerOf2(int n){
        int bitmask = (n-1) & n;
        return (bitmask == 0);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(checkPowerOf2(n));
        sc.close();
    }
}