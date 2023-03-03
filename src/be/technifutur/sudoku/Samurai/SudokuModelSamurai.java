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
        boolean result = false;
        if ((line >= 0 && line <9 && column >=0 && column <9)
                ||(line >= 0 && line <9 && column >= 12 && column <21)
                ||(line >= 6 && line <15 && column >=6 && column <15)
                ||(line >= 12 && line <21 && column >=0 && column <9)
                ||(line >= 12 && line <21 && column >=12 && column <21))
        {
            result = true;
        }
        return result;
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
