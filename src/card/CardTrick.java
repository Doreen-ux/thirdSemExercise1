/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package card;

/*
import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author srinivsi
 * @modifier Doreen
 */
/*
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        Scanner input = new Scanner(System.in);
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            //c.setValue(insert call to random number generator here)
            c.setValue(c.randomValue());
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            c.setSuit(Card.SUITS[c.randomSuit()]);
            magicHand[i] =c;
        }
        for (Card magicHandx : magicHand)
        {
            System.out.println((magicHandx.getSuit() + " " + magicHandx.getValue()));
        }
        //System.out.println("Enter a");
        System.out.println("Enter a card value(1-13)");
        
        //insert code to ask the user for Card value and suit, create their card
        int Value = input.nextInt();
        System.out.println("Enter a suit (0-3 where 0 = Hearts, 1 = Diamonds, 2 = Clubs, 3 = Spades");
        //System.out.println("1 = Hearts, 2 = Diamonds, 3 = Spades, 4 = Clubs");
        // and search magicHand here
         //Then report the result here
        int Suit = input.nextInt();
        System.out.println("Your card is: " + Value + " of " + Suit);
        System.out.println("Sorry, your card is not the magic hand");

        if(Value== magicHandx.getValue() && Suit == magicHandx())
        {
            System.out.println("Well done");
           
        }
        // add one luckcard hard code 2,clubs
    }

    
}
*/

import java.util.Scanner;

public class CardTrick 
{
    
    public static void main(String[] args) 
    {
        Card[] DoreensmagicHand = new Card[7];
        Scanner input = new Scanner(System.in);
        
        // Generate random cards for magicHand
        for (int i = 0; i < DoreensmagicHand.length; i++) 
        {
            Card c = new Card();
            c.setValue(c.randomValue());
            c.setSuit(Card.SUITS[c.randomSuit()]);
            DoreensmagicHand[i] = c;
        }   
        //Add a hard-coded lucky card
        Card luckyCard = new Card();
        luckyCard.setValue(9);
        luckyCard.setSuit("Diamonds");
            
        // Print the cards in magicHand
        for (Card DoreensmagicHand1 : DoreensmagicHand) {
            System.out.println((DoreensmagicHand1.getSuit() + " " + DoreensmagicHand1.getValue()));
        }
        
        
        //printing lucky card   
        System.out.println("Your Lucky Card: " + luckyCard.getSuit() + " " + luckyCard.getValue());
       
        // Ask the user for a card
        System.out.println("Enter a card value(1-13):");
        int value = input.nextInt();
        
        System.out.println("Enter a suit (0-3 where 0 = Hearts, 1 = Diamonds, 2 = Clubs, 3 = Spades):");
        int suit = input.nextInt();
        
        System.out.println("Here is your card of: " + value + " and suit of" + suit);
        
        // Check if the user's card matches any card in magicHand
        boolean gotten = false;
        for (Card DoreensmagicHand1 : DoreensmagicHand) 
        {
            if (value == DoreensmagicHand1.getValue() && suit == DoreensmagicHand1.getSuitIndex()) 
            {
                gotten = true;
                break;
            }
        }
        
        // Hard coded-lucky card  
       if (!gotten && value == luckyCard.getValue() && suit == luckyCard.getSuitIndex())
        {
             gotten = true;
        }  
        // Report the result
        if (gotten) 
        {
            System.out.println("congrats! You got a magic hand!");
        } 
        
        else 
        {
            System.out.println("Sorry, your card is not in the magic hand");
        }      
        input.close(); 
    }
}