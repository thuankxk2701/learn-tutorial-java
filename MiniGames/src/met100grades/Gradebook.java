package met100grades;

public class Gradebook {
    public final double maxPoints = 450.0;
    private int exam1, exam2, exam3;
    private String studentName;

    public Gradebook(String name,int exam1,int exam2,int exam3){
        this.studentName = name;
        this.exam1=exam1;
        this.exam2=exam2;
        this.exam3=exam3;

    }

    public String getStudentName() {
        return this.studentName;
    }
    public int getTotalPoints() {
        return (this.exam1 + this.exam2 + this.exam3);
    }
    public double finalAverage() {

        return (this.getTotalPoints()/this.maxPoints);
    }
}
