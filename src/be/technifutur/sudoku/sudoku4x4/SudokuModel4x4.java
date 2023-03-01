package be.technifutur.sudoku.sudoku4x4;

import be.technifutur.sudoku.SudokuModel;

public class SudokuModel4x4 implements SudokuModel {
    private char [][] tab;
    public SudokuModel4x4(){
        this.tab = new char[getMaxLine()][getMaxColumn()];
        clear();
    }

    @Override
    public int cellCount() {
        return 4*4;
    }

    @Override
    public char getValue(int line, int column) {
        char found;
        found = tab[line][column];
        return found;
    }

    @Override
    public void setValue(int line, int column, char value) {
        tab[line][column] = value;
    }

    @Override
    public int getMaxLine() {
        return 4;
    }

    @Override
    public int getMaxColumn() {
        return 4;
    }

    @Override
    public boolean isPositionValid(int line, int column) {
        boolean isPosValid = false;
        if ((line >= 0 && line <=3 )&& (column >= 0 && column <= 3)){
            isPosValid = true;
        }
        return isPosValid;
    }

    @Override
    public boolean isValueValid(char value) {
        boolean isValValid = false;
        if (value > 0 && value <= 4){
            isValValid = true;
        }
        return isValValid;
    }

    @Override
    public boolean isEmpty(int line, int column) {
        boolean empty = false;
        if (tab[line][column] == EMPTY){
            empty = true;
        }
        return empty;
    }

    @Override
    public void clear() {
        for (int i = 0; i < getMaxLine(); i++) {
            for (int j = 0; j < getMaxColumn(); j++) {
                tab[i][j]= EMPTY;
            }
        }
    }
}
