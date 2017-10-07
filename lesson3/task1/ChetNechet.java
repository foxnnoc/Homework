package lesson3.task1;

import java.util.Scanner;

public class ChetNechet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        System.out.print("Введите число: ");
        if (sc.hasNextInt()) {
            i = sc.nextInt();
            if ((i % 2) == 0) {
                System.out.println("Вы ввели четное число ");
            } else {
                System.out.println("Вы ввели нечетное число ");
            }
        } else {
            System.out.println("ОШИБКА");
        }
    }
}