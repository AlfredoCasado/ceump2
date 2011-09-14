package es.ceu.mpII.swing.layouts;

import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class EjemploGridLayout extends JFrame {

    public EjemploGridLayout() {

        setTitle("GridLayout");

        JPanel panel = new JPanel();

        panel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        panel.setLayout(new GridLayout(5, 5, 10, 10));

        String[] buttons = {
            "Cls", "Bck", "", "Close", "7", "8", "9", "/", "4",
            "5","6", "*", "1", "2", "3", "-", "0", ".", "=", "+"
        };

        for (int i = 0; i < buttons.length; i++) {
            panel.add(new JButton(buttons[i]));
        }

        add(panel);

        setSize(350, 300);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);

    }

    public static void main(String[] args) {
        new EjemploGridLayout();
    }
}
