package lesson16.task7;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ToyShop {
    public static void main(String[] args) {
        Map<String, Double> toys = new HashMap<>();
        toys.put("Doll", 250.30);
        toys.put("Car", 270.0);
        toys.put("Football", 300.60);
        toys.put("Frog", 58.65);

        Set<String> set2 = toys.keySet();
        for (String toy2 : set2) {
            System.out.println(toy2 + " " + toys.get(toy2));
        }
        System.out.println();
        Set<Map.Entry<String, Double>> set = toys.entrySet();
        for (Map.Entry<String, Double> toy : set) {
            System.out.print(toy.getKey() + ": ");
            System.out.println(toy.getValue());
        }
        System.out.println();
        Collection<Double> set3 = toys.values();
        for (Double toy3 : set3) {
            System.out.println(toy3);
        }
    }
}
