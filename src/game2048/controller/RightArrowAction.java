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
 
import javax.swing.AbstractAction;
 
 
public class RightArrowAction extends AbstractAction {
 
    private static final long serialVersionUID = 2982995823948983992L;
 
    private Game2048Frame frame;
     
    private Game2048Model model;
 
    public RightArrowAction(Game2048Frame frame, Game2048Model model) {
        this.frame = frame;
        this.model = model;
    }
 
    @Override
    public void actionPerformed(ActionEvent e) {
        if (model.isArrowActive()) {
            if (model.moveCellsRight()) {
                if (model.isGameOver()) {
                    model.setArrowActive(false);
                } else {
                    model.addNewCell();
                     
                    frame.repaintGridPanel();
                    frame.updateScorePanel();
                }
            }
        }
    }
 
}