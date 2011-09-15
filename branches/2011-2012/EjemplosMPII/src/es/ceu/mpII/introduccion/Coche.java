package es.ceu.mpII.introduccion;

// declaración de la clase
public class Coche {

    // propiedades
    private int velocidad = 30;
    public String color;
    public static int numeroDeCochesEnCirculacion = 0;

    static int numeroDeCochesEnCirculacion() {
        return numeroDeCochesEnCirculacion;
    }
    
    // declaro el constructor vacio ya que quiero usarlo y al tener otro declarado
    // java ya no lo declara de manera automatica.
    public Coche() {}

    // constructor
    public Coche(int velocidad, String color) {
        this.velocidad = velocidad;
        this.color = color;
        numeroDeCochesEnCirculacion++;
    }

    // métodos publicos: interfaz que ofrece la clase a los usuarios de la misma
    public void acelerar(int aumentoVelocidad) {
        velocidad+= aumentoVelocidad;
    }

    public int velocidadActual() {
        return velocidad;
    }
}
