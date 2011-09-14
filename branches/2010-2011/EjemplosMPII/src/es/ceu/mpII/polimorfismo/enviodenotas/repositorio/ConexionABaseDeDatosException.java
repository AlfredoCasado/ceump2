package es.ceu.mpII.polimorfismo.enviodenotas.repositorio;

class ConexionABaseDeDatosException extends RuntimeException {

    public ConexionABaseDeDatosException(String message, Exception ex) {
        super(message,ex);
    }

}
