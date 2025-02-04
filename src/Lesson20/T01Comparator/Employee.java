package Lesson20.T01Comparator;

/*Employees in a Company
Создайте класс «Employee» с атрибутами employeeId, name, department, и salary.
Пусть класс «Employee» реализует Comparable для сортировки сотрудников по зарплате.
Создайте «ComparatorNameComparator», «ComparatorDepartmentComparator» «ComparatorIdComparator» для сортировки по соответствующим атрибутам.*/

import java.util.Objects;

public class Employee implements Comparable<Employee> {
    private int employeeId;
    private String name;
    private String department;
    private int salary;

    public Employee(){

    }

    public Employee(int employeeId, String name, String department, int salary){
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public int getEmployeeId(){
        return employeeId;
    }

    public void setEmployeeId(int employeeId){
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int compareTo(Employee employee){
        return Integer.compare(this.salary, employee.getSalary());
    }


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return employeeId == employee.employeeId && salary == employee.salary && Objects.equals(name, employee.name) && Objects.equals(department, employee.department);
    }

    @Override
    public int hashCode() {
        return Objects.hash(employeeId, name, department, salary);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }
}
