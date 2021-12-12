package met100grades;

public class MET100Grades {

    public static void main(String[] args){
        Gradebook g1 = new Gradebook("Dave",120, 130, 135);
        Gradebook g2 = new Gradebook("Jane",135, 145, 140);
        Gradebook t1 = new Gradebook("Test",150,150,150);

        System.out.printf("Studnet\tTotal\tAverage\n");
        System.out.printf("%s\t%d\t%f\n"
                ,g1.getStudentName(), g1.getTotalPoints(), g1.finalAverage());
        System.out.printf("%s\t%d\t%f\n"
                ,g2.getStudentName(), g2.getTotalPoints(), g2.finalAverage());
        System.out.printf("%s\t%d\t%f\n"
                ,t1.getStudentName(), t1.getTotalPoints(), t1.finalAverage());
    }
}
