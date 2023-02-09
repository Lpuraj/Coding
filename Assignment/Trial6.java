package Assignment;

import java.util.*;

public class Trial6 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter size: ");
        int n = in.nextInt();
        System.out.println("Elements: ");
        for (int i = 0; i < n; i++) {
            list.add(in.nextInt());
        }
        System.out.println(list);
        System.out.println("Reversed list: ");
        ArrayList<Integer> list1 = new ArrayList<>();
        for (int i = list.size() - 1; i >= 0; i--) {
            list1.add(list.get(i));
        }
        System.out.println(list1);
        System.out.println(list1.get(2));

        Collections.sort(list1);
        System.out.println(list1);

        list1.remove(4);
        System.out.println(list1);
    }
}
