package Lesson20.T01Comparator;

/*Employees in a Company
Создайте класс «Employee» с атрибутами employeeId, name, department, и salary.
Пусть класс «Employee» реализует Comparable для сортировки сотрудников по зарплате.
Создайте «ComparatorNameComparator», «ComparatorDepartmentComparator» «ComparatorIdComparator» для сортировки по соответствующим атрибутам.*/

import Lesson12.H03.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employee = new ArrayList<>();

        employee.add(new Employee(1, "Сидоров", "бухгалтер", 1000));
        employee.add(new Employee(2, "Петров", "главбух", 1500));
        employee.add(new Employee(3, "Смирнов", "начальник отдела", 1300));
        employee.add(new Employee(4, "Васильев", "инженер", 450));
        employee.add(new Employee(5, "Иванов", "заместитель начальника", 1150));

        Collections.sort(employee);
        for (Employee emp : employee) {
            System.out.println(emp);
        }

        System.out.println("\n =================List1=================");

        employee.sort(new ComparatorIdComparator());
        System.out.println(employee);

        System.out.println("\n =================List2=================");

        employee.sort(new ComparatorNameComparator());
        for (Employee emp : employee) {
            System.out.println(emp.toString());
        }

        System.out.println("\n ===============List3===============");
        employee.sort(new ComparatorDepartmentComparator());
        for (Employee emp : employee) {
            System.out.println(emp.toString());
        }
    }
}


/*
        TreeSet<Employee> employees = new TreeSet<>(); // можно создать TreeSet - он автоматически сортирует массив
        employees.add(new Employee("Денис", 50000));
        employees.add(new Employee("Елена", 70000));
        employees.add(new Employee("Сергей", 60000));

        for (Employee e : employees) {
        System.out.println(e);*/
