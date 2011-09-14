package es.ceu.mpII.javaio.copiaBinarios;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class CopiadorFicheros {

    void copiaByteAByte(String nombreFicheroACopiar) throws IOException {
        FileInputStream in = null;
        FileOutputStream out = null;
        try {
            in = new FileInputStream(nombreFicheroACopiar);
            out = new FileOutputStream(nombreFicheroACopiar + "_copia");
            copiaDeInputStreamAUnOutputStreamByteAByte(in,out);

        } finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }
    }

    void copiaEnBloquesDeBytes(String ficheroACopiar) throws IOException {
        FileInputStream in = null;
        FileOutputStream out = null;
        try {
            byte[] bytes = new byte[1024];

            in = new FileInputStream(ficheroACopiar);
            out = new FileOutputStream(ficheroACopiar + "_copia");
            int bytesLeidos = 0;
            while((bytesLeidos = in.read(bytes)) != -1) {
                out.write(bytes, 0, bytesLeidos);
            }
         } finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }
    }

    void copiaUsandoBuffers(String ficheroACopiar) throws IOException {
        InputStream in = null;
        OutputStream out = null;
        try {
            in = new BufferedInputStream(new FileInputStream(ficheroACopiar), 2048);
            out = new BufferedOutputStream(new FileOutputStream(ficheroACopiar + "copia"));
            
            copiaDeInputStreamAUnOutputStreamByteAByte(in, out);

        } finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }
    }

    private void copiaDeInputStreamAUnOutputStreamByteAByte(InputStream in, OutputStream out) throws IOException {
        int c;

        while ((c = in.read()) != -1) {
            out.write(c);
        }
    }
    
    

}
