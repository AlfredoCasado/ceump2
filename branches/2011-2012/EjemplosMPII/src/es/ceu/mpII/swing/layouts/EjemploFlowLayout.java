package es.ceu.mpII.swing.layouts;

import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTree;


public class EjemploFlowLayout extends JFrame {


    public EjemploFlowLayout() {

        setTitle("FlowLayout Example");

        JPanel panel = new JPanel();

        JTextArea area = new JTextArea("text area");
        area.setPreferredSize(new Dimension(100, 100));
        JTree tree = new JTree();
        JButton button = new JButton("button");

        panel.add(button);
        panel.add(tree);
        panel.add(area);
        panel.add(new JButton("otro mas"));

        add(panel);

        pack();

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new EjemploFlowLayout();
    }
}
