package com.epam.tictactoe.board;

public class Dimension implements IDimension{

	private final int value;

	public Dimension(int value) {
		this.value=value;
	}
	
	public int getValue() {
		return this.value;
	}

}
