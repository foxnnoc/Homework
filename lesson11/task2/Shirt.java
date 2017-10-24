package lesson11.task2;

public class Shirt extends Clothes implements MenClothes, WomenClothes {

    public Shirt(Size sizeClothes, double cost, String color) {
        super(sizeClothes, cost, color);
    }

    @Override
    public void clotheMan() {
        System.out.println("Футболка");
    }

    @Override
    public void clotheWomen() {
        System.out.println("Футболка");
    }
}
