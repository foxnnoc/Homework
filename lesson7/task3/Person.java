package lesson7.task3;

public class Person {
    private String fullname;
    private String birthday;
    private int phone;

    public Person(String fullname, String birthday) {
        this.fullname = fullname;
        this.birthday = birthday;
    }

    public String getFullname() {
        return fullname;
    }

    public String getBirthday() {
        return birthday;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (phone != person.phone) return false;
        if (!fullname.equals(person.fullname)) return false;
        return birthday.equals(person.birthday);
    }

    @Override
    public int hashCode() {
        int result = fullname.hashCode();
        result = 31 * result + birthday.hashCode();
        result = 31 * result + phone;
        return result;
    }

    @Override
    public String toString() {
        return "Person{" +
                "fullname='" + fullname + '\'' +
                ", birthday='" + birthday + '\'' +
                ", phone=" + phone +
                '}';
    }
}
