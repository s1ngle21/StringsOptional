//Given 2 strings, return their concatenation,
// except omit the first char of each.
// The strings will be at least length 1.
//
//        nonStart("Hello", "There") → "ellohere"

package string1;

public class NonStart {

    public static String nonStart1(String a, String b) {
        return a.substring(1) + b.substring(1);
    }

    public static void main(String[] args) {
        String a = "Hello";
        String b = "There";
        System.out.println(nonStart1(a,b));
    }
}
