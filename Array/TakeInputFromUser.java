package Array;

import java.util.Scanner;

public class TakeInputFromUser {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int size = obj.nextInt();
        String arr[] = new String[size];
        for (int i = 0; i < size; i++) {
            arr[i] = obj.next();
        }
        for (int j = 0; j < size; j++) {
            System.out.println(arr[j]);
        }
    }
}
