package com.epam.tictactoe.arbiter;

import com.epam.tictactoe.board.IPosition;

import java.util.TreeSet;

/**
 * Created by Grzesiek on 2016-06-26.
 */
public class WinningSequence3x3 extends WinningSequence {
    public WinningSequence3x3(IPosition pos1, IPosition pos2, IPosition pos3) {
        winningSequenceSet.add(pos1);
        winningSequenceSet.add(pos2);
        winningSequenceSet.add(pos3);
    }
}
