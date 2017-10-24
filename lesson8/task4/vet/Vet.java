package lesson8.task4.vet;

import lesson8.task4.animals.Animal;

public class Vet {
    public static void treatAnimal(Animal animal) {
        System.out.println(animal.getClass().getSimpleName() + " ест " + animal.getFood() + " и живет " + animal.getLocation());
    }
}
