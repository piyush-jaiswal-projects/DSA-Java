package Queues;
import java.util.*;

public class PrintNonRepeating {
    public static void printNonRepeating(String str) {
        int[] freq = new int[26];
        Queue<Character> ans = new LinkedList<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            ans.add(ch);
            freq[ch - 'a']++;

            while (!ans.isEmpty() && freq[ans.peek() - 'a'] > 1) {
                ans.remove();
            }
            
            if (ans.isEmpty()) {
                System.out.println("-1" + " ");
            } else {
                System.out.println(ans.peek() + " ");
            }
        }
    }
    public static void main(String[] args) {
        String str = "aabccxb";
        printNonRepeating(str);
    }
}
