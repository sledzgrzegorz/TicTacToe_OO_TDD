package com.epam.tictactoe.input;

import java.util.Scanner;

public class ConsoleInput implements IInput {
	private Scanner in;

	public ConsoleInput() {
		this.in = new Scanner(System.in);
	}

	public int read() {
		return in.nextInt();
	}

}
