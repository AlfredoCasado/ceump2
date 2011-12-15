package es.ceu.mpII.taller;

class Vehiculo {

    private Motor motor;

    public Vehiculo(Motor motor) {
        this.motor = motor;
    }

    boolean esDiesel() {
        return motor.esDiesel();
    }



}
