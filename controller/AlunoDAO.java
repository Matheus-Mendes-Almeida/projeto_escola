package controller;

public class AlunoDAO extends FabricaDeConexao{
    @Override
    public void gerarCaminho(){
       path = "C:\\Documentos";
       fileName = "Alunos.bin";
    }
}
