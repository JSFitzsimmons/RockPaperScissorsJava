package com.revature.RockPaperScissors;

public class main {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
			//Player p1 = new Player();
		Rock r = new Rock();
		Paper p = new Paper();
		int res = 0;
		try 
		{
			res = r.didWin(p);
		}
		catch(Exception e) 
		{
			
		}
		System.out.println("This is a test");
		//System.out.println(calculateTotal(100));
	}
	
}
