package es.ceu.mpII.javaio.copiaBinarios;

import java.io.IOException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class CopiadorFicherosTest {

    @Test
    public void deberiaPoderCopiarUnFicheroByteAByte() throws IOException {
        
        CopiadorFicheros copiadorFicheros = new CopiadorFicheros();
        copiadorFicheros.copiaByteAByte("./ficheros/españa-campeona-del-mundo.png");
        
        
    }     
    
    @Test
    public void deberiaPoderCopiarUnFicheroEnBloquesDeBytes() throws IOException {
        
        CopiadorFicheros copiadorFicheros = new CopiadorFicheros();
        copiadorFicheros.copiaEnBloquesDeBytes("./ficheros/españa-campeona-del-mundo.png");
        
        
    }      
    
    @Test
    public void deberiaPoderCopiarUnFicheroUsandoBuffers() throws IOException {
        
        CopiadorFicheros copiadorFicheros = new CopiadorFicheros();
        copiadorFicheros.copiaUsandoBuffers("./ficheros/españa-campeona-del-mundo.png");
        
        
    }   

}