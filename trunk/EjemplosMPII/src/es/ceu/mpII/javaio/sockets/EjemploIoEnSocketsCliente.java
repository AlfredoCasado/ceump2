package es.ceu.mpII.javaio.sockets;

import java.io.IOException;

public class EjemploIoEnSocketsCliente {
    public static final int PUERTO = 9999;

    public static void main(String[] args) throws IOException {
    
        ClienteCalculos cliente = new ClienteCalculos("localhost", PUERTO);
        int resultadoSuma = cliente.enviarPeticionCalculoSuma(2,9);

        System.out.println(resultadoSuma);
       
    }

}
