package es.ceu.mpII.javaio.sockets;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServidorCalculos  {
    private ServerSocket serverSocket;
    private final int puerto;

    public ServidorCalculos(final int puerto) {
        this.puerto = puerto;
    }

    public void start() throws IOException {
        System.out.println("Arrancamos el servidor escuchando peticiones en el puerto: " + puerto);
        serverSocket = new ServerSocket(puerto);
        while(true) {
            try {
                Socket conexion = serverSocket.accept();
                System.out.println("conexion recibida de cliente: " + conexion.getInetAddress());
                ConexionConCliente conexionCliente = new ConexionConCliente(conexion);
                new Thread(conexionCliente).start();
            } catch (IOException ex) {
                System.out.println("Error de io aceptando conexiones");
                ex.printStackTrace();
            }
        }
    }
 
}

class ConexionConCliente implements Runnable {
    private final Socket conexion;

    public ConexionConCliente(Socket conexion) throws IOException {
        this.conexion = conexion;
     }

    public void run() {
        try {
            final DataInputStream dis = new DataInputStream(conexion.getInputStream());
            final DataOutputStream dos = new DataOutputStream(conexion.getOutputStream());

            // leo los dos operandos para realizar la operación de suma requerida por el cliente
            System.out.println("esperando envio de petición de calculo...");
            final int primerOperando = dis.readInt();
            final int segundoOperando = dis.readInt();

            // le devuelvo al cliente el resultado de la suma
            System.out.println("petición de calculo recibida, realizando calculos y devolviendo respuesta");
            dos.writeInt(primerOperando+segundoOperando);
            System.out.println("respuesta enviada, cerrando conexión con cliente");

            // cierro los streams y la conexión
            dis.close();
            dos.close();
            conexion.close();
        } catch (IOException ex) {
            System.out.println("error en la comunicación con el cliente: " + conexion.getInetAddress());
            ex.printStackTrace();
        }
    }

}
