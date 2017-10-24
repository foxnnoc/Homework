package lesson8.task4.cat;

import lesson8.task4.animals.Animal;

public class Cat extends Animal {
    private String name;
    private int lives;

    public Cat(String location, String food, int ages, double whight, String name, int lives) {
        super(location, food, ages, whight);
        this.name = name;
        this.lives = lives;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLives() {
        return lives;
    }

    public void setLives(int lives) {
        this.lives = lives;
    }

    @Override
    public void makeNoise() {
        System.out.println("Мяукает");
    }

    @Override
    public void toEat() {
        System.out.println(getFood());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Cat cat = (Cat) o;

        if (lives != cat.lives) return false;
        return name.equals(cat.name);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + lives;
        return result;
    }

    @Override
    public String toString() {
        return "Cat{" + "name='" + name + '\'' + ", lives=" + lives + '}';
    }
}
