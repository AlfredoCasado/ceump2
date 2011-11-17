package es.ceu.mpII.envioNotificaciones;

class RepositorioAlumnos {

    Alumno[] dameTodos() {
        Alumno[] alumnos = new Alumno[1];
        alumnos[0] = new Alumno("alfredo", 7, TipoNotificador.MAIL);
        return alumnos;
    }

}
