package es.ceu.mpII.colecciones.bombo;

public class BomboLoteriasSuffleTest extends BomboLoteriasPrueba {

    @Override
    protected BomboLoterias crearBomboDeTest(int numeroDeBolas) {
        return new BomboLoteriasSuffle(numeroDeBolas);
    }

}