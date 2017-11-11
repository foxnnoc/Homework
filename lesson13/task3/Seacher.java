package lesson13.task3;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Seacher {
    private static List<String> words = new ArrayList<>();

    public static int numberOfWords() {
        return words.size();
    }

    public static List<String> getWords(String s, String regex) {
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(s);
        while (m.find()) {
            words.add(s.substring(m.start(), m.end()));
        }
        return words;
    }
}