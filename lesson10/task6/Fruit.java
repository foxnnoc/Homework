package lesson10.task6;

public abstract class Fruit {
    private String name;
    private double cost;
    private static int count;

    public Fruit(String sortName, double cost) {
        this.name = sortName;
        this.cost = cost;
        count++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public final void printManufacturerInfo() {
        System.out.println("Made in Ukraine");
    }

    public abstract double cost();

    public double getCost() {
        return cost;
    }

    public static int getCount() {
        return count;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Fruit fruit = (Fruit) o;

        if (Double.compare(fruit.cost, cost) != 0) return false;
        return name.equals(fruit.name);
    }

    @Override
    public String toString() {
        return "Fruit{" + "name='" + name + '\'' + ", cost=" + cost + '}';
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name.hashCode();
        temp = Double.doubleToLongBits(cost);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}


