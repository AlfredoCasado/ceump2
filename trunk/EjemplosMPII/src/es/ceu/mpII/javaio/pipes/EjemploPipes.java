

package es.ceu.mpII.javaio.pipes;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class EjemploPipes {

    public static void main(String[] args) throws IOException {
        PipedOutputStream canalPorElQueEnviaElServidor = new PipedOutputStream();
        PipedInputStream canalPorElQueRecibeElCliente = new PipedInputStream(canalPorElQueEnviaElServidor);
        
        new Thread(new Cliente(canalPorElQueRecibeElCliente)).start();
        new Thread(new Servidor(canalPorElQueEnviaElServidor)).start();
    }

}

class Cliente implements Runnable {
    private final PipedInputStream canalPorElQueRecibeElCliente;

    Cliente(PipedInputStream canalPorElQueRecibeElCliente) {
        this.canalPorElQueRecibeElCliente = canalPorElQueRecibeElCliente;
    }

    public void run() {
        try {
            int numeroLeido = canalPorElQueRecibeElCliente.read();
            System.out.println("soy el cliente he recibido:" + numeroLeido);
        } catch (IOException ex) {}
    }

}

class Servidor implements Runnable {
    private final PipedOutputStream canalPorElQueEnviaElServidor;

    Servidor(PipedOutputStream canalPorElQueEnviaElServidor) {
        this.canalPorElQueEnviaElServidor = canalPorElQueEnviaElServidor;
    }

    public void run() {
        try {
            canalPorElQueEnviaElServidor.write(5);
        } catch (IOException ex) {}
    }


}