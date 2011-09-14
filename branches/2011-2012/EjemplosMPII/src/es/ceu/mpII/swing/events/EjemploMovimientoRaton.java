package es.ceu.mpII.swing.events;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class EjemploMovimientoRaton extends JFrame {

  
    private JButton add;
 
    public EjemploMovimientoRaton() {

        setTitle("Remove listener");
        JPanel panel = new JPanel();

        panel.setLayout(null);

        add = new JButton("+");
        add.setBounds(40, 30, 80, 25);
        add.addMouseListener(new MouseListener() {

            public void mouseClicked(MouseEvent e) {}

            public void mousePressed(MouseEvent e) {}

            public void mouseReleased(MouseEvent e) {}

            public void mouseEntered(MouseEvent e) {
                int xPosition = e.getXOnScreen();
                int yPosition = e.getYOnScreen();
                add.setBounds(xPosition + 80, yPosition + 25, 80, 25);
            }

            public void mouseExited(MouseEvent e) {}
        });

        panel.add(add);
       
        add(panel);

        setSize(310, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    
    public static void main(String[] args) {
        new EjemploMovimientoRaton();
    }
}
