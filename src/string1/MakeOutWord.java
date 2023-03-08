package string1;

public class MakeOutWord {


    public static String makeOutWord1(String out, String word) {
        String left = out.substring(0,2);
        String right = out.substring(2);
        return left + word +right;
    }

    public static void main(String[] args) {
        String out = "<<>>";
        String word = "Yay";
        System.out.println(makeOutWord1(out, word));
    }
}
