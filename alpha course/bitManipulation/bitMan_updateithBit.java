package bitManipulation;
import java.util.*;

public class bitMan_updateithBit {
    public static int clearBit(int n, int i){
        return (n&~(1<<i));
    }

    public static int updateBit(int n, int i, int bit){
        n = clearBit(n, i);
        int bitmask = bit<<i;
        return n | bitmask;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), i = sc.nextInt(), bit = sc.nextInt();
        System.out.println(updateBit(n, i, bit));
        sc.close();
    }
}