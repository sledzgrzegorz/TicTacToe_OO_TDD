package com.epam.tictactoe.gamelogic;

import com.epam.tictactoe.board.Board;
import com.epam.tictactoe.board.IBoard;
import com.epam.tictactoe.board.IDimension;
import com.epam.tictactoe.board.Position;
import com.epam.tictactoe.enums.Sign;
import com.epam.tictactoe.player.IPlayer;
import com.epam.tictactoe.player.IPlayerManager;
import com.epam.tictactoe.player.Player;
import com.epam.tictactoe.player.PlayerManager;

/**
 * Created by grzegorz_sledz on 24.06.16.
 */
public class TicTacToeGame {
    private final IBoard board;
    private final IDimension dimension;
    private final IPlayerManager playerManager;

    public TicTacToeGame(IDimension dimension){
        this.dimension=dimension;
        this.board=new Board(dimension);
        this.playerManager=new PlayerManager(new Player(Sign.O),new Player(Sign.X));
    }
    void start(){
        board.placeMark(new Position(5), playerManager.next().getSign());
        board.placeMark(new Position(4), playerManager.next().getSign());
        board.placeMark(new Position(3), playerManager.next().getSign());
        board.placeMark(new Position(2), playerManager.next().getSign());
        System.out.println(board);

    }

}
