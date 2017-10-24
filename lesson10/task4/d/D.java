package lesson10.task4.d;

import lesson10.task4.A;

public class D extends A {
    public void printInfoD() {
        System.out.println("Перемення A не доступна из класса D ");
        System.out.println("Print b: " + b);
        System.out.println("Перемення C не доступна из класса D ");
        System.out.println("Print d: " + d);
    }
}
