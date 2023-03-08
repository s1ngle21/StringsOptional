package string1;

public class WithoutEnd {

    public static String withoutEnd1(String str) {
        return str.substring(1, str.length() - 1);
    }

    public static void main(String[] args) {
        String str = "Hello";
        System.out.println(withoutEnd1(str));
    }
}
