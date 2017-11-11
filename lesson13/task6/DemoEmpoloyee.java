package lesson13.task6;

import java.io.UnsupportedEncodingException;
import java.util.Date;

public class DemoEmpoloyee {
    public static void main(String[] args) throws UnsupportedEncodingException {
        Employee[] employees = {
                new Employee("Овальный Овалович Овалов", 1500.0 / 21, new Date()),
                new Employee("Квадратик Квадратович Квадратов", 1800.0 / 21, new Date()),
                new Employee("Ромбик Ромбикович Ромбиков", 2000.0 / 21, new Date())};
        FullReport.generateReport(employees, " ", " ");
        System.out.println();
        FullReport.generateReport(employees, "US", "US");
        System.out.println();
        FullReport.generateReport(employees, "UA", "UA");
    }
}