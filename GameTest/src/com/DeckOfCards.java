package com;

import cards.Card;
import cards.FaceOfCard;
import cards.SuitOfCard;

import java.util.ArrayList;
import java.util.List;

public class DeckOfCards {
    private final int NUMBER_OF_CARDS = 52;

    ArrayList<Card> cards = new ArrayList<>();  // списък от всички карти в тестето
    private int currentCard;                   // индекс на текуща карта
    private final FaceOfCard[] faces = FaceOfCard.values();  // прави масив от faces
    private final SuitOfCard[] suits = SuitOfCard.values();  // прави масив от suits

    // пълним тестето cards
    public DeckOfCards() {
        currentCard = 0;
        for (int i = 0; i < NUMBER_OF_CARDS; i++) {
            cards.add(new Card(faces[i % 13], suits[i / 13]));
        }
    }

    public void shuffleCards() {
        ArrayList<Card> temp = new ArrayList<>();  // създаваме тепм списък

        while (!cards.isEmpty()) {                              // докато има карти в cards
            int index = (int) (Math.random() * cards.size());  // генерираме случаен индекс
            temp.add(cards.get(index));          // взимаме картата на този индекс в cards и я добавяме в temp
            cards.remove(index);                 // и я премахваме от cards
        }
        cards = temp;
        currentCard = 0;
    }

    public Card[] dealFive(){
        Card[] hand = new Card[5];   // създаваме масив за ръка от 5 карти

        for (int i = 0; i < hand.length; i++) {
            if (currentCard < cards.size()){       // ако тестето не е свършило
                hand[i] = cards.get(currentCard++);  // теглим следващата карта и я добавяме в hand
            } else {
                hand[i] = null;
            }
        }
        return hand;
    }

    public static void sortByFaceCards(ArrayList<Card> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            int j = i;

            for (int k = i + 1; k < list.size(); k++) {
                // сравняваме дали силата на карта i+1 е по-малка от силата на карта i
                if (list.get(k).getFace().compareTo(list.get(j).getFace()) < 0) {
                    j = k;
                }
            }
            // разменяме местата на картите
            Card temp = list.get(j);
            list.set(j, list.get(i));
            list.set(i, temp);
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).toString());
        }
    }

    public void printBySuits(){
        int counter = 0;

        while (counter != suits.length){
            System.out.printf("\n%s: \n", suits[counter]);

            for (int i = 0; i < NUMBER_OF_CARDS; i++) {
                if(cards.get(i).getSuit() == suits[counter]){
                    System.out.println(cards.get(i));
                }
            }
            counter++;
        }
    }

    public List<FaceOfCard> getDistinctFaces(Card[] cards){
        List<FaceOfCard> faceOfCardList = new ArrayList<>();
        for (int i = 0; i < cards.length; i++) {
            faceOfCardList.add(i, cards[i].getFace());
        }
        return faceOfCardList;
    }


    public static void main(String[] args) {
        
        DeckOfCards deck = new DeckOfCards();   // създаваме тесте
        deck.shuffleCards();                  // и го разбъркваме

        // принтираме разбърканите карти
        System.out.println("Shuffled deck: ");
        for (int i = 0; i < deck.cards.size(); i++) {
            System.out.println(deck.cards.get(i));
        }

        // тест на метод dealFive() с две ръце hand1 и hand2
        Card[] hand1 = deck.dealFive();
        System.out.println("\nHand 1");
        for (int i = 0; i < hand1.length; i++) {
            System.out.println(hand1[i]);
        }

        Card[] hand2 = deck.dealFive();
        System.out.println("\nHand 2");
        for (int i = 0; i < hand2.length; i++) {
            System.out.println(hand2[i]);
        }

        System.out.println("\nSorted by face deck: ");
        sortByFaceCards(deck.cards);  // сортира картите според силата им

        System.out.println("\nPrinted by suits deck: ");
        deck.printBySuits(); // принтира картите по бои

        System.out.println("\nFaces of cards in hand2: ");
        System.out.println(deck.getDistinctFaces(hand2)); // връща списък на силите на картите в hand2
    }
}
