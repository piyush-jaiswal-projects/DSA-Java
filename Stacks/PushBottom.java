import java.util.*;

public class PushBottom {

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
    //AMAZON Question
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        int val = 4;
        System.out.println(s);
        pushBottom(s, val);
        System.out.println(s);

    }
}
