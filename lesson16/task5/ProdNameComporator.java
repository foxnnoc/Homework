package lesson16.task5;

import java.util.Comparator;

public class ProdNameComporator implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        return o1.getName().compareTo(o2.getName()) >= 0 ? 1 : -1;
    }
}
