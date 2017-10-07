package lesson4.task5;
import java.util.Scanner;
/**
 * Создать программу, которая будет выводить на экран меньшее по модулю из трёх
 * введённых пользователем вещественных чисел.
 * Для вычисления модуля используйте тернарную условную операцию.
  */
public class MinOfThreeNumbers {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Введите первое число: ");
            int x = getNumber(sc);
            System.out.print("Введите второе число: ");
            int y = getNumber(sc);
            System.out.print("Введите третье число: ");
            int z = getNumber(sc);
            int minNumber = (x < y) ? (x < z) ? x : z : (y < z) ? y : z;
            System.out.println("Самое минимальное число равно: " + minNumber);
        }
    }

    public static int getNumber(Scanner sc) {
        if (sc.hasNextInt()) {
            int a = sc.nextInt();
            return a;
        } else {
            System.out.println("Вы ввели не число");
            System.exit(0);
        }
    return 0;
    }
}