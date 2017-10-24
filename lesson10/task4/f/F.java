package lesson10.task4.f;

import lesson10.task4.A;

public class F {
    public void printInfoF() {
        System.out.println("Перемення A не доступна из класса A");
        System.out.println("Перемення B не доступна из класса B");
        System.out.println("Перемення C не доступна из класса C");
        System.out.println("Print d: " + new A().d);
    }
}