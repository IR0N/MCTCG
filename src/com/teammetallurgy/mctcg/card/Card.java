package com.teammetallurgy.mctcg.card;

import net.minecraft.util.Icon;

public class Card {
	
	private final String name;
	private final Icon texture;
	
	private int attack, defence;
	
	public Card(String cardName, int cardDefence, int cardAttack, Icon cardTexture)
	{
		this.name = cardName;
		this.defence = cardDefence;
		this.attack = cardAttack;
		this.texture = cardTexture;
	}
	
	public String getName() {
		return name;
	}
	
	public Icon getTexture() {
		return texture;
	}
	
	public int getAttack() {
		return attack;
	}
	
	public int getDefence() {
		return defence;
	}
	
	public void setAttack(int attack) {
		this.attack = attack;
	}
	
	public void setDefence(int defence) {
		this.defence = defence;
	}
	
	public void incAttack(int amount) {
		setAttack(getAttack() + amount); 
	}
	
	public void incAttack() {
		incAttack(1);
	}
	
	public void decAttack(int amount) {
		incAttack(-amount);
	}
	
	public void decAttack() {
		decAttack(1);
	}
	
	public void incDefence(int amount) {
		setDefence(getDefence() + amount);
	}
	
	public void incDefence() {
		incAttack(1);
	}
	
	public void decDefence(int amount) {
		incDefence(-amount);
	}
	
	public void decDefence() {
		decDefence(1);
	}
}
