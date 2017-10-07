package lesson5_6.task3;
import java.util.Random;
/**
 * Реализовать подсчет факториала используя цикл for.
 */
public class SearchFactorial {
    public static void main(String[] args) {
        Random random = new Random();
        int n = random.nextInt(10);
        Factorial factorial = new Factorial();
        System.out.println(n + " != " + factorial.factor(n));
    }
}


