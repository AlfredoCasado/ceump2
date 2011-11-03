package es.ceu.mpII.javalang;

public class Moto implements Cloneable {

    public Rueda ruedaDelantera = new Rueda();
    public Rueda ruedaTrasera = new Rueda();

    @Override
    public String toString() {
        return super.toString() +
                ruedaDelantera.toString() +
                ruedaTrasera.toString();
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Moto o = (Moto) super.clone();
        o.ruedaDelantera = (Rueda) ruedaDelantera.clone();
        o.ruedaTrasera = (Rueda) ruedaTrasera.clone();
        return o;
    }





}
