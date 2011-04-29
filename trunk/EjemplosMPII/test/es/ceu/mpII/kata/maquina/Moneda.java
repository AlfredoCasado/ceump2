package es.ceu.mpII.kata.maquina;

enum Moneda {
    
    DOS_EUROS(200),
    UN_EURO(100),
    CICUENTA(50),
    VEINTE(20),
    DIEZ(10),
    CINCO(5);

    private final int centimos;

    Moneda(int centimos) {
        this.centimos = centimos;
    }

    public int getCentimos() {
        return centimos;
    }



}


