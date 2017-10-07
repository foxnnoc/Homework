package lesson3.task4;

import java.util.Scanner;

public class SumOfTwoInt {
    public static int getNextInt(Scanner sc) {
        if (sc.hasNextInt()) {
            return sc.nextInt();
        } else {
            System.out.println("Ошибка! Вы ввели не целое число!");
            System.exit(0);
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int x = getNextInt(sc);
        System.out.print("Введите второе число: ");
        int y = getNextInt(sc);
        int z = x + y;
        System.out.println("Результат: " + z);
    }
}

