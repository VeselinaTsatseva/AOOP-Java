package zad1a;

// Fig. 7.10: DeckOfCards.java
// DeckOfCards class represents a deck of playing cards.
import java.util.Random;

public class DeckOfCards
{
    private Card deck[]; 
    private int currentCard;
    private final int NUMBER_OF_CARDS = 52;
    private Random randomNumbers;

    public DeckOfCards() // constructor
    {
        String faces[] = { "Ace", "Deuce", "Three", "Four", "Five", "Six",
                "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King" };
        String suits[] = { "Hearts", "Diamonds", "Clubs", "Spades" };

        deck = new Card[ NUMBER_OF_CARDS ];
        currentCard = 0;
        randomNumbers = new Random();

        // populate deck with Card objects
        for ( int count = 0; count < deck.length; count++ )
            deck[ count ] = new Card( faces[ count % 13 ], suits[ count / 13 ] );
    }

    public void shuffle()
    {
        currentCard = 0; // reinitialize currentCard
        for ( int first = 0; first < deck.length; first++ )
        {
            int second =  randomNumbers.nextInt( NUMBER_OF_CARDS );
            Card temp = deck[ first ];
            deck[ first ] = deck[ second ];
            deck[ second ] = temp;
        }
    }

    public Card dealCard()  // deal one Card
    {
        if ( currentCard < deck.length )  // determine whether Cards remain to be dealt
            return deck[ currentCard++ ]; // return current Card in array
        else
            return null; // return null to indicate that all Cards were dealt
    }

    public boolean hasPair(Card[] hand){
        int[] facesCount = countFaces(hand);
        for (int i=0; i < facesCount.length; i++){
            if (facesCount[i] == 2){
                return true;
            }
        }
        return false;
    }

    public boolean hasTwoPairs(Card[] hand){
        int[] facesCount = countFaces(hand);
        int countPairs = 0;
        for (int i=0; i < facesCount.length; i++){
            if (facesCount[i] == 2){
                countPairs++;
                if (countPairs == 2) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean hasThreeOfAKind(Card[] hand){
        int[] facesCount = countFaces(hand);
        for (int i=0; i < facesCount.length; i++){
            if (facesCount[i] == 3){
                return true;
            }
        }
        return false;
    }

    public boolean hasFourOfAKind(Card[] hand){
        int[] facesCount = countFaces(hand);
        for (int i=0; i < facesCount.length; i++){
            if (facesCount[i] == 4){
                return true;
            }
        }
        return false;
    }

        public boolean hasFlush(Card[] hand){
            int[] suitsCount = countSuits(hand);
            for (int i = 0; i < suitsCount.length; i++) {
                if (suitsCount[i] == 5){
                    return true;
                }
            }
            return false;
        }

        public boolean hasStraight(Card[] hand){
            int[] facesCount = countFaces(hand);
            int count = 0;
            for (int i = 0; i < facesCount.length; i++) {
                if (facesCount[i] == 1){
                    count++;
                    if (count == 5){
                        return true;
                    }
                } else {
                    count = 0;
                }
            }
            return false;
        }

        public boolean hasFullHouse(Card[] hand){
            return hasPair(hand) && hasThreeOfAKind(hand);
        }

        public boolean hasStraightFlish(Card[] hand){
            return hasStraight(hand) && hasFlush(hand);
        }

        //By given hand return a rank. The lower the rank, the better the hand.
        public int rankHand(Card[] hand){
            if (hasStraightFlish(hand)){
                return 1;
            }
            if (hasFourOfAKind(hand)){
                return 2;
            }
            if (hasFullHouse(hand)){
                return 3;
            }
            if (hasFlush(hand)){
                return 4;
            }
            if (hasStraight(hand)){
                return 5;
            }
            if (hasThreeOfAKind(hand)){
                return 6;
            }
            if (hasTwoPairs(hand)){
                return 7;
            }
            if (hasPair(hand)){
                return 8;
            }

            return 9;
        }

        public String getRankLabel(int rank){
            switch (rank){
                case 1:
                    return "Straight Flush";
                case 2:
                    return "Four Of A Kind";
                case 3:
                    return "Full House";
                case 4:
                    return "Flush";
                case 5:
                    return "Straight";
                case 6:
                    return "Three Of A Kind";
                case 7:
                    return "Two Pair";
                case 8:
                    return "Pair";
                default:
                    return "none";
            }
        }

    //[numberOfAces, numberOfTwos../]
    private int[] countFaces(Card[] hand){
        int[] facesCount = new int[13];
        for (int i=0; i < hand.length; i++){
            switch (hand[i].getFace()){
                case "Ace":
                    facesCount[0]++;
                    break;
                case "Deuce":
                    facesCount[1]++;
                    break;
                case "Three":
                    facesCount[2]++;
                    break;
                case "Four":
                    facesCount[3]++;
                    break;
                case "Five":
                    facesCount[4]++;
                    break;
                case "Six":
                    facesCount[5]++;
                    break;
                case "Seven":
                    facesCount[6]++;
                    break;
                case "Eight":
                    facesCount[7]++;
                    break;
                case "Nine":
                    facesCount[8]++;
                    break;
                case "Ten":
                    facesCount[9]++;
                    break;
                case "Jack":
                    facesCount[10]++;
                    break;
                case "Queen":
                    facesCount[11]++;
                    break;
                case "King":
                    facesCount[12]++;
                    break;
            }
        }
        return facesCount;
    }

    public int[] countSuits(Card[] hand){
        int[] suitsCount = new int[4];
        for (int i = 0; i < hand.length; i++) {
            switch (hand[i].getSuit()){
                case "Hearts":
                    suitsCount[0]++;
                    break;
                case "Diamonds":
                    suitsCount[1]++;
                    break;
                    case "Clubs":
                    suitsCount[2]++;
                    break;
                case "Spades":
                    suitsCount[3]++;
                    break;
            }
        }
        return suitsCount;
    }
} // end class DeckOfCards


