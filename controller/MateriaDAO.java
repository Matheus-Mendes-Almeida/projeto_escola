package controller;

public class MateriaDAO extends FabricaDeConexao{
    @Override
    public void gerarCaminho(){
        path = "C:\\Documentos";
        fileName = "Materias.bin";
    }
}
