/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package game2048;

/**
 *
 * @author mayur
 */

import game2048.model.Game2048Model;
import game2048.view.Game2048Frame;
import javax.swing.SwingUtilities;
 

public class Game2048 implements Runnable {
 
    @Override
    public void run() {
        new Game2048Frame(new Game2048Model());
    }
     
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Game2048());
    }
 
}
