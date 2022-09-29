package bitManipulation;
import java.util.*;

public class bitMan_checkOddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), bitmask = 1;
        System.out.println(((n & bitmask) == 0) ? "even" : "odd");
        sc.close();
    }
}
