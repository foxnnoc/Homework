package lesson10.task9;

public class Main {
    public static void main(String[] args) {
        Printable[] p = new Printable[4];
        p[0] = new Book("Бабошкино поле");
        p[1] = new Book("Сон у яблонь");
        p[2] = new Magazine("Лисица и кот");
        p[3] = new Magazine("Божья коровка");
        for (Printable printable : p) {
            printable.print();
        }
    }
}