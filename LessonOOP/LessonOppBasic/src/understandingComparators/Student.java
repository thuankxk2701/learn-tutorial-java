package understandingComparators;

public class Student {
    private String Name;
    private double GPA;
    private int age;

    public Student(String name,double gpa,int age){
        this.Name=name;
        this.GPA=gpa;
        this.age=age;
    }
    public String getName(){
        return  Name;
    }
    public String setName(String name){
        return this.Name=name;
    }
    public double getGPA(){
        return GPA;
    }
    public double setGPA( double newGpa){
        return this.GPA=newGpa;
    }
    public int getAge(){
        return age;
    }
    public int setAge(int newAge){
        return this.age=newAge;
    }
    @Override
    public String toString(){
        return String.format("%s\t%d\t%f",this.Name, this.age, this.GPA);
    }
}
