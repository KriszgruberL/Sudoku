package be.technifutur.sudoku.sudoku9x9;

import be.technifutur.sudoku.SudokuModel;
import be.technifutur.sudoku.SudokuVue;

public class SudokuVue9x9 implements SudokuVue {
    private static String format= """
            
            +-------------------+-------------------+-------------------+
            |                   |                   |                   |
            |    .    .    .    |    .    .    .    |    .    .    .    |
            |                   |                   |                   |
            |    .    .    .    |    .    .    .    |    .    .    .    |
            |                   |                   |                   |
            |    .    .    .    |    .    .    .    |    .    .    .    |
            |                   |                   |                   |
            +-------------------+-------------------+-------------------+
            |                   |                   |                   |
            |    .    .    .    |    .    .    .    |    .    .    .    |
            |                   |                   |                   |
            |    .    .    .    |    .    .    .    |    .    .    .    |
            |                   |                   |                   |
            |    .    .    .    |    .    .    .    |    .    .    .    |
            |                   |                   |                   |
            +-------------------+-------------------+-------------------+
            |                   |                   |                   |
            |    .    .    .    |    .    .    .    |    .    .    .    |
            |                   |                   |                   |
            |    .    .    .    |    .    .    .    |    .    .    .    |
            |                   |                   |                   |
            |    .    .    .    |    .    .    .    |    .    .    .    |
            |                   |                   |                   |
            +-------------------+-------------------+-------------------+
      
 
            """.replace(".","%s");

    private SudokuModel9x9 model;

    public SudokuVue9x9(SudokuModel9x9 model) {
        this.model = model;
    }

    @Override
    public String getScreen() {
        Character[] val = new Character[model.cellCount()];
        int pos = 0;
        for (int l = 0; l < getModel().getMaxLine(); l++) {
            for (int c = 0; c < getModel().getMaxColumn(); c++) {
                if (model.isEmpty(l,c)){
                    val[pos] = '.';
                } else {
                    val[pos] = model.getValue(l,c);
                }
                pos++;
            }
        }
        return String.format(format, val);
    }

    @Override
    public SudokuModel getModel() {
        return this.model;
    }
}
