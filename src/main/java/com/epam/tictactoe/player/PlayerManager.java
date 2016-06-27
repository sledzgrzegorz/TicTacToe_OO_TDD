package com.epam.tictactoe.player;

import com.epam.tictactoe.enums.Sign;

/**
 * Created by grzegorz_sledz on 27.06.16.
 */
public class PlayerManager implements IPlayerManager {

    IPlayer nextPlayer;

    private final IPlayer first;
    private final IPlayer second;
    public PlayerManager(IPlayer first,IPlayer second){
        this.first=first;
        this.second=second;
        this.nextPlayer=second;
    }

    public IPlayer next() {
        if(nextPlayer.equals(second)){
            nextPlayer=first;
        }else{
            nextPlayer=second;
        }
        return nextPlayer;
    }
}
