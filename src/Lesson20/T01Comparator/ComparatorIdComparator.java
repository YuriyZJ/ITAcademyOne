package Lesson20.T01Comparator;

import java.util.Comparator;

public class ComparatorIdComparator implements Comparator<Employee> {
    public int compare(Employee e1, Employee e2){
        return Integer.compare(e1.getEmployeeId(), e2.getEmployeeId());
    }
}
