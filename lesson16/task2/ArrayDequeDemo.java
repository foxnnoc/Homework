package lesson16.task2;

import lesson16.task1.MyHeavyBox;

import java.util.Deque;
import java.util.ArrayDeque;

public class ArrayDequeDemo {
    public static void main(String[] args) {
        Deque<MyHeavyBox> qBox = new ArrayDeque<>();

        qBox.add(new MyHeavyBox());
        qBox.add(new MyHeavyBox());
        qBox.add(new MyHeavyBox());
        qBox.add(new MyHeavyBox());

        while (!qBox.isEmpty()) {
            System.out.println(qBox.remove() + " ");
        }
    }
}