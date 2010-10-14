package es.ceu.mpII.introduccion.ejerciciovideoclub;

public class Cliente {

    private final String nombre;
    private Alquiler[] alquileresRealizados = new Alquiler[50];
    private PintorInformes[] pintores;
    private int contadorAlquileresRealizados = 0;

    public Cliente(String nombre, PintorInformes[] pintores) {
        this.nombre = nombre;
        this.pintores = pintores;
    }

    public boolean tuNombreEs(String nombreCliente) {
        return nombreCliente.equals(nombre);
    }

    public void realizarAlquiler(Copia copia, int numeroDias) {
        Alquiler nuevoAlquiler = new Alquiler(copia, numeroDias);
        alquileresRealizados[contadorAlquileresRealizados] = nuevoAlquiler;
        contadorAlquileresRealizados++;
    }

    public int alquilereRealizados() {
        return contadorAlquileresRealizados;
    }

    public void pintarInformeDeAlquileresRealizados(String formato) {
        PintorInformes pintorInformes = buscarPintorInformesQueSoporte(formato);
        if (pintorInformes != null) {
            pintorInformes.pintarInforme(alquileresRealizados, contadorAlquileresRealizados);
        } else {
            System.out.println("no tenemos ningún pintor que soporte el formato: " + formato);
        }
    }

    private PintorInformes buscarPintorInformesQueSoporte(String formato) {
        for (PintorInformes pintor : pintores) {
            if (pintor.formatoSoportado().equals(formato)) {
                return pintor;
            }
        }
        return null;
    }

    
}
