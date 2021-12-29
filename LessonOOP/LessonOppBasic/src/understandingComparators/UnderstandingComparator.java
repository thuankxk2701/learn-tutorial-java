package understandingComparators;

import java.util.ArrayList;
import java.util.Collections;
public class UnderstandingComparator {
    public static void main(String[] args){
        ArrayList<Student> students=new ArrayList<Student>();

        students.add(new Student("Sally",4.0, 19));
        students.add(new Student("Dave",3.6, 20));
        students.add(new Student("Alice",3.15, 22));
        students.add(new Student("Steve",3.8, 20));
        students.add(new Student("Arthur",2.3, 18));
        printStudents(students);

        System.out.println("SORT BY NAME");
        Collections.sort(students,new StudentNameComparator());
        printStudents(students);

        System.out.println("SORT BY GPA");
        Collections.sort(students, new StudentGpaComparator());
        printStudents(students);

        System.out.println("SORT BY AGE");
        Collections.sort(students, new StudentAgeComparator());
        printStudents(students);

        System.out.println("SORT BY GPA (Highest First)");
        Collections.sort(students, new StudentGpaDescendingComparator());
        printStudents(students);
    }
    public static void printStudents(ArrayList<Student> students){
        System.out.printf("Student\tAge\tGPA\n");
        for(Student s:students){
            System.out.println(s);
        }
        System.out.println();
    }
}
