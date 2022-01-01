package TryCatchFinally.horlyWage;

import java.util.InputMismatchException;
import java.util.Scanner;

public class HourlyWage {
    public static void main(String[] args){
        float hourlyWage;
        while (true){
            try{
                Scanner sc= new Scanner(System.in);
                System.out.println("Enter your hourly wage : ");
                hourlyWage=sc.nextFloat();
                break;
            }catch (InputMismatchException ex){
                System.out.println("You didn't enter an a valid number");
            }
        }
        System.out.printf("You make $%.2f weekly.\n", 40* hourlyWage);
    }
}
