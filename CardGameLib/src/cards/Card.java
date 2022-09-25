package cards;

public class Card {
    private FaceOfCard face;
    private SuitOfCard suit;

    public Card(FaceOfCard face, SuitOfCard suit) {
        setSuit(suit);
        setFace(face);
    }

    public FaceOfCard getFace() {
        return face;
    }

    public void setFace(FaceOfCard face) {
        this.face = face != null ? face : null;
    }

    public SuitOfCard getSuit() {
        return suit;
    }

    public void setSuit(SuitOfCard suit) {
        this.suit = suit != null ? suit : null;
    }

    @Override
    public String toString() {
        return face + " of " + suit;
    }
}
