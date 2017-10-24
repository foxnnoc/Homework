package lesson9.task1;

import lesson8.flowers.Flower;

public class Rose extends Flower {
    public enum Brand {
        WHITE(45),
        BLUE(56),
        BURGUNDY(50);

        private double cost;

        Brand(double cost) {
            this.cost = cost;
        }

        public double getCost() {
            return cost;
        }
    }

    public Brand brand;

    public Rose(String name, Brand brand) {
        super(name);
        this.brand = brand;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand2) {
        this.brand = brand2;
    }

    @Override
    public double cost() {
        return brand.cost;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Rose rose = (Rose) o;

        return brand == rose.brand;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + brand.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Rose{" + "brand=" + brand + '}';
    }
}
