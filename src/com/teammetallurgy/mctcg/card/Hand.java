package com.teammetallurgy.mctcg.card;

import java.util.Stack;

public class Hand
{
    private Stack<Card> cards;
    
    
    public void addCardToHand(Card card)
    {
        cards.push(card);
    }
    
    public void removeCardAtIndex(int index)
    {
        cards.remove(index);
    }
    
    public Card getCardAtIndex(int index)
    {
        if (index < 0 || index >= cards.size())
            return null;
        
        return cards.get(index);
    }
}
