package lesson16.task5;

import java.util.SortedSet;
import java.util.TreeSet;

public class Category {
    private String name;
   private SortedSet<Product> products;

    public Category(String name) {
        this.name = name;
        products=new TreeSet<>();
    }

    public Category(String name, SortedSet<Product> products) {
        this.name = name;
        this.products = products;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SortedSet<Product> getProducts() {
        return products;
    }

    public void setProducts(SortedSet<Product> products) {
        this.products = products;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Category category = (Category) o;

        if (!name.equals(category.name)) return false;
        return products.equals(category.products);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + products.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Category{" + "name='" + name + '\'' + ", products=" + products + '}';
    }
}
