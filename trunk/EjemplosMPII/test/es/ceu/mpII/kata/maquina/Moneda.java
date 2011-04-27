package es.ceu.mpII.kata.maquina;

enum Moneda {

    CINCO(5),
    DIEZ(10),
    VEINTE(20),
    CICUENTA(50),
    UN_EURO(100),
    DOS_EUROS(200);

    private final int centimos;

    Moneda(int centimos) {
        this.centimos = centimos;
    }

    public int getCentimos() {
        return centimos;
    }



}


