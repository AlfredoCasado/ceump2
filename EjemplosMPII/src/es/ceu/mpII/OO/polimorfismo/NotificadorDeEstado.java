package es.ceu.mpII.OO.polimorfismo;

public class NotificadorDeEstado {

    RedSocial[] listaDeRedesSociales;

    public NotificadorDeEstado(RedSocial...listaDeRedesSociales) {
        this.listaDeRedesSociales = listaDeRedesSociales;
    }

    public void procesarNotificacionDeEstado(final String mensaje) {
        for (RedSocial redSocial : listaDeRedesSociales) {
            redSocial.enviarEstado(mensaje);
        }
    }

}
