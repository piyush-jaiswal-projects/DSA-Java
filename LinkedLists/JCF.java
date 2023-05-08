package LinkedLists;
import java.util.LinkedList;

public class JCF {
    public static void main(String[] args) {
        //create - can only add objects thus use classes
        LinkedList<Integer> ll = new LinkedList<>();

        //add
        ll.addLast(1);
        ll.addLast(2);
        ll.addFirst(0);

        //print
        System.out.println(ll);

        //remove
        ll.removeLast();
        ll.removeFirst();
        System.out.println(ll);
    }
}
