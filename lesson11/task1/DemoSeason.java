package lesson11.task1;

public class DemoSeason {
    public static void main(String[] args) {
        Season season = Season.WINTER;

        switch (season) {
            case WINTER: {
                System.out.println("Падает снег. Холодно");
                break;
            }
            case SPRING: {
                System.out.println("Тает снег");
                break;
            }
            case SUMMER: {
                System.out.println("Тепло");
                break;
            }
            case AUTUMN: {
                System.out.println("Опадают листья");
                break;
            }
        }

        for (Season s : Season.values()) {
            System.out.println(s + " " + s.getTemp());
            s.getDescription();
        }
        System.out.println();
        season = Season.valueOf("WINTER");
        System.out.println("Мой любимый сезон " + season);
    }
}
