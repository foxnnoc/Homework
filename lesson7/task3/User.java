package lesson7.task3;

public class User extends Person {
    private int idCard;
    private String facultet;

    public User(String fullname, String birthday) {
        super(fullname, birthday);
    }

    public int getIdCard() {
        return this.idCard;
    }

    public void setIdCard(int idCard) {
        this.idCard = idCard;
    }

    public String getFacultet() {
        return facultet;
    }

    public void setFacultet(String facultet) {
        this.facultet = facultet;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        if (!super.equals(o)) return false;

        User user = (User) o;

        if (idCard != user.idCard) return false;
        return facultet != null ? facultet.equals(user.facultet) : user.facultet == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + idCard;
        result = 31 * result + (facultet != null ? facultet.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "User{" + "name='" + getFullname() + '\'' + ", idCard=" + idCard + ", facultet='" + facultet + '\'' + '}';
    }

    public void takeBook(int count) {
        System.out.println(this.getFullname() + " взял книг - " + count + " шт");
    }

    public void takeBook(String... books) {
        System.out.print(this.getFullname() + " взял ");
        for (String book : books) {
            System.out.print('\"' + book + "\", ");
        }
        System.out.println();
    }

    public void takeBook(Book... books) {
        System.out.print(this.getFullname() + " взял ");
        for (Book book : books) {
            System.out.print('\"' + book.getName() + "\", ");
        }
        System.out.println();
    }

    public void returnBook(Book book) {
        System.out.println(this.getFullname() + " отдал " + book.getName());
    }

    public void returnBook(String... books) {
        System.out.print(this.getFullname() + " отдал ");
        for (String book : books) {
            System.out.print('\"' + book + "\", ");
        }
        System.out.println();
    }

    public void returnBook(Book... books) {
        System.out.print(this.getFullname() + " отдал ");
        for (Book book : books) {
            System.out.print('\"' + book.getName() + "\", ");
        }
        System.out.println();
    }
}