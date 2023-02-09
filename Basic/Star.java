package Basic;

import java.util.Scanner;

public class Star {
    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("*");
        }

    }
}
