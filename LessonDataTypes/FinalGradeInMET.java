import java.util.Scanner;

public class FinalGradeInMET {
    public static void main(String[] args){
        int exem1,exem2,exem3,total,pct;
     Scanner input = new Scanner(System.in);
        System.out.println("Enter exem1 :");
        exem1=input.nextInt();
        System.out.println("Enter exem2 :");
        exem2=input.nextInt();
        System.out.println("Enter exem2 :");
        exem3=input.nextInt();
        total=exem1+exem2+exem3;
        pct=100*total/450;
        System.out.printf("Total point : %d\n",total);
        System.out.printf("Percentage : %d\n",pct);
    }
}
