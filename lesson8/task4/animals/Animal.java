package lesson8.task4.animals;

public class Animal {
    private String location;
    private String food;
    private int ages;
    private double weight;

    public void makeNoise() {
        System.out.println(" Шум");
    }

    public void toEat() {
        System.out.println("Еда");
    }

    public void sleep() {
        System.out.println("Сон");
    }

    public Animal(String location, String food, int ages, double whight) {
        this.location = location;
        this.food = food;
        this.ages = ages;
        this.weight = whight;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public int getAges() {
        return ages;
    }

    public void setAges(int ages) {
        this.ages = ages;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Animal animal = (Animal) o;

        if (ages != animal.ages) return false;
        if (Double.compare(animal.weight, weight) != 0) return false;
        if (location != null ? !location.equals(animal.location) : animal.location != null) return false;
        return food != null ? food.equals(animal.food) : animal.food == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = location != null ? location.hashCode() : 0;
        result = 31 * result + (food != null ? food.hashCode() : 0);
        result = 31 * result + ages;
        temp = Double.doubleToLongBits(weight);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "location='" + location + '\'' +
                ", food='" + food + '\'' +
                ", ages=" + ages +
                ", weight=" + weight +
                '}';
    }
}
