package lesson12.task3;

public class OOP {
    public static void main(String[] args) {
        String s = "Drupal often gets criticized by those who look to its source code and API expecting to\n" +
                "find certain " + "familiar aspects of Object-oriented programming. For example,\n" +
                "the word \"class\" does not appear in Drupal code as often as some might expect. Some\n" +
                "have viewed this as a deficiency.\n" + "\n" + "Although Drupal does not make thorough\n" +
                "use of the native OOP features of PHP, the Drupal code base and API does reflect some\n" +
                "principles found in object oriented programming and design. This article describes the\n" +
                "architecture of Drupal from an OOP perspective, so that programmers familiar with OOP can\n" +
                "evaluate Drupal in light of object-oriented design principles, and hopefully feel more at\n" +
                "home in the Drupal code base. In the future, as both PHP and Drupal become more mature, Drupal\n" +
                "may increasingly adopt the native OOP features of PHP.";
        System.out.println(getOOP(s));
    }
    public static String getOOP(String s) {
        return s.replaceAll("(?i)object[-\\s]*oriented[\\s]+programming", "OOP");
    }
}