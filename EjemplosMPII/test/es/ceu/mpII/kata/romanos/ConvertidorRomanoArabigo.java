package es.ceu.mpII.kata.romanos;

class ConvertidorRomanoArabigo {
    
    private static final Conversion[] tablaConversionesRomanoArabigo = new Conversion[13];
    
    static {
        int i=0;
        tablaConversionesRomanoArabigo[i++] = new Conversion("M", 1000);
        tablaConversionesRomanoArabigo[i++] = new Conversion("CM", 900);
        tablaConversionesRomanoArabigo[i++] = new Conversion("D", 500);
        tablaConversionesRomanoArabigo[i++] = new Conversion("CD", 400);
        tablaConversionesRomanoArabigo[i++] = new Conversion("C", 100);
        tablaConversionesRomanoArabigo[i++] = new Conversion("XC", 90);
        tablaConversionesRomanoArabigo[i++] = new Conversion("L", 50);
        tablaConversionesRomanoArabigo[i++] = new Conversion("XL", 40);
        tablaConversionesRomanoArabigo[i++] = new Conversion("X", 10);
        tablaConversionesRomanoArabigo[i++] = new Conversion("IX", 9);
        tablaConversionesRomanoArabigo[i++] = new Conversion("V", 5);
        tablaConversionesRomanoArabigo[i++] = new Conversion("IV", 4);
        tablaConversionesRomanoArabigo[i++] = new Conversion("I", 1);
    }
    
    public int convertir(final String numeroRomano) {
        for (Conversion conversion : tablaConversionesRomanoArabigo) {
            if (numeroRomano.equals(conversion.romano))     return conversion.arabigo;
            if (numeroRomano.startsWith(conversion.romano)) return conversion.arabigo + valorArabigoDelRestoDel(numeroRomano, conversion);
        }
        throw new RuntimeException("numero romano invalido");
    }

    private int valorArabigoDelRestoDel(final String numeroRomano, Conversion conversion) {
        return convertir(numeroRomano.substring(conversion.romano.length()));
    }
    
}

class Conversion {
    
    public final String romano;
    public final int arabigo;

    public Conversion(String romano, int arabigo) {
        this.romano = romano;
        this.arabigo = arabigo;
    }

}

