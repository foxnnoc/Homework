package lesson16.task5;

import java.util.Comparator;

public class ProdRatingComporator implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        return o1.getRating() >= o2.getRating() ? 1 : -1;
    }
}
