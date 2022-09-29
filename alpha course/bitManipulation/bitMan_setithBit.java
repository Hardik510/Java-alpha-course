package bitManipulation;
import java.util.*;

public class bitMan_setithBit {
    public static int setBit(int n, int i){
        return (n|(1<<i));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), i = sc.nextInt();
        System.out.println(setBit(n, i));
        sc.close();
    }
}
