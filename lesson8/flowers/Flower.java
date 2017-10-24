package lesson8.flowers;

public abstract class Flower {
    private String name;
    private static int count;

    public Flower(String name) {
        this.setName(name);
        count++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Flower flower = (Flower) o;

        return name.equals(flower.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }

    @Override
    public String toString() {
        return "Flower{" + "name='" + name + '\'' + '}';
    }

    public static int getCount() {
        return count;
    }

    public abstract double cost();
}
