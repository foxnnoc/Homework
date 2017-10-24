package lesson11.task2;

public class Skirt extends Clothes implements WomenClothes {

    public Skirt(Size sizeClothes, double cost, String color) {
        super(sizeClothes, cost, color);
    }

    @Override
    public void clotheWomen() {
        System.out.println("Юбка");
    }
}
