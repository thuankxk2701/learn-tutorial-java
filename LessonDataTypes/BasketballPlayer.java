import java.util.Scanner;
public class BasketballPlayer {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String playerName;
        int heightInInches;
        double avgPtsPerGame;
        System.out.println("Enter Basketball Player's Name: ");
        playerName=input.nextLine();
        System.out.printf("Enter %s's Average Points Per Game: ", playerName);
        avgPtsPerGame = input.nextDouble();
        System.out.printf("Enter %s's Height In Inches  ", playerName);
        heightInInches = input.nextInt();
        int heightInFeet = heightInInches / 12;
        int remainingInches = heightInInches % 12;

        System.out.printf(
                "%s is %d feet %d inches tall and averages %f points per game.\n",
                playerName,
                heightInFeet,
                remainingInches,
                avgPtsPerGame
        );

    }
}
