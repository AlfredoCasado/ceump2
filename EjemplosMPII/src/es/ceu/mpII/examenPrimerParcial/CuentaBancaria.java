package es.ceu.mpII.examenPrimerParcial;

public class CuentaBancaria {

    private final String nombre;
    private final String codigoCuentaCliente;

    public CuentaBancaria(String nombre, String codigoCuentaCliente) {
        this.nombre = nombre;
        this.codigoCuentaCliente = codigoCuentaCliente;
    }

//    @Override
//    public boolean equals(Object o) {
//        CuentaBancaria otraCuenta = (CuentaBancaria) o;
//        return codigoCuentaCliente.equals(otraCuenta.codigoCuentaCliente);
//    }
//
//    @Override
//    public int hashCode() {
//        int hash = 3;
//        hash = 47 * hash + (this.codigoCuentaCliente != null ? this.codigoCuentaCliente.hashCode() : 0);
//        return hash;
//    }
}
