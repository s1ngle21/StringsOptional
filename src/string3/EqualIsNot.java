//Given a string, return true if the number of appearances
// of "is" anywhere in the string is equal to the number of appearances
// of "not" anywhere in the string (case sensitive).
//        equalIsNot("This is not") → false
//        equalIsNot("This is notnot") → true
//        equalIsNot("noisxxnotyynotxisi") → true

package string3;

public class EqualIsNot {
    public static void main(String[] args) {
        String str = "noisxxnotyynotxisi";
        System.out.println(equalIsNot(str));
    }

    public static boolean equalIsNot(String str) {
        int cnt1 = 0;
        int cnt2 = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == 'i' && str.charAt(i + 1) == 's') {
                cnt1++;
            }
            if (str.charAt(i) == 'n' && str.charAt(i + 1) == 'o' && str.charAt(i + 2) == 't') {
                cnt2++;
            }
        }
        if (cnt1 != cnt2){
            return false;
        }
        return true;
    }
}
