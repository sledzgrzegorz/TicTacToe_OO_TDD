package com.epam.tictactoe.player;

import com.epam.tictactoe.enums.Sign;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by grzegorz_sledz on 27.06.16.
 */
public class PlayerManagerTest {


    @Test
    public void nextPlayerTest() {
        IPlayerManager playerManager=new PlayerManager(new Player(Sign.O),new Player(Sign.X));
        Assert.assertEquals(playerManager.next(),new Player(Sign.O));
        Assert.assertEquals(playerManager.next(),new Player(Sign.X));
        Assert.assertEquals(playerManager.next(),new Player(Sign.O));
    }

}
