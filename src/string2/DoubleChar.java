//Given a string, return a string where for every char in the original, there are two chars.
//
// doubleChar("The") → "TThhee"

package string2;

public class DoubleChar {
    public static void main(String[] args) {
        String str = "The";
        System.out.println(doubleChar(str));
    }

    public static String doubleChar(String str) {
        String str2 = "";
        for (int i = 0; i < str.length(); i++) {
            str2 = str2 + str.charAt(i) + str.charAt(i);
        }
        return str2;
    }
}
