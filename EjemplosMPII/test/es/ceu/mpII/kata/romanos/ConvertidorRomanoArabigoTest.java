package es.ceu.mpII.kata.romanos;

import org.junit.Test;
import static org.junit.Assert.*;

public class ConvertidorRomanoArabigoTest {

    ConvertidorRomanoArabigo convertidor = new ConvertidorRomanoArabigo();
    
    @Test public void 
    puede_convertir_los_simbolos_directos_simples() {
        assertEquals(1, convertidor.convertir("I"));
        assertEquals(5, convertidor.convertir("V"));
        assertEquals(10, convertidor.convertir("X"));
        assertEquals(50, convertidor.convertir("L"));
        assertEquals(100, convertidor.convertir("C"));
        assertEquals(500, convertidor.convertir("D"));
        assertEquals(1000, convertidor.convertir("M"));
    }
    
    @Test public void
    puede_convertir_los_casos_especiales_de_dos_simbolos_donde_el_primero_resta_al_segundo() {
        assertEquals(4, convertidor.convertir("IV"));
        assertEquals(9, convertidor.convertir("IX"));
        assertEquals(40, convertidor.convertir("XL"));
        assertEquals(90, convertidor.convertir("XC"));
        assertEquals(400, convertidor.convertir("CD"));
        assertEquals(900, convertidor.convertir("CM"));
    }        
    
    @Test public void
    puede_convertir_numeros_formados_por_varios_caracteres_romanos() {
        assertEquals(3, convertidor.convertir("III"));
        assertEquals(14, convertidor.convertir("XIV"));
        assertEquals(19, convertidor.convertir("XIX"));
        assertEquals(49, convertidor.convertir("XLIX"));
        assertEquals(1999, convertidor.convertir("MCMXCIX"));
        
    }        
    
    
}
