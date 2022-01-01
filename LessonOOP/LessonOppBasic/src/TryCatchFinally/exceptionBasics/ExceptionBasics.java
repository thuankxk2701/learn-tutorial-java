package TryCatchFinally.exceptionBasics;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionBasics {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int i;
        System.out.print("Enter an integer : ");
        try{
            i=sc.nextInt();
        }
        catch (InputMismatchException ex){
            System.out.println("You didn't enter an Integer");

        }
        finally {
            System.out.println("This happens whether the exception occurs or not");
        }
    }
}
