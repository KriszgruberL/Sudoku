//package be.technifutur.sudoku.Samurai;
//
//import be.technifutur.sudoku.SudokuModel;
//
//public class SudokuModelSamurai implements SudokuModel {
//    private char[][] tab;
//
//    public SudokuModelSamurai(){
//        this.tab = new char[getMaxLine()][getMaxColumn()];
//        clearAll();
//    }
//
//
//    @Override
//    public void printTab() {
//        for (int i = 0; i < getMaxLine(); i++) {
//            for (int j = 0; j < getMaxColumn(); j++) {
//                System.out.print(tab[i][j] + "\t");
//            }
//            System.out.println(" ");
//        }
//        System.out.println("----------------");
//    }
//
//    @Override
//    public int cellCount() {
//        return 21*21;
//    }
//
//    @Override
//    public char getValue(int line, int column) {
//
//        return found;
//    }
//
//    @Override
//    public void setValue(int line, int column, char value) {
//
//    }
//
//    @Override
//    public int getMaxLine() {
//        return 21;
//    }
//
//    @Override
//    public int getMaxColumn() {
//        return 21;
//    }
//
//    @Override
//    public boolean isPositionValid(int line, int column) {
//
//        return null;
//    }
//
//    @Override
//    public boolean isValueValid(char value) {
//        boolean isValValid = false;
//        if (value > '0' && value <= '4'){
//            isValValid = true;
//        }
//        return isValValid;
//    }
//
//    @Override
//    public boolean isEmpty(int line, int column) {
//        boolean empty = false;
//        if (tab[line][column] == EMPTY){
//            empty = true;
//        }
//        return empty;
//    }
//
//
//
//    @Override
//    public void clearAll() {
//        for (int i = 0; i < getMaxLine(); i++) {
//            for (int j = 0; j < getMaxColumn(); j++) {
//                tab[i][j]= EMPTY;
//            }
//        }
//    }
//
//    @Override
//    public void clearCell(int line, int column) {
//        tab[line][column] = EMPTY;
//    }
//}
