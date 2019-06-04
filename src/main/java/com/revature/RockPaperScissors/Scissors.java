package com.revature.RockPaperScissors;

public class Scissors extends Choice 
{
	public int didWin(Choice c) throws Exception
	{
		if(c instanceof Paper) 
		{
			return 0;
		}
		else if(c instanceof Scissors) 
		{
			return -1;
		}
		else if(c instanceof Rock) 
		{
			return 1;
		}		
		throw new Exception(); //this is me ducking this exception 
	}
}
