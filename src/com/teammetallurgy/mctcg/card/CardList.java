package com.teammetallurgy.mctcg.card;

import net.minecraft.util.Icon;

public enum CardList
{
    CREEPER("Creepr", 1, 0, null);

    private String name;
    private int attack, defence;
    private Icon texture;

    CardList(String cardName, int cardDefence, int cardAttack, Icon cardTexture)
    {
        name = cardName;
        defence = cardDefence;
        attack = cardAttack;
        texture = cardTexture;
    }

    public String getName()
    {
        return name;
    }

    public int getAttack()
    {
        return attack;
    }

    public int getDefence()
    {
        return defence;
    }

    public Icon getTexture()
    {
        return texture;
    }
}
