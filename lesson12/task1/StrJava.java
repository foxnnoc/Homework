package lesson12.task1;

public class StrJava {

    public static void main(String[] args) {
        str("I like java!!!");
    }

    public static void str(String s1) {
        System.out.println(s1.endsWith("!!!"));
        System.out.println(s1.startsWith("I like"));
        char s = s1.charAt(s1.length() - 1);
        System.out.println(s);
        System.out.println("indexOf(java) " + s1.indexOf("java"));
        System.out.println(s1.replace('a', 'o'));
        System.out.println(s1.toLowerCase());
        System.out.println(s1.toUpperCase());
        System.out.println(s1.substring(6, 14));
    }
}
