
package es.ceu.mpII.kata.lineascodigo;

import org.junit.After;
import org.junit.Before;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import org.junit.Test;
import static org.junit.Assert.*;


public class ContadorLineasDeCodigoJavaTest {

    ContadorDeLineasJava contador = new ContadorDeLineasJava();
    FileWriter ficheroDeTest;
    File pathFicheroDeTest = new File("FicheroDeTest.java");

    @Before
    public void crearElFicheroDeTest() throws IOException {
        ficheroDeTest = new FileWriter("ficheroDeTest.java");
    }

    @After
    public void borrarElFicheroDeTest() {
        if (!pathFicheroDeTest.delete()) {
            throw new RuntimeException("el fichero de test no se puede borrar!!");
        }
    }

    @Test
    public void deberia_devolver_cero_si_el_fichero_esta_en_blanco() throws IOException {
        addLinesToTestFile();
        assertEquals(0, contador.numeroDeLineasEn(pathFicheroDeTest));
    }
    
    @Test
    public void deberia_contar_las_lineas_de_un_fichero_java_que_no_contiene_comentarios() throws IOException {
        addLinesToTestFile(
                "public class ContarEstoEsFacilFacil {",
                "    System.out.println(\"tengo 5 lineas!!\");"
        );

        assertEquals(2, contador.numeroDeLineasEn(pathFicheroDeTest));
    }

    @Test
    public void no_deberia_contar_las_lineas_en_blanco() throws IOException {
        addLinesToTestFile(
                "public class ContarEstoEsFacilFacil {",
                "                                     ",
                "    System.out.println(\"tengo 5 lineas!!\");",
                ""
        );

        assertEquals(2, contador.numeroDeLineasEn(pathFicheroDeTest));

    }

    @Test
    public void no_deberia_contar_las_lineas_comentadas_con_comentarios_de_linea() throws IOException {
        addLinesToTestFile(
                "public class ContarEstoEsFacilFacil {",
                "    System.out.println(\"tengo 5 lineas!!\");",
                "// linea comentada",
                "System.out.println(...) //otro comentario"
        );

        assertEquals(3, contador.numeroDeLineasEn(pathFicheroDeTest));

    }



    private void addLinesToTestFile(String...lines) throws IOException {
        for (String linea : lines) {
            ficheroDeTest.write(linea + "\n");
        }
        ficheroDeTest.close();
    }

}
