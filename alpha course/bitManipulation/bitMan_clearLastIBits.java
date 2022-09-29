package bitManipulation;
import java.util.*;

public class bitMan_clearLastIBits {
    public static int cleariBits(int n, int i){
        int bitmask = -1 << i;
        return bitmask&n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), i = sc.nextInt();
        System.out.println(cleariBits(n,i));
        sc.close();
    }
}
