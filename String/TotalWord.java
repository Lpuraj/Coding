package String;

import java.util.*;

public class TotalWord {
    public static int total(String str) {
        int size = str.length();
        if (size == 0)
            return 0;

        int count = 0;
        for (int i = 0; i < size - 1; i++) {
            if (str.charAt(i) == ' ')
                continue;
            else {
                int j = i;
                while (str.charAt(j) != ' ' && (j < size - 1)) {
                    j++;
                }
                count++;
                i = j;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String str = obj.nextLine();
        System.out.println(total(str));
    }
}
// int count = 0;
// for (int i = 0; i < str.length() - 1; i++) {
// if (str.charAt(i) == ' ')
// count++;
// }
// return count + 1;