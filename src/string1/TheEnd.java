//Given a string, return a string length 1 from its front, unless front is false,
// in which case return a string length 1 from its back.
// The string will be non-empty.
//
//        theEnd("Hello", true) → "H"

package string1;

public class TheEnd {
    public static String theEnd(String str, boolean front) {
        if (front) {
            return str.substring(0,1);
        }else
            return str.substring(str.length() - 1);
    }

    public static void main(String[] args) {
        String str = "Hello";
        boolean front = true;
        System.out.println(theEnd(str, front));
    }
}
