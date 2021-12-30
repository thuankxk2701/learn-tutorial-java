package SortingHand.Sortinghands;
import SortingHand.PlayingCards.*;
public class SortingHandsRun {
    public static void main(String[] args){
        Deck d= new Deck(1,15);
        Hand h1 = new Hand();
        Hand h2 = new Hand();
        System.out.printf("FRESH DECK ==> %s\n", d.toString());

        d.shuffle();
        System.out.printf("SHUFFLED DECK ==> %s\n", d.toString());
        for(int i=0;i<7;i++) {
            h1.add(d.deal());
            h2.add(d.deal());
        }
        System.out.println();
        System.out.printf("HAND #1 CARDS     ==> %s\n", h1.toString());
        h1.sortRankFirst();
        System.out.printf("HAND #1 RANK SORT ==> %s\n", h1.toString());
        h1.sortSuitFirst();
        System.out.printf("HAND #1 SUIT SORT ==> %s\n", h1.toString());

        System.out.println();
        System.out.printf("HAND #2 CARDS     ==> %s\n", h2.toString());
        h2.sortRankFirst();
        System.out.printf("HAND #2 RANK SORT ==> %s\n", h2.toString());
        h2.sortSuitFirst();
        System.out.printf("HAND #2 SUIT SORT ==> %s\n", h2.toString());
    }
}
