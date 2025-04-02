package Classes;

public class App {
    public static void main(String[] args) {
        Deck deck = new Deck();
        deck.shuffle();

        // Correct class name: Player (not Players)
        Player player1 = new Player("Player 1");
        Player player2 = new Player("Player 2");

        // Deal 52 cards alternating between players
        for (int i = 0; i < 52; i++) {
            if (i % 2 == 0) player1.draw(deck);
            else player2.draw(deck);
        }

        // Play 26 rounds
        for (int round = 1; round <= 26; round++) {
            System.out.println("\n--- Round " + round + " ---");

            // Use Card type (not Object)
            Card card1 = player1.flip();
            Card card2 = player2.flip();

            if (card1 == null || card2 == null) {
                System.out.println("Error: Not enough cards!");
                break;
            }

            // Describe cards
            System.out.print(player1.getName() + " flipped: ");
            card1.describe();
            System.out.print(player2.getName() + " flipped: ");
            card2.describe();

            // Compare values
            if (card1.getValue() > card2.getValue()) {
                player1.incrementScore();
                System.out.println(player1.getName() + " wins this round!");
            } else if (card2.getValue() > card1.getValue()) {
                player2.incrementScore();
                System.out.println(player2.getName() + " wins this round!");
            } else {
                System.out.println("Tie! No points awarded.");
            }

            // Print scores
            System.out.printf("Score: %s=%d, %s=%d%n",
                player1.getName(), player1.getScore(),
                player2.getName(), player2.getScore());
        }

        // Final result
        System.out.println("\n=== GAME OVER ===");
        System.out.printf("Final Score: %s=%d, %s=%d%n",
            player1.getName(), player1.getScore(),
            player2.getName(), player2.getScore());

        if (player1.getScore() > player2.getScore()) {
            System.out.println(player1.getName() + " WINS!");
        } else if (player2.getScore() > player1.getScore()) {
            System.out.println(player2.getName() + " WINS!");
        } else {
            System.out.println("DRAW!");
        }
    }
}