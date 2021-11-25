import  java.util.Scanner;
public class UnitConversionToIn {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a value in inches :");
        int inputInches=input.nextInt();
        int ft,in;
        ft=inputInches/12;
        in=inputInches%12;
        System.out.printf("%d inches == %d feet %d inches \n",inputInches,ft,in);
    }
}
