package fudgebanking;
import java.util.Scanner;
public class ATM {
    public static void menu(){
        Scanner input=new Scanner(System.in);

        ATMMenu option;

        System.out.printf("*********************************\n");
        System.out.printf("***         Main Menu         ***\n");
        System.out.printf("*********************************\n\n");
        System.out.printf("[%s=%s,%s=%s,%s=%s,%s=%s] ? ",
                ATMMenu.Deposit.Value(),ATMMenu.Deposit,
                ATMMenu.Withdrawl.Value(),ATMMenu.Withdrawl,
                ATMMenu.Balance.Value(),ATMMenu.Balance,
                ATMMenu.Quit.Value(),ATMMenu.Quit
        );
        String choice = input.nextLine();

        switch (choice)
        {
            case "d":
                option = ATMMenu.Deposit;
                break;
            case "w":
                option = ATMMenu.Withdrawl;
                break;
            case "b":
                option = ATMMenu.Balance;
                break;
            case "q":
                option = ATMMenu.Quit;
                break;
            default:
                option = ATMMenu.Quit;
                break;
        }
        System.out.printf("You selected: %s\n", option);
    }

    public static void main(String[] args){
        System.out.printf("*********************************\n");
        System.out.printf("*** Welcome to FudgeBank ATM! ***\n");
        System.out.printf("*********************************\n\n");
        Scanner input = new Scanner(System.in);
        BankAccount myacct = new BankAccount("1", 500);
        int attempts = 0;
        boolean success= false;

        while(true){
            System.out.println("Enter PIN # => ");
            String pin = input.nextLine();
            attempts++;
            if(pin.equals(myacct)){
                success=true;
                break;
            }
            if(attempts>=3){
                success=false;
                break;
            }
        }

        if(success){
       menu();
        }else {
            System.out.println("You entered an invalid pin 3 times");
        }


    }
}
