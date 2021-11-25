import java.util.Scanner;

public class AreaAndPreimeterOfARectangle {
    public static void main(String[] args){
        int length,width,area,preimeter;
     Scanner input = new Scanner(System.in);
        System.out.println("Enter Length: ");
        length=input.nextInt();
        System.out.println("Enter With: ");
        width=input.nextInt();
        area=width* length;
        preimeter=2*(width+length);
        System.out.printf("Preimeter :%d\n",preimeter);
        System.out.printf("Area : %d\n",area);


    }
}
