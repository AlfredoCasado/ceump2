package es.ceu.mpII.javalang;

class Direccion {

    private final String localidad;
    private final String calle;

    Direccion(String localidad, String calle) {
        this.localidad = localidad;
        this.calle = calle;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Direccion other = (Direccion) obj;
        if ((this.localidad == null) ? (other.localidad != null) : !this.localidad.equals(other.localidad)) {
            return false;
        }
        if ((this.calle == null) ? (other.calle != null) : !this.calle.equals(other.calle)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 13 * hash + (this.localidad != null ? this.localidad.hashCode() : 0);
        hash = 13 * hash + (this.calle != null ? this.calle.hashCode() : 0);
        return hash;
    }

    





}
