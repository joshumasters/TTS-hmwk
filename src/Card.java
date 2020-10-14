
public class Card {
    private Suit suit;

    private int value;

    private Color color;

    public Card(Suit suit, int value){
        this.suit = suit;
        this.value = value;
    }


    public Suit getSuit() {
        return this.suit;
    }

    public int getValue() {
        return this.value;
    }

    public Color getColor() {
        return this.color;
    }

    
}