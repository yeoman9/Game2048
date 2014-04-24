/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package game2048.controller;

/**
 *
 * @author mayur
 */
import game2048.view.Game2048Frame;
import game2048.model.Game2048Model;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
 
 
public class StartGameActionListener implements ActionListener {
     
    private Game2048Frame frame;
     
    private Game2048Model model;
     
    public StartGameActionListener(Game2048Frame frame, 
            Game2048Model model) {
        this.frame = frame;
        this.model = model;
    }
 
    @Override
    public void actionPerformed(ActionEvent event) {
        model.setHighScores();
        model.initializeGrid();
        model.setArrowActive(true);
        model.addNewCell();
        model.addNewCell();
         
        frame.repaintGridPanel();
        frame.updateScorePanel();
    }
 
}
