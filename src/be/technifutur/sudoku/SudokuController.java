package be.technifutur.sudoku;

import java.util.Scanner;

public class SudokuController {

    SudokuFactory factory;
    Scanner sc ;

    public SudokuController(SudokuFactory factory) {
        this.factory = factory;
        sc = new Scanner(System.in);
    }

    public void start(String fileName) {
        String input;

        if (this.factory != null) {
            SudokuVue vue = factory.getVue(fileName);
            SudokuModel model = vue.getModel();
            input = getChoice(vue);

            while (!input.equals("q")) {

                String tab[] = input.split("\\.");
                int line = Integer.parseInt(tab[0]) - 1;
                int row = Integer.parseInt(tab[1]) - 1;
                char value = tab[2].charAt(0);
                model.setValue(line, row, value);

                input = getChoice(vue);
            }
        }
    }

    private String getChoice(SudokuVue vue) {
        System.out.println(vue.getScreen());
        System.out.println("Entrer une valeur à mettre dans le sudoku 'ligne.colonne.valeur'");
        return sc.nextLine();
    }
}


