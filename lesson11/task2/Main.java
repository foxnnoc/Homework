package lesson11.task2;

public class Main {
    public static void main(String[] args) {
        Clothes[] clothes = {
                new Pants(Size.S, 150, "Red"),
                new Pants(Size.L, 255, "Green"),
                new Shirt(Size.XS, 133, "Black"),
                new Shirt(Size.XXS, 158, "Blue"),
                new Tie(Size.XXS, 50, "White"),
                new Tie(Size.M, 90, "Black"),
                new Skirt(Size.L, 450, "Orange"),
                new Skirt(Size.M, 1000, "White"),
        };
        Studio studio = new Studio();
        studio.clotheMan(clothes);
        System.out.println();
        studio.clotheWomen(clothes);
    }
}