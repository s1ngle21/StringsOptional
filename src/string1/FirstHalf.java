package string1;

public class FirstHalf {

    public static String firstHalf1(String str) {
        int halfLength = str.length() / 2;
        return str.substring(0, halfLength);
    }

    public static void main(String[] args) {
        String str = "WooHoo";
        System.out.println(firstHalf1(str));
    }
}

