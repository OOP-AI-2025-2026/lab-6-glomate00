package ua.opnu.list;

import java.util.Comparator;

public class LastNameSorter implements Comparator<Student> {
    
    private final boolean ascending;

    public LastNameSorter(boolean ascending) {
        this.ascending = ascending;
    }

    @Override
    public int compare(Student s1, Student s2) {
        int result = s1.getLastName().compareTo(s2.getLastName());
        return ascending ? result : -result;
    }
}
