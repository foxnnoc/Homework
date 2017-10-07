package lesson3.task3;

public class RangeOfVariables {
    public static void main(String[] args) {
        int i = 10;
        if (i == 10) {
            int d = 9;
            System.out.println("i + a: " + i + " " + d);
            i = d + 3;
            {
                int c = 157;
                System.out.println("i + a: " + i + " " + d);
                System.out.println("c: " + c);
            }
        }
        System.out.println("i равно: " + i);
    }
}