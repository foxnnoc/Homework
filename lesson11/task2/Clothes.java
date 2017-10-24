package lesson11.task2;

public abstract class Clothes {
    private Size sizeClothes;
    private double cost;
    private String color;

    public Clothes(Size sizeClothes, double cost, String color) {
        this.sizeClothes = sizeClothes;
        this.cost = cost;
        this.color = color;
    }

    public Size getSizeClothes() {
        return sizeClothes;
    }

    public void setSizeClothes(Size sizeClothes) {
        this.sizeClothes = sizeClothes;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Clothes clothes = (Clothes) o;

        if (Double.compare(clothes.cost, cost) != 0) return false;
        if (sizeClothes != clothes.sizeClothes) return false;
        return color.equals(clothes.color);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = sizeClothes.hashCode();
        temp = Double.doubleToLongBits(cost);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + color.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Clothes{" + "sizeClothes=" + sizeClothes + ", cost=" + cost + ", color='" + color + '\'' + '}';
    }
}
