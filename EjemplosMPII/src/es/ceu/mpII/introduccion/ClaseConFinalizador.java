package es.ceu.mpII.introduccion;

public class ClaseConFinalizador {

    private static int numeroDeInstanciasEnMemoriaDeLaClase = 0;

    static int numeroDeInstanciasEnMemoriaDeLaClase() {
        return numeroDeInstanciasEnMemoriaDeLaClase;
    }
   
    public ClaseConFinalizador() {
        numeroDeInstanciasEnMemoriaDeLaClase++;
    }

    @Override
    public void finalize() {
        numeroDeInstanciasEnMemoriaDeLaClase--;
        System.out.println("finalize invocado");
    }

}
