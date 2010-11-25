package es.ceu.mpII.examenPrimerParcial;


public class EjercicioExcepciones {
    
    public static boolean contieneCaracterA(String cadena,
				             int beginIndex,
				             int endIndex) {
        if (cadena==null) return false;
        if (endIndex < beginIndex) {
            return false;
        }

        String cadenaRecortada = cadena.substring(beginIndex, endIndex);
        return cadenaRecortada.contains("a");
    }

}
