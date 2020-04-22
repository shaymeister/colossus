/**
 * ---------------------------------------------------------------------------
 * File name: GameLowerPanelElement.java
 * Project name: SudokuWars
 * ---------------------------------------------------------------------------
 * Creator's name and email: Shay Snyder, snyderse2@etsu.edu
 *
 * Course:  CSCI 1260-288
 * Creation Date: April 22, 2020
 * ---------------------------------------------------------------------------
 */

package sudoku;

import javax.swing.JFrame;

/**
 * create a JButton class that will represent each
 * of the 9 sections of numbers the user can
 * choose from when submitting a move
 *
 * <hr>
 * Date created: April 22, 2020
 * Last modified: April 22, 2020
 * 
 * <hr>
 * @author Shay Snyder
 */
public class GameLowerPanelElement extends GamePanelElement
{
    /**
     * randomly generated by compiler
     */
    private static final long serialVersionUID = -8588366620257020431L;
    
    /**
	 * arg constructor for the GridElement class
     *
	 * <hr>
	 * Date created: April 22, 2020
	 */
    public GameLowerPanelElement(Sudoku game, Settings settings, char value, JFrame window)
    {
        // call the super constructor
        super(game, settings, value, window);
    } // END: GameLowerPanelElement() arg constructor
} // END: GameLowerPanelElement class