package be.technifutur.sudoku.sudoku4x4;

import be.technifutur.sudoku.ModelFactory;
import be.technifutur.sudoku.SudokuModel;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SudokuFactory4x4 implements ModelFactory {
    @Override
    public SudokuModel getModel(String fileName) {
        File file = new File("Ressources\\sudoku4x4.txt");
        SudokuModel4x4 model4x4 = new SudokuModel4x4();

        try(Scanner scanner = new Scanner(file)){
            while (scanner.hasNextLine()){
                String line = scanner.nextLine();
                System.out.println(line);
            }
        } catch (FileNotFoundException e){
            System.out.println("File not found");
        }

        return model4x4;
    }
}
