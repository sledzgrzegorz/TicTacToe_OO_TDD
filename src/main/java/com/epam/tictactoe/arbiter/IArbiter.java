package com.epam.tictactoe.arbiter;

import java.util.List;

/**
 * Created by Grzesiek on 2016-06-26.
 */
public interface IArbiter {
    boolean isWinner(WinningSequence winningSequence);
    public boolean isWinner(List<WinningSequence> winningSequence);
}
