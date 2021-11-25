import java.util.Scanner;

public class HelloYourNameWays {
    public static void main(String[] args) {
  Scanner input= new Scanner(System.in);
  String firstName,lastName;
   System.out.print("Enter your first name");
   firstName=input.nextLine();
        System.out.print("Enter your last name");
        lastName = input.nextLine();
        System.out.printf("Hello %s %s!\n", firstName, lastName);
        System.out.printf("Or should I say: %s, %s!\n", lastName, firstName);

    }
}

