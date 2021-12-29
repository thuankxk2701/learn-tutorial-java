package sortingSearchStudent;

public class Student {
    private String name;
    private double GPA;

    public Student(String name ,double gpa){
        this.name=name;
        this.GPA=gpa;
    }
    public String getName(){
        return name;
    }
    public String setName(String newName){
        return (this.name=newName);
    }
    public double getGPA(){
        return GPA;
    }
    public double setGPA(double newGPA){
        return (this.GPA=newGPA);
    }
    @Override
    public String toString(){
        return String.format("%s\t%f",this.name, this.GPA);
    }
}
