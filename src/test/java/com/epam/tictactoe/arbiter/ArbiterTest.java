package com.epam.tictactoe.arbiter;

import com.epam.tictactoe.board.Position;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Grzesiek on 2016-06-26.
 */
public class ArbiterTest {
    @Test()
    public void isWinner() {
        IArbiter arbiter=new Arbiter();
        Assert.assertTrue(arbiter.isWinner(new WinningSequence3x3(new Position(1),new Position(2),new Position(3))));
        Assert.assertFalse(arbiter.isWinner(new WinningSequence3x3(new Position(1),new Position(3),new Position(4))));
    }
}
