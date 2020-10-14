
public class Card {
    private Suit suit;

    private int value;

    private Color color;

    private String cardType;

    public Card(Suit suit, int value){
        this.suit = suit;
        this.value= value;
        this.convertValue();
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

    public String getCardType(){
        return cardType;
    }

    private String convertValue(){
        switch (this.value) {
            case 1:
                this.cardType = "Ace";
                break;
            case 2:
                this.cardType = "Two";
                break;
            case 3:
                this.cardType = "Three";
                break;
            case 4:
                this.cardType = "Four";
                break;
            case 5:
                this.cardType = "Five";
                break;
            case 6:
                this.cardType = "Six";
                break;
            case 7:
                this.cardType = "Seven";
                break;
            case 8:
                this.cardType = "Eight";
                break;
            case 9:
                this.cardType = "Nine";
                break;
            case 10:
                this.cardType = "Ten";
                break;
            case 11:
                this.cardType = "Jack";
                break;
            case 12:
                this.cardType = "Queen";
                break;
            case 13:
                this.cardType = "King";
                break;
            
        
            default:
                break;
        }

        return cardType;
    }

    @Override
    public String toString(){
        String card = String.format("%s of %s", getCardType(), getSuit());
        return card;
    }

    
}