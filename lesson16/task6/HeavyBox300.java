package lesson16.task6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class HeavyBox300 {
    public static void main(String[] args) {
        List<MyHeavyBox2> arrayBox = new ArrayList<>();
        arrayBox.add(new MyHeavyBox2(300));
        arrayBox.add(new MyHeavyBox2(60));
        arrayBox.add(new MyHeavyBox2(290));
        arrayBox.add(new MyHeavyBox2(900));
        arrayBox.add(new MyHeavyBox2(800));
        System.out.println(arrayBox);
        System.out.println(getHeavyBoxes2(arrayBox));
        System.out.println(arrayBox);
    }

    public static List<MyHeavyBox2> getHeavyBoxes2(List<MyHeavyBox2> arrBox) {
        List<MyHeavyBox2> arrayBox2 = new ArrayList<>();
        Iterator<MyHeavyBox2> iterator = arrBox.iterator();
        while (iterator.hasNext()) {
            MyHeavyBox2 elem = iterator.next();
            if (elem.getWeight() > 300) {
                arrayBox2.add(elem);
                iterator.remove();
            }
        }
        return arrayBox2;
    }
}
