package com.company.workshoptwo;

public class DeckOfCards {
    private final int[] deck = new int[52];
    private final String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
    private final String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};

    void uniqueSetOfCards(){
        // Initialize cards
        for (int i = 0; i < deck.length; i++) {
            deck[i] = i;
        }
        // Shuffle the cards
        for (int i = 0; i < deck.length; i++) {
            int index = (int)(Math.random() * deck.length);
            int temp = deck[i];
            deck[i] = deck[index];
            deck[index] = temp;
        }
        // Display all cards
        for (int i = 0; i < 52; i++) {
            String suit = suits[deck[i] / 13];
            String rank = ranks[deck[i] % 13];
        }
    }

    public static void main(String[] args) {
        DeckOfCards doc = new DeckOfCards();

    }
}
