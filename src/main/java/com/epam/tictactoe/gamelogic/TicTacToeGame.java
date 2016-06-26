package com.epam.tictactoe.gamelogic;

import com.epam.tictactoe.arbiter.Arbiter;
import com.epam.tictactoe.arbiter.IArbiter;
import com.epam.tictactoe.board.*;
import com.epam.tictactoe.enums.Sign;
import com.epam.tictactoe.input.ConsoleInput;
import com.epam.tictactoe.input.IInput;
import com.epam.tictactoe.player.IPlayer;
import com.epam.tictactoe.player.Player;

/**
 * Created by grzegorz_sledz on 24.06.16.
 */
public class TicTacToeGame {
    private final IBoard board;
    private final IDimension dimension;
    private final IInput input;
    private final IArbiter arbiter;
    private final IPlayer playerO;
    private final IPlayer playerX;
    private IPlayer currentPlayer;

    public TicTacToeGame(IDimension dimension) {
        this.dimension = dimension;
        this.board = new Board(dimension);
        this.input = new ConsoleInput();
        this.arbiter = new Arbiter();
        this.playerO = new Player(Sign.O);
        this.playerX = new Player(Sign.X);
    }

    void start() {
        currentPlayer = playerO;
        IPosition position;
        int turns = 0;
        System.out.println(board);
        do {
            doMove();
            turns++;
            System.out.println(board);
            if (turns >= 5 && arbiter.isWinner(currentPlayer.winningSeqiences())) {
                System.out.println("The winner is: " + currentPlayer);
                stop();
            }
            nextPlayer();
        } while (!board.isFullyFilled());
        System.out.println("Nobody won");
    }

    public void doMove() {
        boolean correctMove = false;
        do {
            System.out.println(currentPlayer + " choose field [1-" + dimension.getValue() * dimension.getValue() + "]: ");
            IPosition position = new Position(input.read());
            correctMove = board.placeMark(position, currentPlayer.getSign());
            if (correctMove) {
                currentPlayer.saveMove(position);
            } else {
                System.out.println(position + " is not valid. Try again!!");
            }
        } while (!correctMove);
    }

    public void nextPlayer() {
        if (currentPlayer == playerO) {
            this.currentPlayer = playerX;
        } else {
            this.currentPlayer = playerO;
        }
    }

    public void stop() {
        System.exit(0);
    }

}
