/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * Dilraj Singh Branch_Name:Dilraj_Singh
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;

import java.util.Random;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 *
 * @author Megha
 */
public class CardTrick
{

   public static void main (String[] args)
   {


      Card[] magicHand = new Card[7];

      for (int i = 0; i < magicHand.length; i++) {
         Card c = new Card();

         Random rnd = new Random();
         int a = rnd.nextInt(12) + 1;


         Random rnd1 = new Random();
         int b = rnd1.nextInt(4);



         //c.setValue(insert call to random number generator here)
         c.setValue(a);

         //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
         c.setSuit(Card.SUITS[b]);
         //Then report the result here
         System.out.println("The Random Value is " + c.getValue() + " suite is " + c.getSuit());
         c.setValue(5);
         c.setSuit(Card.SUITS[2]);
         System.out.println("this is the pull from github");
      }

   }
}
