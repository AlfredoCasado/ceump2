package es.ceu.mpII.examenPrimerParcial;


class Usuario {
    private final String nombreUsuario;

    public Usuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    @Override
    public String toString() {
        return nombreUsuario;
    }



}
