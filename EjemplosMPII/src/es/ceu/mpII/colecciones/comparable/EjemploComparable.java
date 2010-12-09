package es.ceu.mpII.colecciones.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class EjemploComparable {

    public static void main(String[] args) {

        List<Usuario> usuarios = new LinkedList<Usuario>();
        usuarios.add(new Usuario("xavi", 29));
        usuarios.add(new Usuario("alfredo", 32));
        usuarios.add(new Usuario("julian", 35));
        usuarios.add(new Usuario("dani", 33));
        usuarios.add(new Usuario("jose luis", 50));

        //Collections.sort(usuarios, new Usuario.PorEdadDescendente());
        Collections.sort(usuarios, new Comparator<Usuario>() {
            public int compare(Usuario o1, Usuario o2) {
                Integer edadPrimerUsuario = o1.edad();
                Integer edadSegundoUsuario = o2.edad();
                return edadPrimerUsuario.compareTo(edadSegundoUsuario);
            }
        });

      
        for (Usuario usuario : usuarios) {
            System.out.println(usuario);
        }

    }
}
