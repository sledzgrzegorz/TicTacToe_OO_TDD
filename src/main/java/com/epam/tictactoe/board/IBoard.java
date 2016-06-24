package com.epam.tictactoe.board;

import com.epam.tictactoe.enums.Sign;

public interface IBoard {
	public boolean isFullyFilled();
	public boolean placeMark(int position, Sign value);
	public Sign elementAt(int position);
}
