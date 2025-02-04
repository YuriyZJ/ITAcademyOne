package Lesson20.T01Comparator;

import java.util.Comparator;

public class ComparatorDepartmentComparator implements Comparator<Employee> {
    public int compare (Employee e1, Employee e2){
        return e1.getDepartment().compareTo(e2.getDepartment());
    }
}
