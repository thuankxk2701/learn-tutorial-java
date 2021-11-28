
import java.util.Scanner;
public class AreaOfATriangle {
    public static void main(String[] args){
Scanner input= new Scanner(System.in);
    int base,height;
    double area;
        System.out.println("Enter triangle base :");
        base=input.nextInt();
        System.out.println("Enter triangle height :");
        height=input.nextInt();
        area=(base*(double) height)/2;
        System.out.printf("Triangle area: %.1f\n",area);

    }
}
