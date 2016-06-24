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
        Assert.assertFalse(board.placeMark(new Position(0),sign));
        Assert.assertFalse(board.placeMark(new Position(10),sign));
        Assert.assertTrue(board.placeMark(new Position(1),sign));
        Assert.assertTrue(board.placeMark(new Position(9),sign));
    }

    @Test()
    public void checkElementAtPosition() {
        IBoard board = new Board(new Dimension(3));
        Sign sign=Sign.O;
        IPosition position=new Position(5);
        board.placeMark(position,sign);
        Assert.assertEquals(board.elementAt(position),sign);
        Assert.assertEquals(board.elementAt(new Position(4)),Sign.EMPTY);
        Assert.assertNotEquals(board.elementAt(new Position(6)),Sign.X);
    }
    @Test()
    public void toStringTestCorrect() {
        IBoard board = new Board(new Dimension(3));
        Sign sign=Sign.O;
        IPosition position=new Position(5);
        board.placeMark(position,sign);
        StringBuilder stringBuilder=new StringBuilder();
        stringBuilder.append("-|-|-\n");
        stringBuilder.append("-|O|-\n");
        stringBuilder.append("-|-|-\n");
        Assert.assertEquals(board.toString(),stringBuilder.toString());
        Assert.assertNotEquals(board.toString(),stringBuilder.toString().replaceAll("O","-"));
    }
}


