package lesson16.task1;

import java.util.ArrayList;
import java.util.List;

public class MyCollection {
    public static void main(String[] args) {
        List<MyHeavyBox> arrayList1 = new ArrayList<>();

        arrayList1.add(new MyHeavyBox());
        arrayList1.add(new MyHeavyBox());
        arrayList1.add(new MyHeavyBox());
        arrayList1.add(new MyHeavyBox());
        arrayList1.add(new MyHeavyBox());
        arrayList1.add(new MyHeavyBox());
        for (MyHeavyBox hb : arrayList1) {
            System.out.println("Res myHeavyBox " + hb);
        }
    }
}

