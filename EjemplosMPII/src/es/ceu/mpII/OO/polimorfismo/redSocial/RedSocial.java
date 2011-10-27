package es.ceu.mpII.OO.polimorfismo.redSocial;

abstract class RedSocial {
    abstract void enviarEstado(String mensaje);
}

class Facebook extends RedSocial {
    @Override
    void enviarEstado(String mensaje) {
        System.out.println("enviar estado al FB...");
    }
}

class Twitter extends RedSocial {
    @Override
    void enviarEstado(String mensaje) {
        System.out.println("enviar estado el twitter...");
    }
}

class Linkedin extends RedSocial {
    @Override
    void enviarEstado(String mensaje) {
        System.out.println("enviar estado al linkedin...");
    }
}


