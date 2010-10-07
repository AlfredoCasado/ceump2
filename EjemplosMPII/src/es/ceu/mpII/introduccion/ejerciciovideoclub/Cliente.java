package es.ceu.mpII.introduccion.ejerciciovideoclub;

public class Cliente {

    private final String nombre;
    private Alquiler[] alquileresRealizados = new Alquiler[50];
    private int contadorAlquileresRealizados = 0;

    public Cliente(String nombre) {
        this.nombre = nombre;
    }

    public boolean tuNombreEs(String nombreCliente) {
        return nombreCliente.equals(nombre);
    }

    public void realizarAlquiler(Copia copia, int numeroDias) {
        Alquiler nuevoAlquiler = new Alquiler(copia,numeroDias);
        alquileresRealizados[contadorAlquileresRealizados] = nuevoAlquiler;
        contadorAlquileresRealizados++;
    }

    public int alquilereRealizados() {
        return contadorAlquileresRealizados;
    }

    public void pintarInformeDeAlquileresRealizados() {
        int importeTotal = 0;
        for (int i = 0; i<contadorAlquileresRealizados; i++) {
            Alquiler alquiler = alquileresRealizados[i];
            importeTotal+= alquiler.importe();
            System.out.println(alquiler);
        }

        System.out.println("total: " + importeTotal);
    }

}
