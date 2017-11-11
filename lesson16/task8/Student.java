package lesson16.task8;

import java.util.HashMap;
import java.util.Map;

public class Student {
    private String name;
    private int course;
    private String group;
    Map<Subject, Integer> map;

    public Student(String name, int course, String group) {
        this.name = name;
        this.course = course;
        this.group = group;
        map = new HashMap<>();
    }

    public Map<Subject, Integer> getMap() {
        return map;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (course != student.course) return false;
        if (!name.equals(student.name)) return false;
        if (!group.equals(student.group)) return false;
        return map.equals(student.map);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + course;
        result = 31 * result + group.hashCode();
        result = 31 * result + map.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Student{" + "name='" + name + '\'' + ", course=" + course + ", group='" + group + '\'' + ", map=" + map + '}';
    }
}