package com.epam.tictactoe.board;

import com.epam.tictactoe.enums.Sign;

public interface IBoard {
	public boolean isFullyFilled();
	public boolean mark(int position, Sign value);
	public Sign elementAt(int position);
}
