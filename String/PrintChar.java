package String;

import java.util.Scanner;

public class PrintChar {
    public static void count(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }

    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String str = obj.nextLine();
        count(str);
        // System.out.println(total(str));
    }
}
