package Classes;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    private ArrayList<Card> cards = new ArrayList<>();

    public Deck() {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        for (String suit : suits) {
            for (int val = 2; val <= 14; val++) {
                String name = switch (val) {
                    case 11 -> "Jack";
                    case 12 -> "Queen";
                    case 13 -> "King";
                    case 14 -> "Ace";
                    default -> String.valueOf(val);
                };
                cards.add(new Card(val, name + " of " + suit));
            }
        }
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    public Card draw() {
        return cards.isEmpty() ? null : cards.remove(0);
    }
}