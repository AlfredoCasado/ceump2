package es.ceu.mpII.cajero;

public class Cajero {

    private Menu menu;

    public Cajero(Menu menu) {
        this.menu = menu;
    }

    private void arranca() {
        while(true) {
            menu.mostrar();
            Opcion opcion = menu.solicitarOpcionAlUsuario();
            opcion.ejecutar();
        }
    }

    public static void main(String[] args) {
        crearCajero().arranca();
    }

    private static Cajero crearCajero() {
        Opcion[] opciones = crearOpciones();
        Menu menu = crearMenu(opciones);
        return new Cajero(menu);
    }

    private static Menu crearMenu(Opcion[] opciones) {
        return new Menu(opciones);
    }

    private static Opcion[] crearOpciones() {
        Opcion[] opciones = new Opcion[2];
        opciones[0] = new OpcionConsultaDeSaldo();
        opciones[1] = new OpcionRetirarEfectivo();
        return opciones;
    }

}
