package com.epam.tictactoe.arbiter;

import com.epam.tictactoe.board.IPosition;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by Grzesiek on 2016-06-26.
 */
public abstract class WinningSequence {
    final Set<IPosition> winningSequenceSet;

    public WinningSequence(){
        this.winningSequenceSet = new TreeSet<IPosition>();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        WinningSequence winningSequence = (WinningSequence) obj;
        return this.winningSequenceSet.equals(winningSequence.winningSequenceSet);
    }

    @Override
    public int hashCode() {
        return 31 * winningSequenceSet.hashCode();
    }
}
