package es.ceu.mpII.primerParcial.grupos;

class Permiso {

    private String nombre;

    public Permiso(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Permiso{" + "nombre=" + nombre + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Permiso other = (Permiso) obj;
        if ((this.nombre == null) ? (other.nombre != null) : !this.nombre.equals(other.nombre)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + (this.nombre != null ? this.nombre.hashCode() : 0);
        return hash;
    }



}
