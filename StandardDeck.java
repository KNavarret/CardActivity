package com.example.carddeck;

public class StandardDeck extends AbstractDeck{

    public StandardDeck(){
        this.cards = newDeck();
    }

    private List<Card> newDeck() {
        List<Card> newDeck = new Arraylist<>();

        for(Suit suit : Suit.values()){
            for (FaceValue facevaule : StandardFaceValue.values()){
                newDeck.add(new Card(suit, faceValue))
            }
        }
        
        return newDeck;
    }


}
