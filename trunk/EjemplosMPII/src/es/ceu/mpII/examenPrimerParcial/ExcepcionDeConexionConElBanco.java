package es.ceu.mpII.examenPrimerParcial;

public class ExcepcionDeConexionConElBanco extends Exception {

    public ExcepcionDeConexionConElBanco(String mensaje) {
        super(mensaje);
    }

    public ExcepcionDeConexionConElBanco(String mensaje, Throwable cause) {
        super(mensaje, cause);
    }

}
