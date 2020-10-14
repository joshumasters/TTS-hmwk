import java.util.ArrayList;

public class Deck {

    private int numberOfCards;

    private boolean shuffled;

    ArrayList<Card> cards = new ArrayList<Card>();
    ArrayList<Card> discard = new ArrayList<Card>();

    public Deck(){
        this.numberOfCards = 52;
        this.shuffled = false;

        for (int value = 1; value <= 13; value++) {
            for (int suit = 0; suit < 4; suit++) {
                Card card = new Card(Suit.values()[suit], value);
                cards.add(card);
            }
            } 
        }
    

    public Card dealCard(){
        Card card = cards.get(0);
        cards.remove(0);
        return card;
    }

    public void shuffleCards(){
        
    }

    public void discardCard(Card card){
        discard.add(card);
    }

    public int getNumberOfCards() {
        return this.numberOfCards;
    }

    public boolean getShuffled() {
        return this.shuffled;
    }

    public ArrayList<Card> getCards() {
        return this.cards;
    }

    public ArrayList<Card> getDiscard() {
        return this.discard;
    }

    @Override
    public String toString(){

        String result = "";
        for (Card card : this.cards) {
            result += (card + "\n");
        }
        return result;

    }

    


}
