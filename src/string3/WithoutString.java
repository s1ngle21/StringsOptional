//Given two strings, base and remove, return a version
// of the base string where all instances of the remove
// string have been removed (not case sensitive).
// You may assume that the remove string is length 1 or more.
// Remove only non-overlapping instances,
// so with "xxx" removing "xx" leaves "x".
//
//
//        withoutString("Hello there", "llo") → "He there"
//        withoutString("Hello there", "e") → "Hllo thr"
// Just for pull request 

package string3;

public class WithoutString {
    public static void main(String[] args) {
        String base = "Hi HoHo";
        String remove = "Ho";
        System.out.println(withoutString(base, remove));
    }

    public static String withoutString(String base, String remove) {
        String str = "";
        String remove1 = remove.toLowerCase();
        String base1 = base.toLowerCase();
        for (int i = 0; i < base.length(); i++) {
            if (!base1.contains(remove1)) {
                return base;
            } else str = base.replaceAll("(?i)" + remove, "");
        }
        return str;
    }
}
