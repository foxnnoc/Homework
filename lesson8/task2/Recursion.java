package lesson8.task2;

public class Recursion {
    public static void recursion(int a, int b) {
        if (a < b) {
            System.out.print(a + " ");
            recursion(a + 1, b);
        } else if (a > b) {
            System.out.print(a + " ");
            recursion(a - 1, b);
        } else {
            System.out.println(b);
        }
    }

    public static void main(String[] args) {
        recursion(12, 45);
        recursion(45, 12);
    }
}
