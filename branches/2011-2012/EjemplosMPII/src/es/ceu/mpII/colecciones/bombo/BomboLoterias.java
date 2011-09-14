package es.ceu.mpII.colecciones.bombo;

public interface BomboLoterias {

    /**
     * @return devuelve una bola aleatoria del bombo
     * @throws ExcepcionNoHayMasBolas si no hay más bolas en el bombo
     */
    public Integer siguienteBola();

    public boolean hayMasBolas();
}
