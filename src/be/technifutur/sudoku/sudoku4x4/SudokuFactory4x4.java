package be.technifutur.sudoku.sudoku4x4;

import be.technifutur.sudoku.ModelFactory;
import be.technifutur.sudoku.SudokuModel;

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
                System.out.println(line);
                for (int i = 0; i < model4x4.getMaxLine() ; i++) {
                    char value = line.charAt(i);
                    if (value != '.') {
                        model4x4.setValue(nbLine,i, value);
                    }
                }
                nbLine++;
            }

        } catch (FileNotFoundException e){
            System.out.println("File not found");
        }
        return model4x4;
    }
}
