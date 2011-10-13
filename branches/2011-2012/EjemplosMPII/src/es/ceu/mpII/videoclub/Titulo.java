package es.ceu.mpII.videoclub;

class Titulo {
    
    private Copia[] copias;
    private String nombre;

    public Titulo(String nombre, Copia[] copias) {
        this.nombre = nombre;
        this.copias = copias;
    }

    String nombre() {
        return nombre;
    }

    boolean tieneCopiasDisponibles() {
        for (Copia copia : copias) {
            if (copia.estaDisponible()) {
                return true;
            }
        }
        return false;
    }

}
