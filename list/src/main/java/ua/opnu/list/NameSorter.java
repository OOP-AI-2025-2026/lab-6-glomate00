package ua.opnu.list;

import java.util.Comparator;

public class NameSorter implements Comparator<Student> {
    
    private final boolean ascending; // true для зростання, false для спадання

    public NameSorter(boolean ascending) {
        this.ascending = ascending;
    }

    @Override
    public int compare(Student s1, Student s2) {
        int result = s1.getName().compareTo(s2.getName());
        // Якщо сортування за спаданням, інвертуємо результат
        return ascending ? result : -result; 
    }
}
