package Exception;

import java.util.Scanner;

class Invalid extends Exception {
    public Invalid(String msg) {
        super(msg);
    }
}

public class First {
    public static void verify(int age) throws Invalid// throws always on function which is throwing
    {
        // throw an object
        if (age < 18)
            throw new Invalid("Sorry");
        else {
            System.out.println("you can");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        // try and catch
        try {
            verify(age);
        } catch (Invalid e) {
            // System.out.println("Exceeption");
        }
    }
}
