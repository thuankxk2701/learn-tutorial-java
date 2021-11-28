
/*
*   Enter degrees for angle 1 : 50
        *   Enter degrees for angle 2 : 40
        *   Enter degrees for angle 3 : 90
        *   180 degrees. That's a GOOD triangle! */

import java.util.Scanner;
public class DegreesOfATriangle {
    public static void main(String[] args){

        int a,b,c,sum;
        Scanner input =new Scanner(System.in);
        System.out.println("Enter degrees for angle a:");
        a=input.nextInt();
        System.out.println("Enter degrees for angle b:");
        b=input.nextInt();
        System.out.println("Enter degrees for angle c:");
        c=input.nextInt();
        sum=a+b+c;
        String result = sum==180 ? "GOOD":"BAD";
        System.out.printf("%d Degrees.That's %s triangle! \n",sum,result);
    }
}
