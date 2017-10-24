package lesson7.task4.com.company.detalis;

public class Engine {
    private int power;
    private String manufacturer;

    public Engine(int power, String manufacturer) {
        this.setPower(power);
        this.setManufacturer(manufacturer);
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Engine engine = (Engine) o;

        if (power != engine.power) return false;
        return manufacturer.equals(engine.manufacturer);
    }

    @Override
    public String toString() {
        return "Engine{" +
                "power=" + power +
                ", manufacturer='" + manufacturer + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        int result = power;
        result = 31 * result + manufacturer.hashCode();
        return result;
    }
}
