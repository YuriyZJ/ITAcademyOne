package Lesson20.T01Comparator;

import java.util.Comparator;

public class ComparatorNameComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee employee1, Employee employee2) {
        return employee1.getName().compareTo(employee2.getName());
    }
}
