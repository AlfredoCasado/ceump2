package es.ceu.mpII.swing.events;

import java.awt.Font;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class EjemploMovimientoVentanaConAdapters extends JFrame implements ComponentListener {

    private JLabel labelx;
    private JLabel labely;

    public EjemploMovimientoVentanaConAdapters() {

        setTitle("Moving window");

        JPanel panel = new JPanel();
        panel.setLayout(null);

        labelx = new JLabel("x: ");
        labelx.setFont(new Font("Serif", Font.BOLD, 14));
        labelx.setBounds(20, 20, 60, 25);

        labely = new JLabel("y: ");
        labely.setFont(new Font("Serif", Font.BOLD, 14));
        labely.setBounds(20, 45, 60, 25);

        panel.add(labelx);
        panel.add(labely);

        add(panel);

        addComponentListener(this);

        setSize(310, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void componentResized(ComponentEvent e) {
    }

    public void componentMoved(ComponentEvent e) {
        int x = e.getComponent().getX();
        int y = e.getComponent().getY();
        labelx.setText("x: " + x);
        labely.setText("y: " + y);
    }

    public void componentShown(ComponentEvent e) {
    }

    public void componentHidden(ComponentEvent e) {
    }


    public static void main(String[] args) {
        new EjemploMovimientoVentana();
    }
}