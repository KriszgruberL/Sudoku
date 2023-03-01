package be.technifutur.sudoku;

public interface SudokuVue {

    /**
     * Renvoie la string
     * @return la string
     */
    String getScreen();

    /**
     * @return le modèle à imprimer dans un sout dans le main
     */
    SudokuModel getModel();
}
