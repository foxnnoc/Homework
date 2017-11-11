package lesson16.task8;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Teacher {
    public static void formTabel(Student student, boolean isFill) {
        for (Subject o : Subject.values()) {
            if (o.getCourses().contains(student.getCourse())) {
                if (isFill) {
                    student.getMap().put(o, (int) (Math.round(Math.random() * 3 + 2)));
                } else {
                    student.getMap().put(o, 0);
                }
            }
        }
    }

    public static boolean isRemoved(Student student) {
        double st = 0;
        Map<Subject, Integer> marks = student.getMap();
        for (Subject subject : marks.keySet()) {
            st += marks.get(subject);
        }
        st /= marks.size();
        return st < 3;
    }

    public static void makeDecision(List<Student> students) {
        Iterator<Student> iter = students.iterator();
        while (iter.hasNext()) {
            Student student = iter.next();
            if (isRemoved(student)) {
                iter.remove();
            } else {
                if (student.getCourse() < 5) {
                    student.setCourse(student.getCourse() + 1);
                    student.getMap().clear();
                    formTabel(student, false);
                } else {
                    student.setCourse(-1);
                }
            }
        }
    }
}
