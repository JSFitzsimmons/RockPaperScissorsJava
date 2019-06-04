package com.revature.RockPaperScissors;

public class Player 
{
	private String name;
	private Choice choice;

	/**
	 * @return the choice
	 */
	public Choice getChoice() {
		return choice;
	}

	/**
	 * @param choice the choice to set
	 */
	public void setChoice(Choice choice) {
		this.choice = choice;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
