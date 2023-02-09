package LinkedList;

public class Length {
    public static int length(Node head) {
        int l = 0;
        while (head != null) {
            l++;
            head = head.next;
        }
        return l;
    }
}
