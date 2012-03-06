package es.ceu.mpII.javaio.sockets;

import java.io.IOException;

public class EjemploIoEnSocketsServidor {
    public static final int PUERTO = 9999;

    public static void main(String[] args) throws IOException {
        ServidorCalculos servidor = new ServidorCalculos(PUERTO);
        servidor.start();
    }

}
