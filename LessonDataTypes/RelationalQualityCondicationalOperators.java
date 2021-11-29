import java.util.Scanner;
public class RelationalQualityCondicationalOperators {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer value for X:");
        int x=input.nextInt();
        System.out.println("Enter an integer value for Y :");
        int y= input.nextInt();

        System.out.printf("X==Y ? %s\n",x==y);
        System.out.printf("X!=Y ? %s\n",x!=y);
        System.out.printf("X>Y ? %s\n",x>y);
        System.out.printf("X<=Y ? %s\n",x<=y);
        System.out.printf(" X >= Y ? %s\n", x >= y);
        System.out.printf(" X < Y ? %s\n", x < y);
        System.out.printf(" X == Y ? booyah : no-dice ? %s\n", x==y? "booyah" : "no-dice");

    }
}
