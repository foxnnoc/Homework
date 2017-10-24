package lesson8.task4.horse;

import lesson8.task4.animals.Animal;

public class Horse extends Animal {
    private String name;
    private double carrying;

    public Horse(String location, String food, int ages, double whight, String name, double carrying) {
        super(location, food, ages, whight);
        this.name = name;
        this.carrying = carrying;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCarrying() {
        return carrying;
    }

    public void setCarrying(double carrying) {
        this.carrying = carrying;
    }

    @Override
    public void makeNoise() {
        System.out.println("Ржет");
    }

    @Override
    public void toEat() {
        System.out.println(getFood());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Horse horse = (Horse) o;

        if (Double.compare(horse.carrying, carrying) != 0) return false;
        return name.equals(horse.name);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name.hashCode();
        temp = Double.doubleToLongBits(carrying);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Horse{" + "name='" + name + '\'' + ", carrying=" + carrying + '}';
    }
}



