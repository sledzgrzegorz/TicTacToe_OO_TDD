package com.epam.tictactoe.player;

import com.epam.tictactoe.arbiter.WinningSequence;
import com.epam.tictactoe.arbiter.WinningSequence3x3;
import com.epam.tictactoe.board.IPosition;
import com.epam.tictactoe.enums.Sign;

import java.util.*;

/**
 * Created by Grzesiek on 2016-06-26.
 */
public  class Player implements IPlayer {
    Sign sign;
    Set<IPosition> correctTurns;
    IPosition lastTurn;

    public Player(Sign sign) {
        this.sign = sign;
        this.correctTurns = new TreeSet<IPosition>();
    }

    @Override
    public String toString() {
        return "Player "+sign;
    }


    public void saveMove(IPosition position) {
        correctTurns.add(position);
        this.lastTurn=position;
    }

    public List<WinningSequence> winningSeqiences(){
        List<WinningSequence>winningSequence =  new ArrayList<WinningSequence>();
        List<IPosition> turns = new ArrayList<IPosition>(correctTurns);
        if(correctTurns.size()>=3) {
            int lastIndex = turns.indexOf(lastTurn);
            if (lastIndex - 2 >= 0) {
                winningSequence.add(new WinningSequence3x3(turns.get(lastIndex - 2), turns.get(lastIndex - 1), lastTurn));
            }
            if (lastIndex + 2 < correctTurns.size()) {
                winningSequence.add(new WinningSequence3x3(lastTurn, turns.get(lastIndex + 1), turns.get(lastIndex + 2)));
            }
            if (lastIndex - 1 >= 0 && lastIndex + 1 < correctTurns.size()) {
                winningSequence.add(new WinningSequence3x3(turns.get(lastIndex - 1), lastTurn, turns.get(lastIndex + 1)));
            }
        }
        return winningSequence;
    }

    public Sign getSign() {
        return this.sign;
    }
}
