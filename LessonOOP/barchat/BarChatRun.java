package barchat;
import java.util.Scanner;

public class BarChatRun {

    private static void drawBarChat(int val){
        System.out.printf("%2d : [", val);
        for(int i=0; i<val; i++){
            System.out.printf("#");
        }
        System.out.println("]");

    }

    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        System.out.println("Enter value for A: ");
        int a= input.nextInt();
        System.out.println("Enter value for B: ");
        int b= input.nextInt();
        drawBarChat(a);
        drawBarChat(b);
    }
}
