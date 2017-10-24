package lesson11.task2;

public class Studio {
    public void clotheMan(Clothes[] clothes) {
        for (Clothes clotheMan : clothes) {
            if (clotheMan instanceof MenClothes) {
                System.out.println("Одеваем на мужщину " + clotheMan.getClass().getSimpleName() + " " + clotheMan);
            }
        }
    }

    public void clotheWomen(Clothes[] clothes) {
        for (Clothes clotheWomen : clothes) {
            if (clotheWomen instanceof WomenClothes) {
                System.out.println("Одеваем женщину " + clotheWomen.getClass().getSimpleName() + " " + clotheWomen);
            }
        }
    }
}


