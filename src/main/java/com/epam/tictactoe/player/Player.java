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
    IPosition lastTurn;

    public Player(Sign sign) {
        this.sign = sign;
    }

    @Override
    public String toString() {
        return "Player "+sign;
    }

    public Sign getSign() {
        return this.sign;
    }
}
