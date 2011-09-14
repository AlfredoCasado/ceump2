package es.ceu.mpII.kata.bowling;

import org.junit.Test;
import static org.junit.Assert.*;

public class MarcadorBolosTest {

    MarcadorBolos marcador = new MarcadorBolos();

    @Test
    public void la_puntuacion_es_cero_si_todos_son_fallos() {
        assertEquals(0, marcador.puntuacionFinal("--------------------"));
    }

    @Test
    public void si_no_hay_plenos_ni_semiplenos_el_total_es_la_suma() {
        assertEquals(20, marcador.puntuacionFinal("11111111111111111111"));
        assertEquals(40, marcador.puntuacionFinal("22222222222222222222"));
        assertEquals(100, marcador.puntuacionFinal("55555555555555555555"));
        assertEquals(70, marcador.puntuacionFinal("22222222225555555555"));
        assertEquals(90, marcador.puntuacionFinal("9-9-9-9-9-9-9-9-9-9-"));
    }

    @Test
    public void si_hago_un_semipleno_en_esa_tirada_han_caido_diez_menos_la_anterior() {
        assertEquals(10, marcador.puntuacionFinal("1/------------------"));
    }

    @Test
    public void si_hago_un_semipleno_sumo_los_puntos_de_la_siguiente_tirada() {
        assertEquals(12, marcador.puntuacionFinal("1/1-----------------"));
        assertEquals(20, marcador.puntuacionFinal("1/5-----------------"));
    }

    @Test
    public void si_hago_un_pleno_son_diez_puntos() {
        assertEquals(10, marcador.puntuacionFinal("X------------------"));
        assertEquals(150, marcador.puntuacionFinal("5/5/5/5/5/5/5/5/5/5/5"));
    }
    
    @Test
    public void si_hago_un_pleno_se_suman_los_bolos_tirados_en_las_dos_siguientes_tiradas() {
        assertEquals(14, marcador.puntuacionFinal("X11----------------"));
        assertEquals(33, marcador.puntuacionFinal("XX1---------------"));
        assertEquals(240, marcador.puntuacionFinal("XXXXXXXXX--"));
    }

    @Test
    public void no_tiro_ningun_bolo_hasta_el_frame_extra() {
        assertEquals(10, marcador.puntuacionFinal("------------------X--"));
        assertEquals(300, marcador.puntuacionFinal("XXXXXXXXXXXX"));
    }


}
