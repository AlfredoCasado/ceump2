package es.ceu.mpII.examenPrimerParcial;

class Apuesta {
    private final Usuario usuario;
    private final Resultado resultado;

    public Apuesta(Usuario usuario, Resultado resultado) {
        this.usuario = usuario;
        this.resultado = resultado;
    }

    public boolean tieneElResultado(Resultado resultado) {
       return this.resultado.equals(resultado);
    }

    public Usuario usuario() {
        return usuario;
    }

}
