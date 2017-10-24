package lesson7.task1;

public class Person {
    private String fullName;
    private int age;

    public Person() {
        this.setFullName("Вася");
    }

    public Person(String Roman, int age) {
        this.setFullName(Roman);
        this.setAge(age);
    }

    public void talk() {
        System.out.println("Я " + getFullName() + ". Mне " + getAge() + " лет");
    }

    public void move() {
        System.out.println(getFullName() + " постоянно  ходит в школу");
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" + "fullName='" + fullName + '\'' + ", age=" + age + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        if (age != person.age) return false;
        return fullName.equals(person.fullName);
    }

    @Override
    public int hashCode() {
        int result = fullName.hashCode();
        result = 31 * result + age;
        return result;
    }
}



