package lesson16.task4;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class StudentDemo {
    public static void main(String[] args) {
        List<Student> stud = new LinkedList<>();
        stud.add(new Student("Пертов Илья Абрамович", 3));
        stud.add(new Student("Иванов Иван Петрович", 4));
        stud.add(new Student("Сидоров Илья Алексеевич", 2));
        stud.add(new Student("Ломакина Юлия Владимировна", 5));
        stud.add(new Student("Гунько Марина Романовна", 1));
        stud.add(new Student("Суркис Маским Петрович", 2));
        getStuds( stud, 2);
    }

    public static void getStuds(List<Student> stud, int st) {
        Iterator<Student> std = stud.iterator();
        while (std.hasNext()) {
            Student element = std.next();
            int st2 = element.getCourse();
            if (st == st2) {
                System.out.println(element);
            }
        }
    }
}

