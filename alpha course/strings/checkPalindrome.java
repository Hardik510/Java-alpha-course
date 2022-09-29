package strings;
import java.util.*;
public class checkPalindrome {
    public static boolean check(String str){
        for(int i = 0; i <= str.length()/2; i++){
            if(str.charAt(i) != str.charAt(str.length()-i-1)){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(check(str));

        sc.close();

        // String s = "A man, a plan, a canal: Panama";
        // StringBuilder sb = new StringBuilder("");
        // for (int i = 0; i < s.length(); i++){
        //     if(Character.toLowerCase(s.charAt(i)) >= 'a' && Character.toLowerCase(s.charAt(i)) <= 'z'){
        //         sb.append(Character.toLowerCase(s.charAt(i)));
        //     } 
        // }
        // System.out.println(sb);
    }
}
