package be.technifutur.sudoku.sudoku4x4;

import be.technifutur.sudoku.ModelFactory;
import be.technifutur.sudoku.SudokuModel;
import be.technifutur.sudoku.SudokuVue;
import be.technifutur.sudoku.sudoku9x9.SudokuFactory9x9;
import be.technifutur.sudoku.sudoku9x9.SudokuModel9x9;
import be.technifutur.sudoku.sudoku9x9.SudokuVue9x9;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SudokuFactory4x4 implements ModelFactory {

    @Override
    public SudokuModel4x4 getModel(String fileName) {
        File file = new File(fileName);
        SudokuModel4x4 model4x4 = new SudokuModel4x4();
        int nbLine = 0;

        try(Scanner scanner = new Scanner(file)){
            while (scanner.hasNextLine()){
                String line = scanner.nextLine();
                for (int i = 0; i < model4x4.getMaxLine() ; i++) {
                        model4x4.setValue(nbLine, i, line.charAt(i));
                }
                nbLine++;
            }

        } catch (FileNotFoundException e){
            System.out.println("File not found");
        }
        return model4x4;
    }
    @Override
    public SudokuVue getVue(String fileName) {
        SudokuFactory4x4 factory4x4 = new SudokuFactory4x4();
        SudokuModel4x4 model4x4 = factory4x4.getModel(fileName);
        SudokuVue4x4 sudokuVue4x4 = new SudokuVue4x4(model4x4);
        System.out.println(sudokuVue4x4.getScreen());
        return sudokuVue4x4;
    }
}
