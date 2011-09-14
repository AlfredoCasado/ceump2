package es.ceu.mpII.swing.basicos;

import javax.swing.JFrame;


public class EjemploBasicoJFrame {

     public static void main(String[] args) {
        JFrame simple = new JFrame();
        simple.setSize(300, 200);
        simple.setTitle("Simple");
        simple.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        simple.setVisible(true);
    }
}
