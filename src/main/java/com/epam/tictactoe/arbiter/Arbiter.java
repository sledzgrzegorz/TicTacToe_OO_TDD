package com.epam.tictactoe.arbiter;

import com.epam.tictactoe.board.Position;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by Grzesiek on 2016-06-26.
 */
public class Arbiter implements IArbiter {
    private final Set<WinningSequence> winningSequenceSet;

    public Arbiter() {
        this.winningSequenceSet = new LinkedHashSet<WinningSequence>(8);
        initialize();
    }

    void initialize() {
        winningSequenceSet.add(new WinningSequence3x3(new Position(1), new Position(2), new Position(3)));
        winningSequenceSet.add(new WinningSequence3x3(new Position(1), new Position(4), new Position(7)));
        winningSequenceSet.add(new WinningSequence3x3(new Position(1), new Position(5), new Position(9)));
        winningSequenceSet.add(new WinningSequence3x3(new Position(2), new Position(5), new Position(8)));
        winningSequenceSet.add(new WinningSequence3x3(new Position(3), new Position(6), new Position(9)));
        winningSequenceSet.add(new WinningSequence3x3(new Position(3), new Position(5), new Position(7)));
        winningSequenceSet.add(new WinningSequence3x3(new Position(4), new Position(5), new Position(6)));
        winningSequenceSet.add(new WinningSequence3x3(new Position(7), new Position(8), new Position(9)));
    }

    public boolean isWinner(WinningSequence winningSequence) {
        return this.winningSequenceSet.contains(winningSequence);
    }
    public boolean isWinner(List<WinningSequence> winningSequence) {
        for(WinningSequence ws:winningSequence){
            if(isWinner(ws)){
                return true;
            }
        }
        return false;
    }
}
