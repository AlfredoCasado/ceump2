

package es.ceu.mpII.kata.romanos;

class ConversorRomanoArabigo {

    private static Conversion[] tablaConversionRomanoArabigo = new Conversion[13];
    static {
        int i=0;
        tablaConversionRomanoArabigo[i++] = new Conversion("M", 1000);
        tablaConversionRomanoArabigo[i++] = new Conversion("CM", 900);
        tablaConversionRomanoArabigo[i++] = new Conversion("D", 500);
        tablaConversionRomanoArabigo[i++] = new Conversion("CD", 400);
        tablaConversionRomanoArabigo[i++] = new Conversion("C", 100);
        tablaConversionRomanoArabigo[i++] = new Conversion("XC", 90);
        tablaConversionRomanoArabigo[i++] = new Conversion("L", 50);
        tablaConversionRomanoArabigo[i++] = new Conversion("XL", 40);
        tablaConversionRomanoArabigo[i++] = new Conversion("X", 10);
        tablaConversionRomanoArabigo[i++] = new Conversion("IX", 9);
        tablaConversionRomanoArabigo[i++] = new Conversion("V", 5);
        tablaConversionRomanoArabigo[i++] = new Conversion("IV", 4);
        tablaConversionRomanoArabigo[i++] = new Conversion("I", 1);
    }

    public int convertir(final String numeroRomano) {
        for (Conversion conversion : tablaConversionRomanoArabigo) {
            if (numeroRomano.equals(conversion.roman)) {
                return conversion.arabigo;
            }
            if (numeroRomano.startsWith(conversion.roman)) {
                return conversion.arabigo + convertir(restoDel(numeroRomano, conversion));
            }
        }
        throw new RuntimeException("numero romano invalido");
    }

    private String restoDel(final String numeroRomano, Conversion conversion) {
        return numeroRomano.substring(conversion.roman.length());
    }



}

class Conversion {

    public final String roman;
    public final int arabigo;

    public Conversion(String roman, int arabigo) {
        this.roman = roman;
        this.arabigo = arabigo;
    }

}
