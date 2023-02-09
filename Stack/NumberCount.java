import java.util.Stack;

public class NumberCount {
    public static void main(String[] args) {
        String str = "{}}}{{}}";
        Stack<Character> obj = new Stack<>();
        obj.push(str.charAt(0));
        int i = 1, count = -1;
        while (i < str.length()) {

            if (obj.peek() == '{') {
                if (str.charAt(i) == '}') {
                    obj.pop();
                } else {
                    obj.pop();
                    count++;
                }
            } else {
                if (str.charAt(i) == '}') {
                    obj.pop();
                    count++;
                } else {
                    obj.pop();
                    count += 2;
                }
            }
            obj.push(str.charAt(++i));
            if (obj.isEmpty())
                break;
            if (i < str.length() - 1)
                i++;
        }
        if (obj.isEmpty()) {
            System.out.println(count);

        }
    }
}
// { if(str.charAt(i)=='}')// obj.peek()=='{')
// { if(obj.peek()=='{')
// obj.pop();

// else{
// obj.pop();
// count++;
// }
// }
// if(str.charAt(i)==''&& obj.peek()=='{')
// else{

// }
// obj.push(str.charAt(++i));
// i++;
// }
// }
// }
