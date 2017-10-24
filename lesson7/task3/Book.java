package lesson7.task3;

public class Book {
    private String name;
    private Person author;

    public Book(String name, Person author) {
        this(name);
        this.author = author;
    }

    public Book(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Person getAuthor() {
        return author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Book book = (Book) o;

        if (!name.equals(book.name)) return false;
        return author != null ? author.equals(book.author) : book.author == null;
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + (author != null ? author.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author=" + author +
                '}';
    }
}
