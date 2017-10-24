package lesson8.task3.lorry;

import lesson7.task4.com.company.vehicles.Car;

public class Lorry extends Car {
    private double carrying;

    public Lorry(String nameCar, String mark, double weight, double carrying) {
        super(nameCar, mark, weight);
        this.carrying = carrying;
    }

    public double getCarrying() {
        return carrying;
    }

    public void setCarrying(double carrying) {
        this.carrying = carrying;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Lorry lorry = (Lorry) o;

        return Double.compare(lorry.carrying, carrying) == 0;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(carrying);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Lorry{" + super.toString() + "carrying=" + carrying + '}';
    }
}


