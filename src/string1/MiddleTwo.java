//Given a string of even length, return a string made of the middle two chars,
// so the string "string" yields "ri". The string length will be at least 2.
//
//        middleTwo("string") → "ri"

package string1;

public class MiddleTwo {

    public static String middleTwo(String str) {
        int halfLength = str.length() / 2;
        return str.substring(halfLength -1, halfLength + 1);
    }

    public static void main(String[] args) {
        String str = "string";
        System.out.println(middleTwo(str));
    }
}
