package es.ceu.mpII.javaio.sockets;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class ClienteCalculos {
    private final String host;
    private final int puerto;

    public ClienteCalculos(final String host,final int puerto) {
        this.host = host;
        this.puerto = puerto;
        
    }

    public int enviarPeticionCalculoSuma(final int primerOperando,final int segundoOperando) throws IOException {
        System.out.println("conectando con el servidor....");
        final Socket conexion = new Socket(host,puerto);

        System.out.println("conectado con exito!, enviando petición de calculo...");
        final DataOutputStream dos = new DataOutputStream(conexion.getOutputStream());
        final DataInputStream dis = new DataInputStream(conexion.getInputStream());
        dos.writeInt(primerOperando);
        dos.writeInt(segundoOperando);

        System.out.println("peticion de calculo enviada, esperando respuesta...");
        final int resultado = dis.readInt();
        System.out.println("respuesta recibida");

        dis.close();
        dos.close();

        return resultado;
    }

}
