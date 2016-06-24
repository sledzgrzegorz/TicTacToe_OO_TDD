package com.epam.tictactoe.board;

import com.epam.tictactoe.enums.Sign;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by grzegorz_sledz on 24.06.16.
 */
public class PositionTest {
    @Test()
    public void testTwoDifferentPosition() {
        IPosition position5=new Position(5);
        IPosition position4=new Position(4);
        Assert.assertNotNull(position5);
        Assert.assertNotEquals(position5,position4);
    }
    @Test()
    public void testTwoTheSamePosition() {
        IPosition position5=new Position(5);
        Assert.assertNotNull(position5);
        Assert.assertEquals(position5,new Position(5));
    }
}