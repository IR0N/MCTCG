package com.teammetallurgy.mctcg.card;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class Deck {

	private Stack<Card> cards;
	
	public Deck() 
	{
		cards = new Stack<Card>();
	}
	
	public void shuffle()
	{
		Collections.shuffle(cards);
	}
	
	public Card drawTopCard() 
	{
		return cards.pop();
	}
	
	public List<Card> drawCards(int amount)
	{
		List<Card> tempHand = new LinkedList<Card>();
		
		for(int i = 0; i < amount; i++)
		{
			tempHand.add(drawTopCard());
		}
		return tempHand;
	}
	
	public Card lookAtTopCard()
	{
		return cards.peek();
	}
}
