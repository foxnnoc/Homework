package lesson5_6.task3;

public class Factorial {
    public int factor(int n) {
        int res = 1;
        for (int i = 2; i <= n; i++) {
            res *= i;
        }
        return res;
    }
}
