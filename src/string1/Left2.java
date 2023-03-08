
//Given a string, return a "rotated left 2"
// version where the first 2 chars are moved to the end.
// The string length will be at least 2.

//        left2("Hello") → "lloHe"

package string1;

public class Left2 {

    public static String Left21(String str) {
        String right = str.substring(0,2);
        String left = str.substring(2);
        return left + right;
    }

    public static void main(String[] args) {
        String str = "Hello";
        System.out.println(Left21(str));
    }
}
