package es.ceu.mpII.colecciones.bombo;

public class BomboLoteriasListTest extends BomboLoteriasPrueba {

    @Override
    protected BomboLoterias crearBomboDeTest(int numeroDeBolas) {
        return new BomboLoteriasList(numeroDeBolas);
    }

}