/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Deepak
 */
public class Deck {
    
    ArrayList<Card> deckofcards = new ArrayList<>();
    ArrayList<Card> player1 = new ArrayList<>();
    ArrayList<Card> player2 = new ArrayList<>();
    
    public Deck(){
        
        for(int a=0; a<4; a++)
        {
           for(int b=0; b<13; b++)
            
           {
           
              Card d = new Card(a,b);
              deckofcards.add(d);
              
           }
        }
        
        for(int a=0; a<4; a++)
        {
           for(int b=0; b<13; b++)
            
           {
        
              Card c = new Card(a,b);
              player1.add(c);
              
           }
        }
        
         for(int a=0; a<4; a++)
        {
           for(int b=0; b<13; b++)
            
           {
        
              Card x = new Card(a,b);
              player2.add(x);
              
           }
        }
        

        
       
        }
    public void shuffle()
    {
        Collections.shuffle(deckofcards);
        Collections.shuffle(player1);
        Collections.shuffle(player2);
        
    }
    
}
