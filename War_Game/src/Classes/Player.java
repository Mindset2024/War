package Classes;

import java.util.ArrayList;

public class Player {
    private ArrayList<Card> hand = new ArrayList<>();
    private int score;
    private String name;

    // Corrected constructor (no typos)
    public Player(String name) {
        this.name = name;
        this.score = 0;
    }

    public void describe() {
        System.out.println(name + "'s hand:");
        for (Card card : hand) {
            card.describe();
        }
    }

    public Card flip() {
        return hand.isEmpty() ? null : hand.remove(0);
    }

    public void draw(Deck deck) {
        Card drawnCard = deck.draw();
        if (drawnCard != null) hand.add(drawnCard);
    }

    public void incrementScore() { score++; }
    public int getScore() { return score; }
    public String getName() { return name; }
}