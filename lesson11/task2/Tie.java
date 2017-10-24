package lesson11.task2;

public class Tie extends Clothes implements MenClothes {

    public Tie(Size sizeClothes, double cost, String color) {
        super(sizeClothes, cost, color);
    }

    @Override
    public void clotheMan() {
        System.out.println("Галстук");
    }
}
