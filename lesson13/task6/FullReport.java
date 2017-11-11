package lesson13.task6;

import java.io.UnsupportedEncodingException;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.ResourceBundle;

public class FullReport {
    public static void generateReport(Employee[] employees, String country, String language) throws UnsupportedEncodingException {
        Locale locale = new Locale(language, country);
        ResourceBundle rb = ResourceBundle.getBundle("text", locale);
        String s1 = rb.getString("text1");
        String s2 = rb.getString("text2");
        String s3 = rb.getString("text3");
        s1 = new String(s1.getBytes("ISO-8859-1"), "UTF-8");
        s2 = new String(s2.getBytes("ISO-8859-1"), "UTF-8");
        s3 = new String(s3.getBytes("ISO-8859-1"), "UTF-8");
        NumberFormat nf = NumberFormat.getInstance();
        nf.setMaximumFractionDigits(2);
        DateFormat fd = DateFormat.getDateInstance(DateFormat.SHORT);
        System.out.printf("%-30S    %-10S    %S\n", s1, s2, s3);
        for (Employee employee : employees) {
            System.out.printf("%-30s    %-10s    %s\n", employee.getFullName(), nf.format(employee.getSalary()), fd.format(employee.getSalaryDate()));
        }
    }
}