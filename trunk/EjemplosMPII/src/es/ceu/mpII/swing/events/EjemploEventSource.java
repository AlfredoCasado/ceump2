package es.ceu.mpII.swing.events;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;


public class EjemploEventSource extends JFrame {

    JLabel statusbar;

    public EjemploEventSource() {

        setTitle("Multiple Sources");
        JPanel panel = new JPanel();
        statusbar = new JLabel(" ZetCode");

        panel.setLayout(null);

        JButton close = new JButton("Close");
        close.setBounds(40, 30, 80, 25);
        close.addActionListener(new ButtonListener());

        JButton open = new JButton("Open");
        open.setBounds(40, 80, 80, 25);
        open.addActionListener(new ButtonListener());

        JButton find = new JButton("Find");
        find.setBounds(40, 130, 80, 25);
        find.addActionListener(new ButtonListener());

        JButton save = new JButton("Save");
        save.setBounds(40, 180, 80, 25);
        save.addActionListener(new ButtonListener());

        JButton changeLook = new JButton("cambiar look");
        changeLook.setBounds(40, 230, 80, 25);

        final JFrame that = this;
        changeLook.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                try {
                    UIManager.setLookAndFeel("javax.swing.plaf.metal");
                    SwingUtilities.updateComponentTreeUI(that);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(EjemploEventSource.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InstantiationException ex) {
                    Logger.getLogger(EjemploEventSource.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                    Logger.getLogger(EjemploEventSource.class.getName()).log(Level.SEVERE, null, ex);
                } catch (UnsupportedLookAndFeelException ex) {
                    Logger.getLogger(EjemploEventSource.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });

        panel.add(close);
        panel.add(open);
        panel.add(find);
        panel.add(save);
        panel.add(changeLook);

        add(panel);
        add(statusbar, BorderLayout.SOUTH);

        setSize(400, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    class ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            JButton o = (JButton) e.getSource();
            String label = o.getText();
            o.setVisible(false);
            statusbar.setText(" " + label + " button clicked");
        }
      }


    public static void main(String[] args) {
        new EjemploEventSource();
    }
}
