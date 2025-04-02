package Classes;

public class Card {
    private int value;
    private String name;

    public Card(int value, String name) {
        this.value = value;
        this.name = name;
    }

    // Getters
    public int getValue() { return value; }
    public String getName() { return name; }

    // Setters
    public void setValue(int value) { this.value = value; }
    public void setName(String name) { this.name = name; }

    public void describe() {
        System.out.println("Card: " + name);
    }
}