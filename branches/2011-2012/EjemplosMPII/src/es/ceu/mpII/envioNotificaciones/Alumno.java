package es.ceu.mpII.envioNotificaciones;


class Alumno {

    private final String nombre;
    private final int nota;
    private final TipoNotificador tipoNotificador;

    Alumno(String nombre, int nota, TipoNotificador tipoNotificador) {
        this.nombre = nombre;
        this.nota = nota;
        this.tipoNotificador = tipoNotificador;
    }

    TipoNotificador tipoNotificador() {
        return tipoNotificador;
    }

}
