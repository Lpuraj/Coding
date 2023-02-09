package Assignment;

import java.util.*;

public class Trial4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list1 = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list1.add(in.nextInt());
        }
        System.out.println("List 1: " + list1);
        ArrayList<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list2.add(in.nextInt());
        }
        System.out.println("List 2: " + list2);
        // ArrayList<Integer> list=new ArrayList<>();
        list1.addAll(list2);
        System.out.println("Updated list: " + list1);
    }

}
