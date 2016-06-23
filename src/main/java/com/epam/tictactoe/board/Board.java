package com.epam.tictactoe.board;

import com.epam.tictactoe.enums.Sign;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Grzesiek on 2016-06-23.
 */
public class Board implements IBoard {

    private final int dimension;
    private final Map<Integer, Sign> fields;

    public Board(IDimension dimension) {
        this.dimension = dimension.getValue();
        this.fields = new HashMap<Integer, Sign>();
        this.initialize();
    }

    private void initialize() {
        for (int i = 1; i <= dimension * dimension; i++) {
            fields.put(i, Sign.EMPTY);
        }
    }

    public boolean isFullyFilled() {
        return !(fields.containsValue(Sign.EMPTY));
    }

    public boolean mark(int position, Sign value) {
        if (fields.containsKey(position)) {
            fields.put(position, value);
            return true;
        } else
            return false;
    }
    public Sign elementAt(int position) {
        return fields.get(position);
    }
    public String toString(){
        StringBuilder stringBuilder=new StringBuilder();
        for (int i = 1; i <= dimension*dimension; i++) {
            stringBuilder.append(fields.get(i));
            if(i%dimension!=0){
                stringBuilder.append("|");
            }else{
                stringBuilder.append('\n');
            }
        }
        return stringBuilder.toString();
    }
}
