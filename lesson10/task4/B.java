package lesson10.task4;

public class B extends A {
    void printInfoB() {
        System.out.println("Перемення A не доступна из класса B ");
        System.out.println("Print b: " + b);
        System.out.println("Print c: " + c);
        System.out.println("Print d: " + d);
    }
}
