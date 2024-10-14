/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MERCSystem;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author HAACHAMA
 */
class cQuit {
    private JFrame frame;
    public void quit(){
        frame = new JFrame("Exit");
        if (JOptionPane.showConfirmDialog(frame, "Confirm Exit", "Merc Airlines Ticketing System",
                JOptionPane.YES_NO_OPTION)== JOptionPane.YES_NO_OPTION){
            System.exit(0);
        }
    }
}
