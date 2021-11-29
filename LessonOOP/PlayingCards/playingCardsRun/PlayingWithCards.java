
package playingCardsRun;

import java.util.Random;
import playingCards.Card;
import playingCards.Ranks;
import playingCards.Suits;

public class PlayingWithCards {

    public static void main(String[] args) {

        Random gen = new Random();
        Card queenOfHearts = new Card(Ranks.QUEEN, Suits.HEARTS);
        Card randomCard = new Card(gen.nextInt(52));
        System.out.printf("%s %s Same Suit? %s\n", queenOfHearts, randomCard, randomCard.sameSuit(queenOfHearts));
    }
}