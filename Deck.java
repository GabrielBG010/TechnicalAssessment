/**
 * Deck.java
 * 
 * @brief A class that represents a deck of playing cards
 * 
 * @details
 * This class is responsible for shuffling and dealing a deck of cards. The deck should
 * contain 52 cards A,2 - 10, J,Q K or four suits, but no jokers.
 */
import java.util.*; 
class Deck 
{
  private List<Card> deck;


  /**
  * Default constructor
  */
  public Deck() 
  {
    // Creation of an (empty) list of cards
    deck = new ArrayList<Card>();
    
    // Feeding the list with all cards but no Jockers 
    for(Card.Suit s: Card.Suit.values()){
      for(Card.Value v: Card.Value.values()){
        if(v!=Card.Value.JOKER){
          deck.add(new Card(s,v));
          }
      }
    }

  }
  
  /**
  * Print the n sets of m cards
  * Note: I assumed the phisical dealing of cards,
  * in other words, if we have to deal 3 hands for 3 people,
  * The first one, will receive the first, the fourth, the seventh card...
  * The second set will contain, the second, the fifth and the eight card...
  * The third one will have, the sixth and the ninth card, etc...
  * @param sets   the number of sets to deal
  * @cards cards   the number of cards per set
  */
  public void deal_hand( int sets, int cards ) 
  {
    for(int i =0;i<sets;i++){
      for(int j = 0; j<cards;j++){
        deck.get(i + j*sets).print();
      }
      System.out.println();

    }

  }

  /*
  * This method just print all cards in the desk
  */
  
  public void print_deck() 
  {
    for(int i =0;i<4;i++)
    {
      for(int j = 0; j<13;j++)
      {
        deck.get(i*13+j).print();
      }
      System.out.println();
    }
  }
  
  /**
  * Shuffle the desk based on a determined seed 
  * Note: Since there was not restriction on the data type I used collections. 
  * @param seed   random seed to be used to shuffle the desk
  */
  public void shuffle( int seed ) 
  {
    Collections.shuffle(deck, new Random(seed));
  }
  

  /**
  * This method sort the desk in order (suit and values)
  * Note: I used a bubble sort because it is clear enough and I do not 
  * need to worry for the performance, at least with 52 cards...
  */
  public void sort() 
  {
        int n = deck.size();
        for (int i = 0; i < n-1; i++) 
            for (int j = 0; j < n-i-1; j++) 
                // If the suit is greater, that is enough to swap the values
                if (deck.get(j).is_greater_than_suit(deck.get(j+1))) 
                { 
                  Collections.swap(deck, j, j+1);
                }else{
                  // If they have the same suite, I just need to check the values to determine if I need to swap.
                  if(deck.get(j).is_equal_suit(deck.get(j+1))
                  && deck.get(j).is_greater_than(deck.get(j+1))
                  ){
                    Collections.swap(deck, j, j+1);
                  }
                } 


  }
  
}