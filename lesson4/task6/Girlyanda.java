package lesson4.task6;

/**
 * Имеется гирлянда, состоящая из 32 лампочек. Каждая лампочка имеет два состояния - включена или выключена.
 * В начале работы программы случайным образом задайте какие лампочки будут включены. Напишите следующие методы:
 * a) метод который будет мигать лампочками гирлянды заданное количество раз; б) метод, который будет запускать гирлянду в
 * режим бегущей строки; в) метод, который будет выяснять включена ли лампочки на первой позиции;
 * г) метод который будет распечатывать текущее состояние гирлянды. Используйте побитовые операции, switch.
 */
public class Girlyanda {
    static int gr = 0b00101101_10011000_11100101_11000010;

    public static void main(String[] args) {
        rezhim(1);
    }

    public static void megat(int time) {
        for (int i = 0; i < time; i++) {
            gr = ~gr;
            print();
        }
    }

    public static void print() {
        String s = Integer.toBinaryString(gr);
        int num = 32 - s.length();
        for (int i = 0; i < num; i++) {
            s = "0" + s;
        }
        System.out.println(s);
    }

    public static void running(int time) {
        for (int i = 0; i < time; i++) {
            gr = gr >>> 1;
            print();
        }
    }

    public static void rezhim(int i) {
        switch (i) {
            case 1:
                megat(4);
                break;
            case 2:
                running(32);
                break;
            case 3:
                check(6);
        }
    }

    public static void check(int position) {
        int mask = 1 << position;
        if ((gr & mask) == mask) {
            System.out.println("Лампочка горит");
        } else {
            System.out.println("Лампочка не горит");
        }
    }
}