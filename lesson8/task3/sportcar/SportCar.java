package lesson8.task3.sportcar;

import lesson7.task4.com.company.vehicles.Car;

/**
 * Created by roman_v on 30.05.17.
 */
public class SportCar extends Car {
    private double speed;

    public SportCar(String nameCar, String mark, double weight, double speed) {
        super(nameCar, mark, weight);
        this.speed = speed;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        SportCar sportCar = (SportCar) o;

        return Double.compare(sportCar.speed, speed) == 0;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(speed);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "SportCar{" + super.toString() + "speed=" + speed + '}';
    }
}
