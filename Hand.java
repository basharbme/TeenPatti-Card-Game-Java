/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.util.ArrayList;

/**
 *
 * @author Deepak
 */
public class Hand {
    
    
    ArrayList<Card> CardsinHand = new ArrayList<Card>();
    public void addcard(Card c){
        CardsinHand.add(c);
    }
     public Card getCard(int index){
        return CardsinHand.get(index);
    }
    public Card getTopCard(){
        return CardsinHand.get(0);
    }
    public void removeTopCard(){
        CardsinHand.remove(0);
    }
}
