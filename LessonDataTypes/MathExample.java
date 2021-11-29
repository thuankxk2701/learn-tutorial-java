
import java.util.Scanner;
public class MathExample {
    public static void main(String[] args){
   Scanner input = new Scanner(System.in);
        System.out.println("Enter Circle Radius :");
          double radius=input.nextDouble();
          double circ=2*Math.PI*radius;
          double area=Math.PI*radius*radius;
        System.out.printf("Circumfrence : %f; Area : %f\n",circ, area);
    }
}
