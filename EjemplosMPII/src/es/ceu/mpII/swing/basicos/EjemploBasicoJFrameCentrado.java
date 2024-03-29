package es.ceu.mpII.swing.basicos;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class EjemploBasicoJFrameCentrado extends JFrame {

    public EjemploBasicoJFrameCentrado() {

        setSize(300, 200);
        setTitle("CenterOnScreen");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width/2 - getWidth()/2,size.height/2 - getHeight()/2);
    }

    public static void main(String[] args) {

        EjemploBasicoJFrameCentrado cos = new EjemploBasicoJFrameCentrado();
        cos.setVisible(true);

    }
}
