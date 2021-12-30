package ImplementingCardComparator.DebugThisImplementingCardComparator;

import ImplementingCardComparator.PlayingCards.*;
public class DebugThisImplemeningCardComparator {
    public static void main(String[] args){
        Deck d= new Deck(1,15);
        System.out.printf("FRESH DECK ==> %s\n", d.toString());
        d.shuffle();
        System.out.printf("SHUFFLED DECK ==> %s\n", d.toString());
        d.sortRankFirst();
        System.out.printf("DECK RANK SORT ==> %s\n", d.toString());
        d.sortSuitFirst();
        System.out.printf("DECK SUIT SORT ==> %s\n", d.toString());

    }

}
