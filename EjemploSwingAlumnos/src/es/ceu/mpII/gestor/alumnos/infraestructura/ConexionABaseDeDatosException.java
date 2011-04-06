package es.ceu.mpII.gestor.alumnos.infraestructura;

class ConexionABaseDeDatosException extends RuntimeException {

    public ConexionABaseDeDatosException(String message, Exception ex) {
        super(message,ex);
    }

}
