import java.util.*;

public class ReverseStack {

    public static void pushBottom(Stack<Integer> s, int val) {
        //base case
        if (s.isEmpty()) {
            s.push(val);
            return;
        }

        int tempData = s.pop();
        pushBottom(s, val);
        s.push(tempData);
        
    }
    
    public static void reverseStack(Stack<Integer> s) {
        //base case
        if (s.isEmpty()) {
            return;
        }

        int data = s.pop();
        reverseStack(s);
        pushBottom(s,data);   
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);

        System.out.println(s);
        reverseStack(s);
        System.out.println(s);
    }
}
