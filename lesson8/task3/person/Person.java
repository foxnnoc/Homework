package lesson8.task3.person;

public class Person {
    private String fullname;
    private int age;

    public Person(String fullname, int age) {
        this.fullname = fullname;
        this.age = age;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (age != person.age) return false;
        return fullname.equals(person.fullname);
    }

    @Override
    public int hashCode() {
        int result = fullname.hashCode();
        result = 31 * result + age;
        return result;
    }

    @Override
    public String toString() {
        return "Person{" + super.toString() + "fullname='" + fullname + '\'' + ", age=" + age + '}';
    }
}
