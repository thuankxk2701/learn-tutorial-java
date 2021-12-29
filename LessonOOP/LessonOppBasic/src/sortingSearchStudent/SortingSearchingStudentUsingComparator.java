package sortingSearchStudent;

import java.util.ArrayList;
import java.util.Collections;

public class SortingSearchingStudentUsingComparator {
    public static void main(String[] args){
        // ArrayList are dynamic collections of objects (reference types only)
        ArrayList<Student> psy101= new ArrayList<Student>();
        psy101.add(new Student("Sally",4.0));
        psy101.add(new Student("Dave",3.6));
        psy101.add(new Student("Alice",3.15));
        printStudents(psy101);

        System.out.println("SORT BY NAME");
        Collections.sort(psy101, new StudentNameComparator());
        printStudents(psy101);

        System.out.println("SORT BY GPA");
        Collections.sort(psy101, new StudentGpaComparator());
        printStudents(psy101);

    }
    public static void printStudents(ArrayList<Student> students){
        System.out.println("Students\tGPA");
        for (Student s:students){
            System.out.println(s);
        }
        System.out.println();
    }
}
