package com.teammetallurgy.mctcg.registry;

import java.util.HashMap;
import java.util.Map;

import com.teammetallurgy.mctcg.card.Card;

import net.minecraft.util.Icon;

public class CardRegistry {
	private static CardRegistry instance;
	
	private static Map<String, Card> cards;
	
	private CardRegistry() {}
	
	public static CardRegistry getInstance()
	{
		if (instance == null) 
		{
			instance = new CardRegistry();
			cards = new HashMap<String, Card>();
		}
		return instance;
	}
	
	public void registerCard(String name, int defence, int attack, Icon texture) throws Exception
	{
		registerCard(new Card(name, defence, attack, texture));
	}
	
	public void registerCard(Card card) throws Exception
	{
		if(!cards.containsKey(card.getName()))
		{
			cards.put(card.getName(), card);
		}
		else 
		{
			throw new Exception("Card Already in registry");
		}
	}
}
