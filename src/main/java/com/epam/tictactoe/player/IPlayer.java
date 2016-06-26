package com.epam.tictactoe.player;

import com.epam.tictactoe.arbiter.WinningSequence;
import com.epam.tictactoe.board.IPosition;
import com.epam.tictactoe.enums.Sign;

import java.util.List;
import java.util.Set;

/**
 * Created by Grzesiek on 2016-06-26.
 */
public interface IPlayer {
    public void saveMove(IPosition position);
    public List<WinningSequence> winningSeqiences();
    Sign getSign();
    
}
