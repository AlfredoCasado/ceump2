package es.ceu.mpII.swing.menus;

import java.awt.Toolkit;

import javax.swing.*;
import java.awt.event.*;

public class MenuPopUp {

    private JPopupMenu menu;
    private Toolkit toolkit;

  public MenuPopUp(){


    JFrame frame = new JFrame("JPopupMenu");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    toolkit = frame.getToolkit();

    menu = new JPopupMenu();
    JMenuItem menuItemBeep = new JMenuItem("Beep");

    menuItemBeep.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            toolkit.beep();
        }
    });

    menu.add(menuItemBeep);

    JMenuItem menuItemClose = new JMenuItem("Close");
    menuItemClose.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }

    });

    menu.add(menuItemClose);

    frame.addMouseListener(new MouseAdapter() {
        public void mouseReleased(MouseEvent e) {
            if (e.getButton() == e.BUTTON3) {
                menu.show(e.getComponent(), e.getX(), e.getY());
            }
        }
    });

    frame.setSize(250, 200);
    frame.setLocationRelativeTo(null);
    frame.setVisible(true);
  }



  public static void main(String[] args) {
        new MenuPopUp();
  }
}
