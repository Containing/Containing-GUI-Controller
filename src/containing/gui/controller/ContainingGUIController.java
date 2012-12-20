/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package containing.gui.controller;

import javax.swing.SwingUtilities;

/**
 *
 * @author Christiaan
 */
public class ContainingGUIController {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                MainFrame frame = new MainFrame();
                frame.setTitle("Containing Controller");
                frame.setVisible(true);
            }
        });
    }
}
