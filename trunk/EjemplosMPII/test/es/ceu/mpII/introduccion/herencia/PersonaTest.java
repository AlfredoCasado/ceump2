package es.ceu.mpII.introduccion.herencia;

import org.junit.Test;


public class PersonaTest {


    @Test
    public void pruebaHerencia() {

        Persona persona = new Persona("alfredo");
        persona.saludar();

        Soldado soldado = new Soldado("fulano", "general");
        soldado.saludar();

    }

    @Test
    public void testPolimorfismo() {
        Persona persona = crearPersona();
        persona.saludar();
    }

    @Test
    public void testCasting() {
        Persona persona = crearPersona();
        
        if (persona instanceof Soldado) {
            Soldado soldado = (Soldado) persona;
            System.out.println("realizado el casting");
            soldado.ponerseFirme();
        }
    }

    private Persona crearPersona() {
        Persona persona = new Soldado("fulano", "general");
        return persona;
    }
}