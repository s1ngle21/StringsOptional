package string1;

public class HelloNameTask {

    public static String helloName(String name) {
        return "Hello " + name + "!";
    }

    public static void main(String[] args) {
        String name = "Bob";
        System.out.println(helloName(name));
    }
}
