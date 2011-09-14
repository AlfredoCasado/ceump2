package es.ceu.mpII.swing.events;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.util.Calendar;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;
import javax.swing.border.EtchedBorder;


public class EjemplosMultiplesListeners extends JFrame {

    private JLabel statusbar;
    private JSpinner spinner;
    private static int count = 0;

    public EjemplosMultiplesListeners() {

        setTitle("Multiple Listeners");
        JPanel panel = new JPanel();
        statusbar = new JLabel("0");

        panel.setLayout(null);

        JButton add = new JButton("+");
        add.setBounds(40, 30, 80, 25);
        add.addActionListener(new ActualizarSpinner());
        add.addActionListener(new ActualizarBarraDeEstado());

        Calendar calendar = Calendar.getInstance();
        int currentYear = calendar.get(Calendar.YEAR);

        SpinnerModel yearModel = new SpinnerNumberModel(currentYear,
                                       currentYear - 100,
                                       currentYear + 100,
                                       10);

        spinner = new JSpinner(yearModel);
        spinner.setEditor(new JSpinner.NumberEditor(spinner, "#"));

        spinner.setBounds(190, 30, 80, 25);

        panel.add(add);
        panel.add(spinner);

        add(panel);
        add(statusbar, BorderLayout.SOUTH);

        setSize(300, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    class ActualizarSpinner implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            Integer val = (Integer) spinner.getValue();
            spinner.setValue(++val);
        }
      }

    class ActualizarBarraDeEstado implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            statusbar.setText(Integer.toString(++count));
        }
      }

    public static void main(String[] args) {
        new EjemplosMultiplesListeners();
    }
}
