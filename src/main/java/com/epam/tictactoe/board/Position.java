package com.epam.tictactoe.board;


/**
 * Created by grzegorz_sledz on 24.06.16.
 */
public class Position implements IPosition, Comparable {
    final int value;

    public Position(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        Position guest = (Position) obj;
        return this.value == guest.value;
    }

    @Override
    public int hashCode() {
        return this.value;
    }

    public int compareTo(Object o) {
        Position position = (Position) o;
        return new Integer(this.value).compareTo(position.value);
    }
}
