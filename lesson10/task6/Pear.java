package lesson10.task6;

public class Pear extends Fruit {
    private static int count;

    public Pear(String sortName, double cost) {
        super(sortName, cost);
        count++;
    }

    public static int getCount() {
        return count;
    }

    @Override
    public double cost() {
        return this.getCost();
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
