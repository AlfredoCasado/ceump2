package es.ceu.mpII.colecciones.basico;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;



public class Colecciones {

    static Set<Contacto> conjuntoContactos = new HashSet();
    static List<Contacto> listaContactos = new ArrayList();

    public static void main(String[] args) {

        Contacto alfredo = new Contacto("alfredo", "90");
        Contacto julian = new Contacto("julian", "90");
        Contacto otroAlfredo = new Contacto("alfredo", "90");

        conjuntoContactos.add(alfredo);
        conjuntoContactos.add(julian);
        conjuntoContactos.add(otroAlfredo);

        System.out.println(conjuntoContactos.size());
    }

}

class Contacto {

    private String nombre;
    private String telefono;

    public Contacto(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Contacto other = (Contacto) obj;
        if ((this.nombre == null) ? (other.nombre != null) : !this.nombre.equals(other.nombre)) {
            return false;
        }
        if ((this.telefono == null) ? (other.telefono != null) : !this.telefono.equals(other.telefono)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + (this.nombre != null ? this.nombre.hashCode() : 0);
        hash = 97 * hash + (this.telefono != null ? this.telefono.hashCode() : 0);
        return hash;
    }




}
