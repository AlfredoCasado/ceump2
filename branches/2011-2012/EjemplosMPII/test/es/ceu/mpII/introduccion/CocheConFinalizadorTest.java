package es.ceu.mpII.introduccion;

import org.junit.Test;
import static org.junit.Assert.*;

public class CocheConFinalizadorTest {

    @Test
    public void verificarQueSeInvocaAlfinalizador() throws InterruptedException {
        ClaseConFinalizador cocheConFinalizador = new ClaseConFinalizador();
        assertEquals(1, ClaseConFinalizador.numeroDeInstanciasEnMemoriaDeLaClase());
        
        // hacemos null la referencia al objeto, de este modo el objeto ya no esta siendo
        // referenciado por nadie y el garbage collector lo eliminara
        cocheConFinalizador = null;
        
        // la linea siguiente le dice al GC que intente liberar memoria, sin embargo no esta asegurado
        // que lo haga, simplemente la maquina virtual intentará realizar "su mejor esfuerzo" para eliminar
        // los objetos de memoria, pero no es predecible el resultado por lo que este test puede fallar en 
        // ocasiones
        System.gc();

        // al detener el hilo de ejecución el gc entra en juego y borra el objeto. Como curiosidad
        // comentar la linea siguiente, al no parar este hilo el gc no entra en ejecución y por tanto
        // no borra el objeto, como consecuencia el test no pasa.
        Thread.sleep(1);
        assertEquals(0, ClaseConFinalizador.numeroDeInstanciasEnMemoriaDeLaClase());
    }
    

}