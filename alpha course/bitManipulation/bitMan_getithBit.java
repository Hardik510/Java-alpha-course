package bitManipulation;
import java.util.*;

public class bitMan_getithBit{
    public static int getBit(int n, int i){
        return ((n&(1<<i)) == 0)?0:1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), i = sc.nextInt();
        System.out.println(getBit(n, i));
        sc.close();
    }
}