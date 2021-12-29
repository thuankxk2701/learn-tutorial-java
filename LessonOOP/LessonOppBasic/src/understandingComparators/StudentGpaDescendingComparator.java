package understandingComparators;

import java.util.Comparator;

public class StudentGpaDescendingComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1,Student s2){
        return (int)(1000*(s2.getGPA()-s1.getGPA()));
    }
}
