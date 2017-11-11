package lesson13.task3;

public class DemoLatinWords {
    public static void main(String[] args) {
        String s = "Total War: SHOGUN 2 включает в себя как огромные детально проработанные \n " +
                "реалистичные битвы, сделавшие имя этой серии,\n" +
                " так и тактическую карту кампании, которую многие считают душой и сердцем Total War.";

        System.out.println(Seacher.getWords(s, "[A-Za-z]+"));
        System.out.println("Найдено количество латинских слов: " + Seacher.numberOfWords());
    }
}