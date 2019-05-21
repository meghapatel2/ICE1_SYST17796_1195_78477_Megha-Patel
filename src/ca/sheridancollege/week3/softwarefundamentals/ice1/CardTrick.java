/*
 * Student Name:Ahmad Bustani
 * Student Number: 991533974
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;

import java.util.Random;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author Megha
 * @modifier Ahmad Bustani
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        
        /*
        Card[] magicHand = new Card[7];
        Card c = new Card();
        for (int i=0; i<magicHand.length; i++)
        {
            
            c.setValue((int)(Math.random() * 13));
           c.setSuit(Card.SUITS[(int)(Math.random() * 3)]);
           
           System.out.print("suit: "+c.getSuit()+" ");
           System.out.println("value: "+c.getValue());
           magicHand[i] = c;
        
          */
        Card luckyCard = new Card();
        luckyCard.setValue(4);
        luckyCard.setSuit(Card.SUITS[2]);
        
            
    }
       
        
    
}
}
