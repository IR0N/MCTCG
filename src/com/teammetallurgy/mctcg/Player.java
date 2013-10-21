package com.teammetallurgy.mctcg;

import com.teammetallurgy.mctcg.card.Card;
import com.teammetallurgy.mctcg.card.Deck;
import com.teammetallurgy.mctcg.card.Hand;

public class Player
{
    private String name;
    
    private Hand hand;
    private Deck deck;
    private Card[] battleField;

    private int life;
    
    
    public Player(String name, int lifeStarting)
    {
        this(name, lifeStarting, 5);
    }
    
    public Player(String name,int lifeStarting, int battleFieldSize)
    {
        this.name = name;
        hand = new Hand();
        deck = new Deck();
        
        battleField = new Card[battleFieldSize];
        
        life = lifeStarting;
    }
    
    public String getName()
    {
        return name;
    }
        
    public int getLife()
    {
        return life;
    }
    
    public void setLife(int life)
    {
        this.life = life;
    }
    
    public void incLife(int amount)
    {
        life += amount;
    }
    
    public void incLife()
    {
        incLife(1);
    }
    
    public void decLife(int amount)
    {
        incLife(-amount);
    }
    
    public void decLife()
    {
        incLife(-1);
    }
        
    public Deck getDeck()
    {
        return deck;
    }
    
    public void drawCard()
    {
        Card topCard = getDeck().drawTopCard();
        hand.addCardToHand(topCard);
    }
    
    public void playCard(int indexStart, int indexEnd)
    {
        if (indexEnd < 0 || indexEnd >= battleField.length)
            return;
        
        if (battleField[indexEnd] == null)
            return;
        
        Card cardAtIndex = hand.getCardAtIndex(indexStart);
        hand.removeCardAtIndex(indexStart);
        
        battleField[indexEnd] = cardAtIndex;
    }
}
