package controller;

public class ProfessorDAO extends FabricaDeConexao{
    @Override
    public void gerarCaminho(){
        path = "C:\\Documentos";
        fileName = "Professores.bin";
    }
}
