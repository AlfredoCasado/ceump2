package es.ceu.mpII.javaio.sockets;

import java.io.IOException;

public class EjemploIoEnSocketsCliente {
    public static final int PUERTO = 9999;

    public static void main(String[] args) throws IOException {
    
        ClienteCalculos cliente = new ClienteCalculos("localhost", PUERTO);
        int resultadoSuma = cliente.enviarPeticionCalculoSuma(2,9);
        int resultadoResta = cliente.enviarPeticionCalculoResta(7, 2);

        System.out.println("resultado suma: " + resultadoSuma);
        System.out.println("resultado resta: " + resultadoResta);
       
    }

}
