package be.technifutur.sudoku;

import be.technifutur.sudoku.Samurai.SudokuFactorySamurai;
import be.technifutur.sudoku.sudoku4x4.SudokuFactory4x4;
import be.technifutur.sudoku.sudoku9x9.SudokuFactory9x9;
import com.sun.security.jgss.GSSUtil;

import java.io.File;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        SudokuFactory factory;
        SudokuController ctrl;
        Scanner sc = new Scanner(System.in);
        int choice;
        System.out.println("""
                Menu :
                1 pour un Sudoku 4x4
                2 pour un Sudoku 9x9
                3 pour un Sudoku Samurai
                4 pour quitter
                """);

        choice = Integer.parseInt(sc.nextLine());
        switch (choice) {
            case 1:
                factory = new SudokuFactory4x4();
                ctrl = new SudokuController(factory);
                ctrl.start("Ressources\\sudoku4x4.txt");
                break;
            case 2:
                factory = new SudokuFactory9x9();
                ctrl = new SudokuController(factory);
                ctrl.start("Ressources\\sudoku9x9.txt");
                break;
            case 3:
                factory = new SudokuFactorySamurai();
                ctrl = new SudokuController(factory);
                ctrl.start("Ressources\\sudokuSamurai.txt");
                break;
            case 4:
                System.out.println("Okay bye");
                break;
            default:
                System.out.println("Valeur invalide");
                break;
//        }
//        File dir  = new File("C:\\Users\\PC\\Desktop\\Dossier");
//        File[] liste = dir.listFiles();
//        for(File item : liste){
//            if(item.isFile())
//            {
//                System.out.format("Nom du fichier: %s%n", item.getName());
//            }
//            else if(item.isDirectory())
//            {
//                System.out.format("Nom du répertoir: %s%n", item.getName());
//            }
//        }
        }
    }
}

//


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

