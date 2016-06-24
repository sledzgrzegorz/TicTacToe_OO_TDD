package com.epam.tictactoe.gamelogic;

import com.epam.tictactoe.board.Dimension;

/**
 * Created by grzegorz_sledz on 24.06.16.
 */
public class Main {

    public static void main(String[] args){
        TicTacToeGame ticTacToe=new TicTacToeGame(new Dimension(3));
        ticTacToe.start();

    }
}
