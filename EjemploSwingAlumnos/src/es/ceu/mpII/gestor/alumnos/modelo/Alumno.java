package es.ceu.mpII.gestor.alumnos.modelo;

public class Alumno implements Comparable<Alumno> {

    private final String nombreAlumno;
    private final int notaMedia;
    private final MecanismoDeNotificacion tipoNoficacion;
    private final String direccion;

    public Alumno(String nombreAlumno, int notaMedia, MecanismoDeNotificacion tipoNoficacion, String direccion) {
        this.nombreAlumno = nombreAlumno;
        this.notaMedia = notaMedia;
        this.tipoNoficacion = tipoNoficacion;
        this.direccion = direccion;
    }

    public MecanismoDeNotificacion dimeTuTipoDeNotificacion() {
        return tipoNoficacion;
    }

    public String nombre() {
        return nombreAlumno;
    }

    public int notaMedia() {
        return notaMedia;
    }

    public String direccion() {
        return direccion;
    }

    @Override
    public String toString() {
        return nombreAlumno + notaMedia;
    }

    public int compareTo(Alumno alumno) {
        return this.nombreAlumno.compareTo(alumno.nombreAlumno);
    }

}
