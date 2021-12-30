package SortingHand.PlayingCards;

import java.util.*;
public class Deck {
    private int SIZE=52;
    private int max_card_count=1;
    private ArrayList<Card> card_deck;
    private int seed=0;
    private Random generator;

   public Deck(){
       this(1);
   }
   public Deck(int count){
       this(count,0);
   }
   public Deck(int count,int seed){
       this.seed=seed;
       generator= seed==0? new Random():new Random(this.seed);
       max_card_count=count*SIZE;
       card_deck= new ArrayList<Card>();
       for (int i=0; i<max_card_count; i++){
           card_deck.add(new Card(i));
       }
   }
   public void shuffle(){
       Collections.shuffle(card_deck,generator);
   }
   public Card deal(){
       return card_deck.remove(0);
   }
   public void discard(Card c){
       card_deck.add(c);
   }
   public void card_swap(int i,int j){
       Card tmp=card_deck.get(i);
       card_deck.set(i,card_deck.get(j));
       card_deck.set(j,tmp);
   }
    public int cardCount() {

        return card_deck.size();
    }
    public void sortRankFirst() {
        Collections.sort(card_deck, new CardComparatorRankFirst() );
    }
    public void sortSuitFirst() {
        Collections.sort(card_deck, new CardComparatorSuitFirst() );
    }
    public int indexOf(Card c){
       for (int i=0; i<this.card_deck.size(); i++){
           if(this.card_deck.get(i).sameCard(c)){
               return  i;
           }

       }
           return -1;
    }
    @Override
    public String toString() {
        String result = "";
        for (Card c : card_deck) {
            result += c.toString() + " ";
        }
        return result;
    }

}
