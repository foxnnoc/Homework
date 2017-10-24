package lesson9.task1;

import lesson8.flowers.Flower;

public class Main {
    public static void main(String[] args) {
        Flower[] buket1 = {
                new Tulpan("Желтый тюльпан", Tulpan.Brand.YELLOW),
                new Tulpan("Красный тюльпан", Tulpan.Brand.RED),
                new Tulpan("Розовый тюльпан", Tulpan.Brand.PINK)};

        double buketCost = 0;
        for (Flower flower : buket1) {
            buketCost += flower.cost();
        }
        System.out.println("Стоимость букета из тюльпанов " + buketCost);

        Flower[] buket2 = {
                new Rose("Белая роза", Rose.Brand.WHITE),
                new Rose("Голубая роза", Rose.Brand.BLUE),
                new Rose("Бордовая роза", Rose.Brand.BURGUNDY)};
        double buketCost2 = 0;
        for (Flower flower : buket2) {
            buketCost2 += flower.cost();
        }
        System.out.println("Стоимость букета из роз " + buketCost2);
        Flower[] buket3 = {
                new Exotic("Фаленопсис ", Exotic.Brand.PHALAENOPSIS),
                new Exotic("Спрекелия ", Exotic.Brand.SPREKELIA),
                new Exotic("Литопс ", Exotic.Brand.LITHOPS)};
        double buketCost3 = 0;
        for (Flower flower : buket3) {
            buketCost3 += flower.cost();
        }
        System.out.println("Стоимось букета из экзотических цветов " + buketCost3);

        System.out.println("Всего продано " + Flower.getCount());
    }
}
