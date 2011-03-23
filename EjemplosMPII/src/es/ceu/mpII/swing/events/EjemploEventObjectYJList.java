package es.ceu.mpII.swing.events;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.text.DateFormat;

import java.util.Date;
import java.util.Locale;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;


public class EjemploEventObjectYJList extends JFrame {

    private static Component CENTER_OF_THE_SCREEN = null;

    private JList list;
    private DefaultListModel model;


    public EjemploEventObjectYJList() {

        setTitle("Event Object");

        JPanel panel = new JPanel();
        panel.setLayout(null);

        model = new DefaultListModel();
        list = new JList(model);
        list.setBounds(150, 30, 220, 150);

        JButton ok = new JButton("Ok");
        ok.setBounds(30, 35, 80, 25);

        // utilizamos una clase anonima para escuchar el evento
        ok.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {

                Locale locale = Locale.getDefault();
                Date date = new Date();
                String s = DateFormat.getTimeInstance(DateFormat.SHORT,locale).format(date);

                if ( !model.isEmpty() )
                    model.clear();

                if (event.getID() == ActionEvent.ACTION_PERFORMED)
                    model.addElement(" Event Id: ACTION_PERFORMED");

                model.addElement(" Time: " + s);

                String source = event.getSource().getClass().getName();
                model.addElement(" Source: " + source);

                int mod = event.getModifiers();

                StringBuffer buffer = new StringBuffer(" Modifiers: ");

                if ((mod & ActionEvent.ALT_MASK) > 0)
                    buffer.append("Alt ");

                if ((mod & ActionEvent.SHIFT_MASK) > 0)
                    buffer.append("Shift ");
               
                if ((mod & ActionEvent.CTRL_MASK) > 0)
                    buffer.append("Ctrl ");

                model.addElement(buffer);
            }
        });

        panel.add(ok);
        panel.add(list);
        add(panel);

        setSize(420, 250);
        setLocationRelativeTo(CENTER_OF_THE_SCREEN);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new EjemploEventObjectYJList();
    }
}
