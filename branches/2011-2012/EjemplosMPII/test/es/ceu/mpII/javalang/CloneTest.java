package es.ceu.mpII.javalang;


import org.junit.Test;
import static org.junit.Assert.*;


public class CloneTest {

   @Test
   public void copiarReferencia() {
       Alumno a = new Alumno("juan");
       Alumno b = a;

       assertTrue(b == a);

       System.out.println(a);
       System.out.println(b);
   }

   @Test
   public void clonarAlumno() throws CloneNotSupportedException {
       Alumno a = new Alumno("juan");
       Alumno b = (Alumno) a.clone();

       assertFalse(b == a);

       System.out.println(a);
       System.out.println(b);
   }

   @Test
   public void clonadoEnProfundidad() throws CloneNotSupportedException {
       Moto a = new Moto();
       Moto b = (Moto) a.clone();

       assertTrue(a.ruedaDelantera != b.ruedaDelantera);
       assertTrue(a.ruedaTrasera != b.ruedaTrasera);

       System.out.println(a);
       System.out.println(b);

   }
}