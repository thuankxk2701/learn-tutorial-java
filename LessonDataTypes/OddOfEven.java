/* Examples:    Enter an integer : 15
        *              15 is ODD
        *
        *              Enter an integer : -24
        *              -24 is EVEN
        */
import java.util.Scanner;

public class OddOfEven {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter an integer :");
        int num=input.nextInt();
        String result = num %2 ==0 ?"EVEN":"ODD";
        System.out.printf("%d is %s \n",num,result);

    }
}
