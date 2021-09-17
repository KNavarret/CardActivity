package com.example.carddeck;

import java.util.Random;

public class AbstractDeck implements Deck{

    protected List<Card> cards;

    public List<Card> getDeck(){
        return this.cards;
    }

    @Override
    puclic void shuffle(){
        long seed = System.nanoTime();
        Collections.shuffle(this.cards, new Random(seed));
    }

}
