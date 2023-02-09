package LinkedList;

import java.util.Scanner;

public class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("What you wish to do");
        System.out.println("--------------X----------");
        System.out.println("Enter data for inserting");
        Node head = insert();
        System.out.println("FOr printing press P");
        char ch = obj.next().charAt(0);
        if (ch == 'P') {
            print(head);
        }
        System.out.println("FOr length press L");
        char ch1 = obj.next().charAt(0);
        // Length objl=new Length();
        if (ch1 == 'L') {
            System.out.println(length(head));
        }

    }

    public static void print(Node head) {
        while (head != null) {
            System.out.println(head.data);
            head = head.next;
        }
    }

    public static int length(Node head) {
        int l = 0;
        while (head != null) {
            l++;
            head = head.next;
        }
        return l;
    }

    public static Node insert() {
        Scanner obj = new Scanner(System.in);
        int data = obj.nextInt();
        Node head = null, tail = null;
        while (data != -1) {
            Node temp = new Node(data);
            if (head == null) {
                head = temp;
                tail = temp;

            } else {
                tail.next = temp;
                tail = tail.next;
            }
            data = obj.nextInt();
        }

        return head;
    }
}
