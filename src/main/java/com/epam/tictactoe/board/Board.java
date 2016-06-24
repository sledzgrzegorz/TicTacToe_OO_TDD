package com.epam.tictactoe.board;

import com.epam.tictactoe.enums.Sign;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Grzesiek on 2016-06-23.
 */
public class Board implements IBoard {

    private final int dimension;
    private final Map<IPosition, Sign> fields;

    public Board(IDimension dimension) {
        this.dimension = dimension.getValue();
        this.fields = new HashMap<IPosition, Sign>();
        this.initialize();
    }

    private void initialize() {
        for (int i = 1; i <= dimension * dimension; i++) {
            fields.put(new Position(i), Sign.EMPTY);
        }
    }

    public boolean isFullyFilled() {
        return !(fields.containsValue(Sign.EMPTY));
    }

    public boolean placeMark(IPosition position, Sign value) {
        if (fields.containsKey(position)&&fields.get(position)==Sign.EMPTY) {
            fields.put(position, value);
            return true;
        } else
            return false;
    }
    public Sign elementAt(IPosition position) {
        return fields.get(position);
    }

    public String toString(){
        StringBuilder stringBuilder=new StringBuilder();
        for (int i = 1; i <= dimension*dimension; i++) {
            stringBuilder.append(fields.get(new Position(i)));
            if(i%dimension!=0){
                stringBuilder.append("|");
            }else{
                stringBuilder.append('\n');
            }
        }
        return stringBuilder.toString();
    }
}
