//Given a string, return true if it ends in "ly".
//
//        endsLy("oddly") → true

package string1;

public class EndsLy {

    public static boolean endsLy(String str) {
        if (str.length() < 2){
            return false;
        }else {
            return (str.charAt(str.length() - 2) == 'l' && str.charAt(str.length() - 1) == 'y');
        }
    }

    public static void main(String[] args) {
        String str = "oddly";
        System.out.println(endsLy(str));
    }
}
