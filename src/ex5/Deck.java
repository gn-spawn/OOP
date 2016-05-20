package ex5;

import ex4.*;
import sun.applet.Main;

import java.util.ArrayList;

public class Deck {
    ArrayList<Card> deck = new ArrayList<Card>();
    Deck() {
        for (int i = 1; i <= 13; i++) {
            deck.add(new Card(Card.DIAMOND, i));
            deck.add(new Card(Card.CLUB, i));
            deck.add(new Card(Card.HEART, i));
            deck.add(new Card(Card.SPADE, i));
        }
    }

    void show() {
        deck.forEach(System.out::println);
    }

    public static void main(String[] args) {
        Deck deck = new Deck();
        deck.show();
    }
}
