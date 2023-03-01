package be.technifutur.sudoku;

public interface SudokuModel {
    char EMPTY = 0; //la valeur dans une case quand elle est vide


    /**
     * Retourne le nombre de cell valide/inscrivable du sudoku
     *
     * @return le nombre de cellule
     */
    int cellCount();

    /**
     * Retourne la valeur contenue dans une case
     *
     * @param line
     * @param column
     * @return la valeur contenue dans la case
     */
    char getValue(int line, int column);

    /**
     * Place la value entrée en paramètres à la position donnée par la line et la column
     *
     * @param line
     * @param column
     * @param value  valeur a insérer
     */
    void setValue(int line, int column, char value);

    /**
     * Calcule le nombre max de line du sudoku
     *
     * @return un int du max de line
     */
    int getMaxLine();

    /**
     * Calcule le nombre max de column du sudoku
     *
     * @return un int du max de column
     */
    int getMaxColumn();

    /**
     * Confirme qu'une position choisie selon la line et column est valide
     *
     * @param line
     * @param column
     * @return true/false -> position
     */
    boolean isPositionValid(int line, int column);

    /**
     * Confirme qu'une valeur est valeur et peut être contenue dans le sudoku
     *
     * @param value -- valeur entrée à checker
     * @return true/false -> valeur
     */
    boolean isValueValid(char value);

    /**
     * Check si la case est vide ou non
     *
     * @param line
     * @param column
     * @return true/false
     */
    boolean isEmpty(int line, int column);

    /**
     * Vide le sudoku
     */
    void clear();

}
