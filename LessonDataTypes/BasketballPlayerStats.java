/*For example:
        Enter player's name: Tony
        Free throws attempted: 4
        Free throws made: 3
        Field goals attempted: 10
        Field goals made: 5
        Tony's stats:
        Points: 13
        FT %: 0.75
        FG %: 0.50
        */


import java.util.Scanner;
public class BasketballPlayerStats {
    public static void main(String[] args){
        String playerName;
        int freeThrowAttempts, freeThrowsMade,fieldGoalAttempts, fieldGoalsMade;
    Scanner input=new Scanner(System.in);

        System.out.println("Enter Player's Name :");
        playerName=input.nextLine();
        System.out.println("Free throws attempted :");
        freeThrowAttempts=input.nextInt();
        System.out.println("Free throws made:");
        freeThrowsMade=input.nextInt();
        System.out.println("Field goals attempted :");
        fieldGoalAttempts=input.nextInt();
        System.out.println("Field goals made :");
        fieldGoalsMade= input.nextInt();
        double freeThrowPercentage = freeThrowsMade / (double)freeThrowAttempts;
        double fieldGoalPercentage = fieldGoalsMade / (double)fieldGoalAttempts;
        int totalPoints = freeThrowsMade + 2 * fieldGoalsMade;
        System.out.printf("%s's Stats:\n",playerName);
        System.out.printf("Total Points: %d\n", totalPoints);
        System.out.printf("Free-Throw Pct: %.2f\n",freeThrowPercentage);
        System.out.printf("Field Goal Pct: %.2f\n",fieldGoalPercentage);

    }
}
