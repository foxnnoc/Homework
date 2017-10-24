package lesson9.task1;

import lesson8.flowers.Flower;

public class Tulpan extends Flower {
    public enum Brand {
        YELLOW(15),
        RED(30),
        PINK(45.33);

        private double cost;

        Brand(double cost) {
            this.cost = cost;
        }

        public double getCost() {
            return cost;
        }
    }

    private Brand brand;

    public Tulpan(String name, Brand brand) {
        super(name);
        this.brand = brand;
    }

    public Tulpan(String name) {
        super(name);
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    @Override
    public double cost() {
        return brand.getCost();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Tulpan tulpan = (Tulpan) o;

        return brand == tulpan.brand;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + brand.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Tulpan{" + "brand=" + brand + '}';
    }
}
