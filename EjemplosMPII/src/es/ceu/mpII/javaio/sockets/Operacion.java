package es.ceu.mpII.javaio.sockets;

interface Operacion {
    boolean ejecutaOperacion(char operacion);
    int calcular(int operando1, int operando2);
}


class Suma implements Operacion {

    public int calcular(int operando1, int operando2) {
        return operando1 + operando2;
    }

    public boolean ejecutaOperacion(char operacion) {
       return operacion == '+';
    }
    
}

class Resta implements Operacion {
    
    public int calcular(int operando1, int operando2) {
        return operando1 - operando2;
    }

    public boolean ejecutaOperacion(char operacion) {
        return operacion == '-';
    }
 }
