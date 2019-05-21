/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;

/**
 * A class that models playing card Objects. Cards have
 * a value (note that Ace = 1, Jack -11, Queen =12, King = 13)
 * A suit (clubs, hearts, spades, diamonds).
 * There are 52 cards in a deck, no jokers.
 * This code is to be used in ICE1. When you create your own branch,
 * add your name as a modifier.
 *
 * @author Stanislav Kushch
 */
public class Card
{

   private String suit; //clubs, spades, diamonds, hearts
   private int value;//1-13

   public static final String[] SUITS = {"Hearts", "Diamonds", "Spades", "Clubs"};

   /**
    * @return the suit
    */
   public String getSuit ()
   {
      return suit;
   }

   /**
    * @param suit the suit to set
    */
   public void setSuit (String suit)
   {
      this.suit = suit;
   }

   /**
    * @return the value
    */
   public int getValue ()
   {
      return value;
   }

   public String getValueAsString ()
   {
      switch (this.value) {
         case 1:
            return "Ace";
         case 2:
            return "2";
         case 3:
            return "3";
         case 4:
            return "4";
         case 5:
            return "5";
         case 6:
            return "6";
         case 7:
            return "7";
         case 8:
            return "8";
         case 9:
            return "9";
         case 10:
            return "10";
         case 11:
            return "Jack";
         case 12:
            return "Queen";
         default:
            return "King";
      }
   }

   /**
    * @param value the value to set
    */
   public void setValue (int value)
   {
      this.value = value;
   }



}
