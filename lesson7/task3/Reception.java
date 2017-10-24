package lesson7.task3;

public class Reception {
    public static void main(String[] args) {
        User[] usre = {
                new User("Бучма Иван Иванович", "12/10/2005"),
                new User("Кернес Леонид Валентинович", "19/08/2009"),
                new User("Вотер Зинаида Михайловна", "29/02/2009"),};
        usre[0].setPhone(8096 - 557 - 555 - 55);
        usre[0].setFacultet("КН");
        usre[0].setIdCard(229);
        usre[0].takeBook(new Book("Букварь"));
        usre[0].returnBook(new Book("Математика 5 класс"));
        System.out.println(usre[0]);
        System.out.println();
        usre[1].setPhone(8097 - 565 - 558 - 60);
        usre[1].setFacultet("КВН");
        usre[1].setIdCard(39);
        usre[1].takeBook(new Book("Водный мир"));
        usre[1].returnBook(new Book("Криветки на сковородке"));
        System.out.println(usre[1]);
        System.out.println();
        usre[2].setPhone(8099 - 549 - 900 - 88);
        usre[2].setFacultet("КН");
        usre[2].setIdCard(888);
        usre[2].takeBook(new Book("Как сдать экзамены "));
        usre[2].returnBook(new Book("Криветки на сковородке"));
        System.out.println(usre[2]);
    }
}
