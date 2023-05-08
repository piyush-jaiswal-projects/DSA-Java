package LinkedLists;

public class LinkedList {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println();
    }

    public void add(int idx, int data) {
        if (idx == 0) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;

        while (i < idx - 1) {
            temp = temp.next;
            i++;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }
    
    public int removeFirst() {
        if (size == 0) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }

        int val = head.data;
        head = head.next;
        size--;
        return val;
    }
    
    public int removeLast() {
        if (size == 0) {
            System.out.println("LL is empty");
        } else if (size == 1) {
            int val = tail.data;
            head = tail = null;
            size = 0;
            return val;
        }

        Node prev = head;
        for (int i = 0; i < size - 2; i++) {
            prev = prev.next;
        }

        int val = prev.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;

    }
    
    public int itrSearch(int key) {
        int i = 0;
        Node temp = head;

        while (temp != null) {
            if (temp.data == key) { //key found
                return i;
            }
            i++;
            temp = temp.next;
        }

        //key not found
        return -1;
    }

    public int recursiveSearch(Node curr, int idx, int key) {
        if (curr == null) {
            return -1;
        }

        if (curr.data == key)
            return idx;
        return recursiveSearch(curr.next, idx + 1, key);
    }

    public void reverse() {
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public void removeNthNodeFromEnd(int n) {
        //calculate size
        int sz = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            sz++;
        }

        //edge case
        if (sz - n < 0) {
            System.out.println("Node does not exists");
        } else if (n == sz) {
            head = head.next;
            return;
        }

        //find node
        Node prev = null;
        Node curr = head;
        for (int i = 0; i < (sz - n); i++) {
            prev = curr;
            curr = curr.next;
        }

        prev.next = curr.next;
        curr.next = null;
    }
    
    //Slow-Fast Approach
    public Node findMid(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow; //mid node of our LL
    }

    public boolean checkPalindrome() {
        if (head == null || head.next == null) {
            return true;
        }
        //step-1 find mid node
        Node midNode = findMid(head);

        //step-2 reverse 2nd half
        Node prev = null;
        Node curr = midNode;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node right = prev; //head of right part
        Node left = head; //head of left part

        //step-3 check right and left half
        while (right != null) {
            if (left.data != right.data) {
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }
    
    public static boolean isCycle() {
        Node Slow = head;
        Node Fast = head;

        while (Fast != null && Fast.next != null) {
            Slow = Slow.next; //+1
            Fast = Fast.next.next; //+2
            if (Slow == Fast) {
                return true; //cycle exists
            }
        }

        return false; //cycle doesn't exists
    }

    public static void removeCycle() {
        //detect cycle
        Node slow = head;
        Node fast = head;
        boolean cycle = false;
        while (fast != null & fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                cycle = true;
                break;
            }
        }
        if (cycle == false) {
            return;
        }

        //find cycle creation node and its prev node
        slow = head;
        Node prev = null;
        while (slow != fast) {
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }

        //point prev next to null
        prev.next = null;
    }

    public static Node getMid(Node head) {
        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }

        return slow;
    }

    public static Node merge(Node headL, Node headR) {
        Node mergedLL = new Node(-1);
        Node temp = mergedLL;

        while (headL != null && headR != null) {
            if (headL.data <= headR.data) {
                temp.next = headL;
                headL = headL.next;
                temp = temp.next;
            } else {
                temp.next = headR;
                headR = headR.next;
                temp = temp.next;
            }
        }

        while (headL != null) {
            temp.next = headL;
            headL = headL.next;
            temp = temp.next;
        }

        while (headR != null) {
            temp.next = headR;
            headR = headR.next;
            temp = temp.next;
        }
        
        return mergedLL.next;
    }

    public Node mergeSort(Node head) {
        //base case
        if (head == null || head.next == null) {
            return head;
        }
        //find mid node
        Node mid = getMid(head);

        //divide
        Node headL = head;
        Node headR = mid.next;
        mid.next = null;
        Node newLeft = mergeSort(headL); //left part
        Node newRight = mergeSort(headR); //right part

        //conquer - merge function
        return merge(newLeft, newRight);

     }

     public static void main(String[] args) {
         LinkedList ll = new LinkedList();
         ll.addFirst(1);
         ll.addFirst(2);
         ll.addFirst(3);
         ll.addFirst(4);
         ll.addFirst(5);
         //5->4->3->2->1

         ll.print();
         ll.head = ll.mergeSort(ll.head);
        ll.print();
    }
}
