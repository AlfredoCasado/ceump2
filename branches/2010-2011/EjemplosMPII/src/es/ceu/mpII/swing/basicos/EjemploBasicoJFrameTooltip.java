package es.ceu.mpII.swing.basicos;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class EjemploBasicoJFrameTooltip extends JFrame {

    private Toolkit toolkit;

    public EjemploBasicoJFrameTooltip() {

        setTitle("Tooltip");
        setSize(300, 200);

        toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation((size.width - getWidth())/2, (size.height - getHeight())/2);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        getContentPane().add(panel);

        panel.setLayout(null);
        panel.setToolTipText("A Panel container");

        JButton button = new JButton("Button");
        button.setBounds(100, 60, 80, 30);
        button.setToolTipText("A button component");

        panel.add(button);

    }

    public static void main(String[] args) {

        EjemploBasicoJFrameTooltip tooltip = new EjemploBasicoJFrameTooltip();
        tooltip.setVisible(true);

    }
}
