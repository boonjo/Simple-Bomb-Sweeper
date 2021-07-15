
import javax.swing.JLabel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author shim_869637
 */
public class Tile extends JLabel{
    
    // Instance Variable
    private int numBombs;
    private int gridx;          // Keeps track of the column in the grid
    private int gridy;          // Keeps track of the row in the grid
    private boolean flag;
    private boolean uncovered;

    /* numBombs will represent the state of the tile in the game
     * Restrictions:
        value must be from 0 - 9
     * 0 - blank space, uses "blank.gif" icon
       1 - 1 adjecent bombs, uses "1" image in blue
       2 - 2 adjecent bombs, uses "2" image in green
       3 - 3 adjecent bombs, uses "3" image in red
       4 - 4 adjecent bombs, uses "4" image in navy
       5 - 5 adjecent bombs, uses "5" image in maroon
       6 - 6 adjecent bombs, uses "6" image in teal
       7 - 7 adjecent bombs, uses "7" image in black
       8 - 8 adjecent bombs, uses "8" image in gray
       9 - 9 snake (bomb), uses "snake.gif" image
    */
    
    public Tile() {
        numBombs = 0;
        gridx = 0;
        gridy = 0;
        flag = false;
        uncovered = false;
    }
    
    public Tile(int gridy, int gridx) {
        this.gridx = gridx;
        this.gridy = gridy;
        this.numBombs = 0;
        this.flag = false;
        this.uncovered = false;
    }

    public int getGridx() {
        return gridx;
    }

    public int getGridy() {
        return gridy;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }


    public int getNumBombs() {
        return numBombs;
    }

    public void setNumBombs(int numBombs) {
        this.numBombs = numBombs;
    }

    boolean isUncovered() {
        return uncovered;
    }

    void setUncovered(boolean b) {
        uncovered = b;
    }
    
}
