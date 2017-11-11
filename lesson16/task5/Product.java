package lesson16.task5;

public class Product {
    private String name;
    private double cost;
    private int rating;

    public Product(String name, double cost, int rating) {
        this.name = name;
        this.cost = cost;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;

        if (Double.compare(product.cost, cost) != 0) return false;
        if (rating != product.rating) return false;
        return name.equals(product.name);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name.hashCode();
        temp = Double.doubleToLongBits(cost);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + rating;
        return result;
    }

    @Override
    public String toString() {
        return "Product{" + "name='" + name + '\'' + ", cost=" + cost + ", rating=" + rating + '}';
    }
}
