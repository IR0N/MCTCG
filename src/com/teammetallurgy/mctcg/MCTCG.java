package com.teammetallurgy.mctcg;


public class MCTCG 
{
    public static void main(String[] args)
    {
        Player player1 = new Player("odin",20);
        
        System.out.println(player1.getDeck().drawTopCard());
        
        player1.decLife();
        System.out.println(player1.getLife());
    }
}
