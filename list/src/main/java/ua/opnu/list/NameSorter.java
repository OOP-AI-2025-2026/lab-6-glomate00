package ua.opnu.list;

import java.util.Comparator;

public class NameSorter implements Comparator<Student> {
    
    private final boolean ascending;

    public NameSorter(boolean ascending) {
        this.ascending = ascending;
    }

    @Override
    public int compare(Student s1, Student s2) {
        int result = s1.getName().compareTo(s2.getName());
        return ascending ? result : -result;
    }
}
