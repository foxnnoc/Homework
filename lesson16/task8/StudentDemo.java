package lesson16.task8;

import java.util.LinkedList;
import java.util.List;

public class StudentDemo {
    public static void main(String[] args) {
        List<Student> studentList = new LinkedList<>();

        studentList.add(new Student("Подшибников", 3, "hi"));
        studentList.add(new Student("Шестиренкин", 3, "hi"));
        studentList.add(new Student("Восмигранников", 3, "hi"));
        studentList.add(new Student("Треугольников", 3, "hi"));
        studentList.add(new Student("Кругликов", 3, "hi"));
        studentList.add(new Student("Ромбиков", 3, "hi"));
        for (int i = 2; i < 100; i++) {
            studentList.add(new Student("Квадратов" + i, 3, "hi"));
        }
        for (Student student : studentList) {
            Teacher.formTabel(student, true);
        }
        printStudentList(studentList);
        System.out.println(studentList.size());
        Teacher.makeDecision(studentList);
        printStudentList(studentList);
        System.out.println(studentList.size());
    }

    public static void printStudentList(List<Student> studentList) {
        for (Student student : studentList) {
            System.out.println(student);
        }
        System.out.println();
    }
}