import java.util.ArrayList;

public class Deck {

    private int numberOfCards;

    private boolean shuffled;

    ArrayList<Card> cards = new ArrayList<Card>();
    ArrayList<Card> discard = new ArrayList<Card>();

    public int getNumberOfCards() {
        return this.numberOfCards;
    }

    public boolean isShuffled() {
        return this.shuffled;
    }

    public ArrayList<Card> getCards() {
        return this.cards;
    }

    public ArrayList<Card> getDiscard() {
        return this.discard;
    }

    
    
    public Deck(){

    }

    public Card dealCard(){
        
    }

    public void shuffleCard(){

    }

    public Card discardCard(){

    }


}
