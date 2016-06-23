package com.epam.tictactoe.board;

import com.epam.tictactoe.enums.Sign;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Grzesiek on 2016-06-23.
 */

public class BoardTests {

    @Test()
    public void emptyBoardTest() {
        IBoard board = new Board(new Dimension(3));
        Assert.assertFalse(board.isFullyFilled());
    }
    @Test()
    public void markSignXAtPosition() {
        IBoard board = new Board(new Dimension(3));
        Sign sign=Sign.X;
        Assert.assertFalse(board.mark(0,sign));
        Assert.assertFalse(board.mark(10,sign));
        Assert.assertTrue(board.mark(1,sign));
        Assert.assertTrue(board.mark(9,sign));
    }

    @Test()
    public void checkElementAtPosition() {
        IBoard board = new Board(new Dimension(3));
        Sign sign=Sign.O;
        int position=5;
        board.mark(position,sign);
        Assert.assertEquals(board.elementAt(position),sign);
        Assert.assertEquals(board.elementAt(position-1),Sign.EMPTY);
        Assert.assertNotEquals(board.elementAt(position+1),Sign.X);
    }
}
