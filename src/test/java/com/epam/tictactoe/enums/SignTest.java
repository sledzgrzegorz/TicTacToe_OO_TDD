package com.epam.tictactoe.enums;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by Grzesiek on 2016-06-23.
 */
public class SignTest {
    @Test
    public void testSignX() {
        Assert.assertEquals("X",Sign.X.toString());
    }

    @Test
    public void testSignY() {
        Assert.assertEquals("O",Sign.O.toString());
    }

}