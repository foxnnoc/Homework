package lesson8.task4.dog;

import lesson8.task4.animals.Animal;

public class Dog extends Animal {
    private String name;
    private double biteForce;

    public Dog(String location, String food, int ages, double whight, String name, double biteForce) {
        super(location, food, ages, whight);
        this.name = name;
        this.biteForce = biteForce;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBiteForce() {
        return biteForce;
    }

    public void setBiteForce(double biteForce) {
        this.biteForce = biteForce;
    }

    @Override
    public void makeNoise() {
        System.out.println("Лает");
    }

    @Override
    public void toEat() {
        System.out.println(getFood());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Dog dog = (Dog) o;

        if (Double.compare(dog.biteForce, biteForce) != 0) return false;
        return name.equals(dog.name);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name.hashCode();
        temp = Double.doubleToLongBits(biteForce);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Dog{" + "name='" + name + '\'' + ", biteForce=" + biteForce + '}';
    }
}
