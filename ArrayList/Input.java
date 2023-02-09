package ArrayList;

import java.util.ArrayList;

public class Input {
    public static void main(String[] args) {
        ArrayList<String> obj = new ArrayList<>();
        System.out.println(obj.size());
        obj.add("ram");
        String var = obj.get(0);
        System.out.println(var);
        System.out.println(obj.size());
        obj.set(0, "Laxman");// 1.5 time
        for (String a : obj) {
            a = "Boy";
            System.out.println(a);
        }
    }

}
