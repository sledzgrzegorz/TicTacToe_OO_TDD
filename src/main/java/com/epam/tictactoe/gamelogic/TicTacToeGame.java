package com.epam.tictactoe.gamelogic;

import com.epam.tictactoe.board.Board;
import com.epam.tictactoe.board.IBoard;
import com.epam.tictactoe.board.IDimension;
import com.epam.tictactoe.board.Position;
import com.epam.tictactoe.enums.Sign;

/**
 * Created by grzegorz_sledz on 24.06.16.
 */
public class TicTacToeGame {
    private final IBoard board;
    private final IDimension dimension;

    public TicTacToeGame(IDimension dimension){
        this.dimension=dimension;
        this.board=new Board(dimension);
    }
    void start(){
        board.placeMark(new Position(5), Sign.O);
        System.out.println(board);

    }

}
