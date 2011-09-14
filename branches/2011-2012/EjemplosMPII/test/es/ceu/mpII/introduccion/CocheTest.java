package es.ceu.mpII.introduccion;

import org.junit.Test;
import static org.junit.Assert.*;

public class CocheTest {
    public static final String ROJO = "rojo";
    public static final String VERDE = "verde";

    @Test
    public void comoInstanciarUnObjetoDeTipoCoche() {
        // instancio un objeto de la clase coche
        Coche miCoche = new Coche(100,ROJO);

        // compruebo que no es null, es decir, que se a instanciado correctamente
        assertNotNull(miCoche);
    }

    @Test
    public void instanciarVariosCoches() {
        // con este test compruebo que cada instancia de coche tiene su
        // propia velocidad
        Coche cocheQueVaA100 = new Coche(100,ROJO);
        Coche cocheQueVaA200 = new Coche(200,ROJO);

        assertEquals(100, cocheQueVaA100.velocidadActual());
        assertEquals(200, cocheQueVaA200.velocidadActual());
    }

    @Test
    public void bloquesDeInicializacion() {
        // el bloque de inicialización de la clase coche pone la velocidad
        // inicial a 10 km/h
        Coche coche = new Coche();
        assertEquals(10, coche.velocidadActual());
    }

    @Test
    public void accederAUnaPropiedadPublica() {
        Coche miCoche = new Coche(100,ROJO);
        
        // puedo leer la propiedad color porque es publica
        assertEquals(ROJO,miCoche.color);

        // también puedo modificar el valor de color desde fuera de la clase
        miCoche.color = VERDE;
        assertEquals(VERDE,miCoche.color);
        
        // NOTA: en general no es buena idea acceder directamente apropiedades publicas de una clase ya
        // que rompe la encapsulación, este test es simplemente para demostrar que el lenguaje lo permite.
    }

    @Test
    public void invocarUnMetodoDelObjetoInstanciado() {
        Coche miCoche = new Coche(100,ROJO);
        
        // invoco a un método publico que me devuelve la velocidad del coche
        assertEquals(100, miCoche.velocidadActual());

        // aceleró y luego compruebo que la velocidad actual es mayor
        miCoche.acelerar(10);
        assertEquals(110, miCoche.velocidadActual());
    }

    @Test
    public void propiedadesEstaticas() {
        Coche cocheQueVaA100 = new Coche(100,ROJO);
        Coche cocheQueVaA200 = new Coche(200,ROJO);

        // a una propiedad estatica se puede acceder con "nombreCalse.nombrePropiedad" o bien
        // a partir de cualquier instancia de la clase con "variableDeTipoCoche.nombrePropiedad"
        // el valor es el mismo en todos los casos que se trata de una proiedad estatica que se almacena
        // a nivel de clase en lugar de a nivel de instancia
        System.out.println("he creado: " + Coche.numeroDeCochesEnCirculacion + " coches durante el test");
        assertEquals(Coche.numeroDeCochesEnCirculacion, cocheQueVaA100.numeroDeCochesEnCirculacion);
        assertEquals(Coche.numeroDeCochesEnCirculacion, cocheQueVaA200.numeroDeCochesEnCirculacion);

    }

    @Test
    public void propiedadesEstaticasAccediendoATravesDeUnMetodo() {
        Coche cocheQueVaA100 = new Coche(100,ROJO);
        Coche cocheQueVaA200 = new Coche(200,ROJO);

        // es igual que el ejemplo anterior pero ahora acceso a través de un método estatico, esta es la
        // forma recomendada para respetar la encapsulación
        System.out.println("he creado: " + Coche.numeroDeCochesEnCirculacion() + " coches durante el test");
        assertEquals(Coche.numeroDeCochesEnCirculacion(), cocheQueVaA100.numeroDeCochesEnCirculacion());
        assertEquals(Coche.numeroDeCochesEnCirculacion(), cocheQueVaA200.numeroDeCochesEnCirculacion());

    }

}