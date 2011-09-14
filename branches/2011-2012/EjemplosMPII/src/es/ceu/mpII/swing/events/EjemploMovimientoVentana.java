package es.ceu.mpII.swing.events;

import java.awt.Font;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class EjemploMovimientoVentana extends JFrame {

    private JLabel labelx;
    private JLabel labely;

    public EjemploMovimientoVentana() {

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

        addComponentListener(new ComponentAdapter() {
           @Override
          public void componentMoved(ComponentEvent e) {
                int x = e.getComponent().getX();
                int y = e.getComponent().getY();
                labelx.setText("x: " + x);
                labely.setText("y: " + y);
            }
        });

        setSize(310, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    
    public static void main(String[] args) {
        new EjemploMovimientoVentana();
    }
}