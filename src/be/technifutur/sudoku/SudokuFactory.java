package be.technifutur.sudoku;

public interface SudokuFactory {
    SudokuModel getModel (String fileName);

    SudokuVue getVue(String fileName);
}
