import java.util.*;

public class ReverseStringUsingStack {
    //Microsoft, Flipkart, Paytm, Amazon, Adobe
    public static String reverseString(String str) {
        Stack<Character> s = new Stack<>();
        int idx = 0;
        while (idx < str.length()) {
            s.push(str.charAt(idx));
            idx++;
        }

        StringBuilder resStr = new StringBuilder("");
        while (!s.isEmpty()) {
            char curr = s.pop();
            resStr.append(curr);
        }
        return resStr.toString();
    }
    public static void main(String[] args) {
        String str = "abc";
        System.out.println(reverseString(str));
    }
}
