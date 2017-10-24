package lesson10.task6;

public class Main {

    public static void main(String[] args) {
        Fruit[] fruits = {
                new Apple(" Лигольд", 23),
                new Apple(" Белый налив", 13.50),
                new Apricot("Цунами", 55),
                new Apricot("Ледана", 56),
                new Pear("Вильямс", 70.50),
                new Pear("Велеса", 55)};

        System.out.println("Всего продано " + Fruit.getCount() + " фруктов. Стоимость всех фруктов " + totalCost(fruits));
        System.out.println("Всего продано " + Apple.getCount() + " яблок. Стоимость проданых яблок " + applesTotalCost(fruits));
        System.out.println("Всего продано " + Apricot.getCount() + " абрикос. Стоимость проданых абрикос " + apricotTotalCost(fruits));
        System.out.println("Всего продано " + Pear.getCount() + " груш. Стоимость проданых груш " + pearTotalCost(fruits));
    }

    public static double applesTotalCost(Fruit[] fruits) {
        double sum = 0;
        for (Fruit fruit : fruits) {
            if (fruit instanceof Apple) sum += fruit.cost();
        }
        return sum;
    }

    public static double apricotTotalCost(Fruit[] fruits) {
        double sum = 0;
        for (Fruit fruit : fruits) {
            if (fruit instanceof Apricot) sum += fruit.cost();
        }
        return sum;
    }

    public static double pearTotalCost(Fruit[] fruits) {
        double sum = 0;
        for (Fruit fruit : fruits) {
            if (fruit instanceof Pear) sum += fruit.cost();
        }
        return sum;
    }

    public static double totalCost(Fruit[] fruits) {
        double sum = 0;
        for (Fruit fruit : fruits) {
            sum += fruit.cost();
        }
        return sum;
    }
}

