package lesson8.task4.animals;

import lesson8.task4.cat.Cat;
import lesson8.task4.dog.Dog;
import lesson8.task4.horse.Horse;
import lesson8.task4.vet.Vet;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = {
                new Cat("в доме.", "корм", 2, 2.5, "Муська", 5),
                new Cat("в вартире.", "рыбу", 5, 3, "Кузя", 8),
                new Cat("в доме.", "молоко", 12, 12, "Ленин", 3),
                new Dog("во воре.", "кость", 3, 6, "Шарик", 9),
                new Dog("в квартире.", "корм для собак", 8, 2, "Номи", 12),
                new Dog("в квартире.", "кость", 6, 9, "Арчебальд", 14.5),
                new Horse("в сарае.", "овес", 15, 450, "Скакун", 300)};
        for (Animal a : animals) {
            Vet.treatAnimal(a);
        }
    }
}