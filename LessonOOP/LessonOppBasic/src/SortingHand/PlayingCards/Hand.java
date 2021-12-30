package SortingHand.PlayingCards;

import java.util.ArrayList;
import java.util.Collections;
public class Hand {
     private ArrayList<Card> cards;

     public Hand(){
     cards= new ArrayList<Card>();
      }
      public Card remove(int index){
     return this.cards.remove(index);
      }
      public void add(Card c){
     this.cards.add(c);
       }
      public int cardCount(){
     return this.cards.size();
    }
    public void sortRankFirst() {
        Collections.sort(cards, new CardComparatorRankFirst() );
    }
    public void sortSuitFirst() {
        Collections.sort(cards, new CardComparatorSuitFirst() );
    }
    public int indexOf(Card c){
         for (int i=0;i<this.cards.size(); i++)
         {
             if(this.cards.get(i).sameCard(c)){
                 return i;
             }
         }
         return -1;
    }
    @Override
    public String toString(){
         String result="";
         for (Card c :cards){
             result+=c.toString()+" ";
         }
         return result;
    }
    public int rankCount (int rank ) {
        int count=0;
        for (int i=0;i<this.cards.size();i++) {
            count += this.cards.get(i).getRank()==rank ? 1:0;
        }
        return count;
    }
}
