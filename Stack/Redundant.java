import java.util.Stack;

public class Redundant {
    public static void main(String[] args) {
        Stack<Character> obj = new Stack<>();
        String str = "((a+b))";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ')')
                obj.push(str.charAt(i));
            else {
                if (obj.isEmpty()) {
                    System.out.println("True");
                    return;
                }
                char top = obj.pop();
                if (top == '(')
                    System.out.println("True");
                else {
                    // char temp=obj.pop();
                    while (true)// obj.pop()!='(')
                    {
                        char temp = obj.pop();
                        if (temp == '(')
                            break;
                    }
                }
            }

        }
        if (obj.isEmpty())
            System.out.println("false");
        else
            System.out.println("true");
    }
}
