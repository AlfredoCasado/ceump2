package es.ceu.mpII.colecciones.bombo;

public class BomboLoteriasSetTest extends BomboLoteriasPrueba {

    @Override
    protected BomboLoterias crearBomboDeTest(int numeroDeBolas) {
        return new BomboLoteriasSet(numeroDeBolas);
    }

}