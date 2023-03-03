package be.technifutur.sudoku.sudoku9x9;

import be.technifutur.sudoku.ModelFactory;
import be.technifutur.sudoku.SudokuModel;
import be.technifutur.sudoku.SudokuVue;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SudokuFactory9x9 implements ModelFactory {
    @Override
    public SudokuModel9x9 getModel(String fileName) {
        File file = new File(fileName);
        SudokuModel9x9 model9x9 = new SudokuModel9x9();
        int nbLine = 0;

        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();

                for (int i = 0; i < model9x9.getMaxLine(); i++) {
                        model9x9.setValue(nbLine, i, line.charAt(i));
                }
                nbLine++;
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
        return model9x9;
    }

    @Override
    public SudokuVue getVue(String fileName) {
        SudokuFactory9x9 factory9x9 = new SudokuFactory9x9();
        SudokuModel9x9 model9x9 = factory9x9.getModel(fileName);
        SudokuVue9x9 sudokuVue9x9 = new SudokuVue9x9(model9x9);
        System.out.println(sudokuVue9x9.getScreen());
        return sudokuVue9x9;
    }


}
