/*
 * Student Number: 991556560
 * Name: Angela Villadiego
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;

import java.util.Random;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author Megha
 * @modifier Angela Villadiego
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue((int)(1 + Math.random() * 13));
            c.setSuit(Card.SUITS[(int)(Math.random() * 3)]);
            
            //lucky Card object (queen of hearts)
            Card luckyCard = new Card();
            luckyCard.setValue(12);
            luckyCard.setSuit(Card.SUITS[0]);
            
            //check that the card has not been chosen before if not first card; if it has, redo it until its original
           /* if (i > 0) {
                do {
                    for (int n=i; n > 0; n--) {
                        if (c.getValue() == magicHand[n-1].getValue() && c.getSuit().equals(magicHand[n-1].getSuit())){
                            //create new card
                            c.setValue((int)(1 + Math.random() * 13));
                            c.setSuit(Card.SUITS[(int)(Math.random() * 3)]);
                        }
                    }
                } while (same);
            }*/
           
           if (i>0) {
               //loop from current card to first card
               for (int n=i; n>0; n--) {
                   //compare current card to all previous cards
                    if (c.getValue() == magicHand[n-1].getValue() && c.getSuit().equals(magicHand[n-1].getSuit())){
                            //if card is the same as any of previous cards, change card
                            c.setValue((int)(1 + Math.random() * 13));
                            c.setSuit(Card.SUITS[(int)(Math.random() * 3)]);
                            
                            //reset counter to beginning to compare all cards again
                            n=i;
                    } 
               }
           }
        }
    
    }
}
