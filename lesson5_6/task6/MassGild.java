package lesson5lesson6.task6;

import java.util.Arrays;
import java.util.Scanner;

public class MassGild {

    static int[] gir = {1, 0, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 0, 0};

    public static void main(String[] args) {
        System.out.println("Выберать режим: 1 Мигать, 2 Бегущая строка, 3 Проверка лампочки");
        Scanner sc = new Scanner(System.in);
        int mod = sc.nextInt();
        switch (mod) {
            case 1:
                megat(10);
                break;
            case 2:
                running(12);
                break;
            case 3:
                check(7);
        }
    }

    public static void megat(int time) {
        for (int i = 0; i < time; i++) {
            for (int j = 0; j < gir.length; j++) {
                if (gir[j] == 1) {
                    gir[j] = 0;
                } else {
                    gir[j] = 1;
                }
            }
            print();
        }
    }

    public static void print() {
        System.out.println(Arrays.toString(gir));
    }

    public static void running(int time) {
        for (int i = 0; i < time; i++) {
            int temp = gir[gir.length - 1];
            for (int j = gir.length - 1; j > 0; j--) {
                gir[j] = gir[j - 1];
            }
            gir[0] = temp;
            print();
        }
    }

    public static void check(int position) {
        if (gir[position - 1] == 1) {
            System.out.println("Лампочка горит");
        } else {
            System.out.println("Лампочка не горит");
        }
    }
}
