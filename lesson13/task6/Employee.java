package lesson13.task6;

import java.util.Date;

public class Employee {
    private String fullName;
    private double salary;
    private Date salaryDate;

    public Employee(String fullName, double salary, Date salaryDate) {
        this.fullName = fullName;
        this.salary = salary;
        this.salaryDate = salaryDate;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public double getSalary() {
        return salary;
    }

    public Date getSalaryDate() {
        return salaryDate;
    }

    public void setSalaryDate(Date salaryDate) {
        this.salaryDate = salaryDate;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;

        if (Double.compare(employee.salary, salary) != 0) return false;
        if (!fullName.equals(employee.fullName)) return false;
        return salaryDate.equals(employee.salaryDate);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = fullName.hashCode();
        temp = Double.doubleToLongBits(salary);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + salaryDate.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Employee{" + "fullName='" + fullName + '\'' + ", salary=" + salary + ", salaryDate=" + salaryDate + '}';
    }
}