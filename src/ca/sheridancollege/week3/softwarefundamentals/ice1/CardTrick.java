/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;
import java.util.Random;
/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 *
 * @author Kirtan Parekh - ID:991551563
 *
 */
public class CardTrick
{

   public static void main (String[] args)
   {
      Card[] magicHand = new Card[7];

      for (int i = 0; i < magicHand.length; i++) {
         Card c = new Card();
         Random rnd = new Random();




         int randomNum = rnd.nextInt((13 - 1) + 1) + 1;

         c.setValue(randomNum);

         String rString = Card.SUITS[rnd.nextInt(Card.SUITS.length)];
         c.setSuit(rString);

         System.out.println("Value of card " + (i + 1) + " is: " + c.getValue() + " " + c.getSuit());
         //Then report the result here
      }

      Card userCard = new Card();

      userCard.setSuit("Diamonds");
      userCard.setValue(3);

      System.out.println("This is the last statement after pulling the file from GITHUB");
   }

}
