package SortingHand.PlayingCards;

public class Card {
    private int suit;
    private int rank;

    public Card(int card){
        rank=card%13;
        suit=(card/13) % 4;
    }
    public Card(int rank,int suit){
        this.rank=rank;
        this.suit=suit;
    }
    public int getRank(){
        return rank;
    }
    public int getSuit(){
        return suit;
    }
    public boolean isRed(){
        return (this.suit==Suits.HEARTS || this.suit==Suits.DIAMONDS);
    }
    public boolean isBlack(){
        return (this.suit==Suits.CLUBS || this.suit==Suits.SPADES);
    }
    public boolean isFace(){
        return (this.rank>=Ranks.JACK && this.rank<=Ranks.KING);
    }
    public boolean sameSuit(Card c) {
        return (this.suit == c.suit);
    }
    public  boolean sameRank(Card c){
        return(this.rank==c.rank);
    }
    public boolean sameCard(Card c) {
        return (this.sameRank(c) && this.sameSuit(c));
    }
    public boolean sameColor(Card c) {
        return ((this.isRed() && c.isRed())
                ||
                (this.isBlack() && c.isBlack()));
    }
    public int suitDiff(Card c){
        if(this.suit==c.suit){
            return (this.rank-c.rank);
        }
        else {
            return (this.suit-c.suit);
        }
    }
    public int rankDiff(Card c){
        if(this.rank==c.rank){
            return (this.suit-c.suit);
        }
        else
        {
            return (this.rank-c.rank);
        }
    }
    @Override
    public String toString() {
        String ranks = "23456789TJQKA";
        String suits =  "\u2663\u2666\u2665\u2660"; //"CDHS";
        return ranks.charAt(rank) +  "" + suits.charAt(suit);
    }



}
