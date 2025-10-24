package ua.opnu.list;

import java.util.Comparator;

public class AverageGradeSorter implements Comparator<Student> {
    
    private final boolean ascending;

    public AverageGradeSorter(boolean ascending) {
        this.ascending = ascending;
    }

    @Override
    public int compare(Student s1, Student s2) {
        // Double.compare повертає <0, 0, або >0
        int result = Double.compare(s1.getAverageGrade(), s2.getAverageGrade());
        return ascending ? result : -result;
    }
}
