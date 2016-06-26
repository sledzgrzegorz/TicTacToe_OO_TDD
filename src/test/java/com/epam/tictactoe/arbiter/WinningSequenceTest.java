package com.epam.tictactoe.arbiter;

import com.epam.tictactoe.board.Board;
import com.epam.tictactoe.board.Dimension;
import com.epam.tictactoe.board.IBoard;
import com.epam.tictactoe.board.Position;
import com.epam.tictactoe.enums.Sign;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Grzesiek on 2016-06-26.
 */
public class WinningSequenceTest {

    @Test()
    public void theSameWinningCondtion() {
        WinningSequence first=new WinningSequence3x3(new Position(1),new Position(2),new Position(3));
        WinningSequence second=new WinningSequence3x3(new Position(1),new Position(2),new Position(3));
        Assert.assertEquals(first,second);
        Assert.assertTrue(first.equals(second));
    }
    @Test()
    public void differentWinningCondtion() {
        WinningSequence first=new WinningSequence3x3(new Position(1),new Position(2),new Position(3));
        WinningSequence second=new WinningSequence3x3(new Position(2),new Position(2),new Position(3));
        Assert.assertNotEquals(first,second);
        Assert.assertFalse(first.equals(second));
    }
}
