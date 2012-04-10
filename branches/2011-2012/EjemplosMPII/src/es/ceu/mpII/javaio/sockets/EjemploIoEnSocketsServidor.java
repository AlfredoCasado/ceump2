package es.ceu.mpII.javaio.sockets;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class EjemploIoEnSocketsServidor {
    public static final int PUERTO = 9999;

    public static void main(String[] args) throws IOException {
        Set<Operacion> operacionesDisponibles = new HashSet();
        operacionesDisponibles.add(new Suma());
        operacionesDisponibles.add(new Resta());
        
        ServidorCalculos servidor = new ServidorCalculos(PUERTO, operacionesDisponibles);
        servidor.start();
    }

    
    
}
