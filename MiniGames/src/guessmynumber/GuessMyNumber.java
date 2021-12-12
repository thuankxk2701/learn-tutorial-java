package guessmynumber;
import java.util.Scanner;
import java.util.Random;
public class GuessMyNumber {
    public static void main(String[] agrs){
        int number,guess;
        Scanner  input = new Scanner(System.in);
        Random generator= new Random();
        number= generator.nextInt(6)+1;
        System.out.print("Pick a number between 1 and 5 : ");
        guess = input.nextInt();
        String result = guess == number ? "You guessed it!\n" : "So close it was %d\n";
        System.out.printf(result,number);
    }
}
