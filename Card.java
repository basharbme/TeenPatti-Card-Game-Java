/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

/**
 *
 * @author Deepak
 * @author Sai Narsapuram
 * @author Sai Parimi Bhargav
 */
public class Card {
    
    private int suit, value;
    private String[] cardSuit = {"Spades", "Diamonds", "Hearts", "Clubs"};
    //private String[] cardValue = {"Ace", "King", "Queen", "Jack", "10",
    //                               "9", "8", "7", "6", "5", "4", "3", "2"};
    
    private String[] cardValue = {"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};

    public Card(int cSuit, int cValue)
    {
        this.suit = cSuit; 
        this.value = cValue;
    }
    
    
    public int getValue()
    {
        return value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
     public int getSuit()
    {
        return suit;
    }
     
    public void setSuit(int suit) {
        this.suit = suit;
    }

    
    public String toString()
    {
       

        return cardSuit[suit] + " " + cardValue[value]  ;
    }
    
   
     public String getImg()
    {
     String imgName=cardValue[getValue()]+ cardSuit[getSuit()]+".png";
        return imgName;
    }
    
}
