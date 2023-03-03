package be.technifutur.sudoku;

import be.technifutur.sudoku.sudoku4x4.SudokuFactory4x4;
import be.technifutur.sudoku.sudoku9x9.SudokuFactory9x9;


public class Main {
    public static void main(String[] args) {

        ModelFactory sudoku4x4 = new SudokuFactory4x4();
        sudoku4x4.getVue("Ressources\\sudoku4x4.txt");

        ModelFactory sudoku9x9 = new SudokuFactory9x9();
        sudoku9x9.getVue("Ressources\\sudoku9x9.txt");



//        {
//            System.out.println("Sudoku 4x4");
//
//            SudokuModel4x4 model = new SudokuModel4x4();
//            SudokuVue vue4x4 = new SudokuVue4x4(model);
//
//            System.out.println(vue4x4.getScreen());
//            vue4x4.getModel().setValue(0, 0, '1');
//
//            System.out.println(vue4x4.getScreen());
//
//            System.out.println("Sudoku 9x9");
//
//            SudokuModel9x9 model9x9 = new SudokuModel9x9();
//            SudokuVue vue9x9 = new SudokuVue9x9((model9x9));
//
//            System.out.println(vue9x9.getScreen());
//            vue9x9.getModel().setValue(0, 0, '1');
//
//            System.out.println(vue9x9.getScreen());
//        }




//        {
//            model.printTab();
//            System.out.println(model.cellCount());
//            model.setValue(2, 3, '2');
//            model.setValue(1, 3, '1');
//            model.setValue(0, 3, '0');
//
//            model.getValue(2, 3);
//
//            System.out.println(model.getMaxColumn());
//            System.out.println(model.getMaxLine());
//
//            model.isPositionValid(5, 3);
//            model.isValueValid('9');
//
//            System.out.println(model.isEmpty(2, 3));
//            System.out.println(model.isEmpty(3, 3));
//
//            model.printTab();
//
//            model.clearCell(2, 3);
//            model.printTab();
//
//            model.clearAll();
//            model.printTab();
//        }
    }
}
