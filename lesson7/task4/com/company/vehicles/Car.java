package lesson7.task4.com.company.vehicles;

import lesson7.task4.com.company.detalis.Engine;
import lesson7.task4.com.company.professions.Driver;

public class Car {
    private String nameCar;
    private String mark;
    private double weight;
    private Driver d;
    private Engine e;

    public Car(String nameCar, String mark, double weight) {
        this.nameCar = nameCar;
        this.mark = mark;
        this.weight = weight;
    }

    public void setD(Driver d) {
        this.d = d;
    }

    public void setE(Engine e) {
        this.e = e;
    }

    public String getNameCar() {
        return nameCar;
    }

    public void setNameCar(String nameCar) {
        this.nameCar = nameCar;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void start() {
        System.out.println("Поехали");
    }

    public void stop() {
        System.out.println("Остановиться");
    }

    public void turnRight() {
        System.out.println("Поворот направо");
    }

    public void turnLeft() {
        System.out.println("Поворот налево");
    }

    @Override
    public String toString() {
        return "Car{" + "nameCar='" + nameCar + '\'' + ", mark='" + mark + '\'' + ", weight=" + weight + ", d=" + d + ", e=" + e + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        if (Double.compare(car.weight, weight) != 0) return false;
        if (!nameCar.equals(car.nameCar)) return false;
        if (!mark.equals(car.mark)) return false;
        if (!d.equals(car.d)) return false;
        return e.equals(car.e);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = nameCar.hashCode();
        result = 31 * result + mark.hashCode();
        temp = Double.doubleToLongBits(weight);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + d.hashCode();
        result = 31 * result + e.hashCode();
        return result;
    }
}
