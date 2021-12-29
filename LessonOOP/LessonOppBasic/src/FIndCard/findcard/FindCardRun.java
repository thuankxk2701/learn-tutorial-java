package FIndCard.findcard;

import FIndCard.playingcards.*;
public class FindCardRun
{
    public static void  main(String[] args){
        Deck d=new Deck(1,15);
        Card find = new Card(Ranks.ACE, Suits.SPADES);
        Hand[] hands = new Hand[] { new Hand(), new Hand(), new Hand(), new Hand() };
        System.out.printf("FRESH DECK ==> %s\n", d.toString());
        d.shuffle();
        System.out.printf("SHUFFLED DECK ==> %s\n", d.toString());

        for(int i=0;i<7;i++) {
            for(int j=0;j<hands.length;j++) {
                hands[j].add(d.deal());
            }
        }
        System.out.println();
        System.out.printf("LOOKING FOR: %s\n", find.toString());
        for(int j=0;j<hands.length;j++) {
            System.out.printf("HAND #%d CARDS ==> %s %s\n",j, hands[j].toString(), hands[j].indexOf(find)!=-1?"FOUND":"");
        }
        System.out.printf("REMAINING DECK ==> %s %s\n",d.toString(), d.indexOf(find)!=-1?"FOUND":"");

    }
}
