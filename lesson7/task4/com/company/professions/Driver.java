package lesson7.task4.com.company.professions;

import lesson8.task3.person.Person;

public class Driver extends Person {
    private double experience;

    public Driver(String fullname, int age, double experience) {
        super(fullname, age);
        this.experience = experience;
    }

    public double getExperience() {
        return experience;
    }

    public void setExperience(double experience) {
        this.experience = experience;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Driver driver = (Driver) o;

        return Double.compare(driver.experience, experience) == 0;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(experience);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Driver{" + "experience=" + experience + '}';
    }
}
