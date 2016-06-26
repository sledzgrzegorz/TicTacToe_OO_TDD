package com.epam.tictactoe.player;

import com.epam.tictactoe.arbiter.Arbiter;
import com.epam.tictactoe.arbiter.IArbiter;
import com.epam.tictactoe.arbiter.WinningSequence;
import com.epam.tictactoe.arbiter.WinningSequence3x3;
import com.epam.tictactoe.board.Position;
import com.epam.tictactoe.enums.Sign;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

/**
 * Created by Grzesiek on 2016-06-26.
 */
public class PlayerTest {

    @Test()
    public void winningSeqiences() {
        IPlayer playerX = new Player(Sign.X);
        playerX.saveMove(new Position(1));
        playerX.saveMove(new Position(2));
        playerX.saveMove(new Position(4));
        playerX.saveMove(new Position(5));
        playerX.saveMove(new Position(3));
        List<WinningSequence> winningSequenceList = playerX.winningSeqiences();
        Assert.assertTrue(winningSequenceList.get(0).equals(new WinningSequence3x3(new Position(1), new Position(2), new Position(3))));
        Assert.assertTrue(winningSequenceList.get(1).equals(new WinningSequence3x3(new Position(3), new Position(4), new Position(5))));
        Assert.assertTrue(winningSequenceList.get(2).equals(new WinningSequence3x3(new Position(2), new Position(3), new Position(4))));
    }

    @Test()
    public void winningSeqiences1() {
        IPlayer playerX = new Player(Sign.X);
        playerX.saveMove(new Position(1));
        playerX.saveMove(new Position(2));
        playerX.saveMove(new Position(3));
        List<WinningSequence> winningSequenceList = playerX.winningSeqiences();
        Assert.assertTrue(winningSequenceList.get(0).equals(new WinningSequence3x3(new Position(1), new Position(2), new Position(3))));

    }

    @Test()
    public void winningSeqiences2() {
        IPlayer playerX = new Player(Sign.X);
        playerX.saveMove(new Position(1));
        playerX.saveMove(new Position(2));
        playerX.saveMove(new Position(4));
        playerX.saveMove(new Position(3));
        List<WinningSequence> winningSequenceList = playerX.winningSeqiences();
        Assert.assertTrue(winningSequenceList.get(0).equals(new WinningSequence3x3(new Position(1), new Position(2), new Position(3))));
        Assert.assertTrue(winningSequenceList.get(1).equals(new WinningSequence3x3(new Position(2), new Position(3), new Position(4))));
    }

    @Test()
    public void winningSeqiences3() {
        IPlayer playerX = new Player(Sign.X);
        playerX.saveMove(new Position(2));
        playerX.saveMove(new Position(3));
        playerX.saveMove(new Position(1));
        List<WinningSequence> winningSequenceList = playerX.winningSeqiences();
        Assert.assertTrue(winningSequenceList.get(0).equals(new WinningSequence3x3(new Position(1), new Position(2), new Position(3))));
    }

    @Test()
    public void winningSeqiencesWithArbiter() {
        IPlayer playerX = new Player(Sign.X);
        IArbiter arbiter = new Arbiter();
        playerX.saveMove(new Position(1));
        playerX.saveMove(new Position(2));
        playerX.saveMove(new Position(4));
        playerX.saveMove(new Position(5));
        playerX.saveMove(new Position(3));
        List<WinningSequence> winningSequenceList = playerX.winningSeqiences();

        Assert.assertTrue(arbiter.isWinner(winningSequenceList));
    }
}
