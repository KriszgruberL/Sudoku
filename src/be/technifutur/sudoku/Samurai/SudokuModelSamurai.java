package be.technifutur.sudoku.Samurai;

import be.technifutur.sudoku.SudokuModel;

public class SudokuModelSamurai implements SudokuModel {
    private char[][] tab;

    public SudokuModelSamurai(){
        this.tab = new char[getMaxLine()][getMaxColumn()];
        clearAll();
    }


    @Override
    public void printTab() {
        for (int i = 0; i < getMaxLine(); i++) {
            for (int j = 0; j < getMaxColumn(); j++) {
                System.out.print(tab[i][j] + "\t");
            }
            System.out.println(" ");
        }
    }

    @Override
    public int cellCount() {
        return 21*21 - (4*(2*9));
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
        return 21;
    }

    @Override
    public int getMaxColumn() {
        return 21;
    }

    @Override
    public boolean isPositionValid(int line, int column) {
        if (line < 6 || line > 14){
            if (column > 8 && column <= 11){
                return false;
            }else {
                return true;
            }
        } else {
            if (column < 6 || column > 14){
                if (line > 8 && line <= 11){
                    return false;
                } else {
                    return true;
                }
            } else {
                return true;
            }
        }

    }

    @Override
    public boolean isValueValid(char value) {
        boolean isValValid = false;
        if (value > '0' && value <= '9'){
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
    public void clearAll() {
        for (int i = 0; i < getMaxLine(); i++) {
            for (int j = 0; j < getMaxColumn(); j++) {
                tab[i][j]= EMPTY;
            }
        }
    }

    @Override
    public void clearCell(int line, int column) {
        tab[line][column] = EMPTY;
    }
}
