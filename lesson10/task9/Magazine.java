package lesson10.task9;

public class Magazine implements Printable {
    private String name;

    public Magazine(String name) {
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println("Печатается журнал \'" + getName() + '\'');
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

        Magazine magazine = (Magazine) o;

        return name.equals(magazine.name);
    }

    @Override
    public String toString() {
        return "Magazine{" + "name='" + name + '\'' + '}';
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }
}