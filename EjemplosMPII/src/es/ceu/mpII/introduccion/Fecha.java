package es.ceu.mpII.introduccion;

public class Fecha {

    private int dia = 1;
    private int mes = 1;
    private int anno = 1970;

    public Fecha(){};
 
    public Fecha(int dia, int mes, int anno) {
        this.dia = dia;
        this.mes = mes;
        this.anno = anno;
    }

    public String imprimir() {
        return dia+"/"+mes+"/"+anno;
    }

    void sumarDias(int i) {
        throw new UnsupportedOperationException("Not yet implemented");
    }


}
