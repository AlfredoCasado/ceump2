package es.ceu.mpII.introduccion;

import org.junit.Test;
import static org.junit.Assert.*;

public class CocheConFinalizadorTest {

    @Test
    public void verificarQueSeInvocaAlfinalizador() {
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

        // al realizar una operación de I/O es mas probable que el GC encuentre un hueco para ejecutarse
        // como curiosidad comentar la linea siguiente y ver como el test falla por que le GC no se activa
        // antes de la linea de comprobación.
        System.out.println("el GC ya ha sido invocado");
        assertEquals(0, ClaseConFinalizador.numeroDeInstanciasEnMemoriaDeLaClase());
    }
    

}