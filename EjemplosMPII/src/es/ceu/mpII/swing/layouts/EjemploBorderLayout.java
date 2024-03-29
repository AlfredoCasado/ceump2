package es.ceu.mpII.swing.layouts;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Insets;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Insets;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JTextArea;
import javax.swing.JToolBar;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;


public class EjemploBorderLayout extends JFrame {


    public EjemploBorderLayout() {

        setTitle("BorderLayout");

        JMenuBar menubar = new JMenuBar();
        JMenu file = new JMenu("File");

        menubar.add(file);
        setJMenuBar(menubar);

        JToolBar toolbar = new JToolBar();
        toolbar.setFloatable(false);

        ImageIcon exit = new ImageIcon(getClass().getResource("/iconos/exit.png"));
        JButton bexit = new JButton(exit);
        toolbar.add(bexit);

        add(toolbar, BorderLayout.NORTH);

        JToolBar vertical = new JToolBar(JToolBar.VERTICAL);
        vertical.setFloatable(false);
        vertical.setMargin(new Insets(10, 5, 5, 5));

        ImageIcon select = new ImageIcon(getClass().getResource("/iconos/new.gif"));
        ImageIcon freehand = new ImageIcon(getClass().getResource("/iconos/open.png"));
        ImageIcon shapeed = new ImageIcon(getClass().getResource("/iconos/save.png"));

        JButton selectb = new JButton(select);
        selectb.setBorder(new EmptyBorder(3, 0, 3, 0));

        JButton freehandb = new JButton(freehand);
        freehandb.setBorder(new EmptyBorder(3, 0, 3, 0));
        JButton shapeedb = new JButton(shapeed);
        shapeedb.setBorder(new EmptyBorder(3, 0, 3, 0));

        vertical.add(selectb);
        vertical.add(freehandb);
        vertical.add(shapeedb);

      
        vertical.setPreferredSize(new Dimension(100, 100));

        add(vertical, BorderLayout.WEST);
        add(new JTextArea(), BorderLayout.CENTER);

        JLabel statusbar = new JLabel(" Statusbar");
        statusbar.setPreferredSize(new Dimension(1, 22));
        statusbar.setBorder(LineBorder.createGrayLineBorder());
        
        add(statusbar, BorderLayout.SOUTH);

        setSize(350, 300);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new EjemploBorderLayout();
    }
}