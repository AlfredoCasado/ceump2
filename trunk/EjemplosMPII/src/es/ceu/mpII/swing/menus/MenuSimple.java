package es.ceu.mpII.swing.menus;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;


public class MenuSimple extends JFrame {

    public MenuSimple() {

        setTitle("Menu simple");

        JMenuBar menubar = new JMenuBar();
        java.net.URL imgURL = getClass().getResource("/iconos/exit.png");
        ImageIcon icon = new ImageIcon(imgURL);

        JMenu file = new JMenu("File");
        file.setMnemonic(KeyEvent.VK_F);

        JMenuItem fileClose = new JMenuItem("Close", icon);
        fileClose.setMnemonic(KeyEvent.VK_C);
        fileClose.setToolTipText("Exit application");
        fileClose.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                System.exit(0);
            }

        });

        file.add(fileClose);
        menubar.add(file);
        setJMenuBar(menubar);

        setSize(250, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new MenuSimple();
    }
}