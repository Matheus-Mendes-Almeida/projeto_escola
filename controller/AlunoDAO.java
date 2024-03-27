package controller;

import java.io.IOException;
import java.util.ArrayList;
import model.Aluno;

public class AlunoDAO extends FabricaDeConexao{
    @Override
    public void gerarCaminho(){
       path = "C:\\Documentos";
       fileName = "Alunos.bin";
    }
    
    public boolean alunoExiste(String nome){
        for(Aluno a: new AlunoDAO().exibirAlunos()){
            if(a.getNome().equals(nome))
                
                return true;
        }
        
        return false;
    }
    
    public void cadastrarAluno(Aluno aluno){
        inserirTexto(aluno.getNome());
        inserirTexto(Integer.toString(aluno.getPeriodoEscolar()));
        inserirTexto(Integer.toString(aluno.getAnoDeIngresso()));
    }
    
    public ArrayList<Aluno> exibirAlunos(){
        ArrayList<Aluno> dados = new ArrayList<>();
        
        iniciarLeituraDoArquivo();
        iniciarEscritaNoArquivo();
        
        try {
            while(lerDoArquivo.available() > 0){
                dados.add(new Aluno(lerLinha().replace("\n", ""), Integer.parseInt(lerLinha().replace("\n", "")), Integer.parseInt(lerLinha().replace("\n", ""))));
            }
        } catch (IOException ex) {
        }

        return dados;
    }
    
    public boolean alterarAluno(String nomeAntigo, String nomeNovo, int novoPeriodoEscolar, int anoDeIngresso){
        ArrayList<Aluno> intermediario;
        
        iniciarLeituraDoArquivo();
        
        try {
            while(lerDoArquivo.available() > 0){
                String inter = lerLinha().replace("\n", "");
                if(nomeAntigo.equals(inter)){
                    intermediario = new AlunoDAO().exibirAlunos();
                    
                    for(Aluno a: intermediario){
                        if(a.getNome().equals(nomeAntigo)){
                            a.setNome(nomeNovo);
                            a.setPeriodoEscolar(novoPeriodoEscolar);
                            a.setAnoDeIngresso(anoDeIngresso);
                            
                            break;
                        }
                    }
                    
                    iniciarEscritaNoArquivoNovo();
                    
                    for(Aluno a: intermediario){
                        cadastrarAluno(a);
                    }
                    
                    return true;
                }
            }
        } catch (IOException ex) {
        }
        
        return false;
    }
   
    public boolean excluirAluno(String nome){
        ArrayList<Aluno> intermediario;
        
        iniciarLeituraDoArquivo();
        
        try {
            while(lerDoArquivo.available() > 0){                
                if(nome.equals(lerLinha().replace("\n", ""))){
                    intermediario = new AlunoDAO().exibirAlunos();
                    int index = 0;
                    
                    for(Aluno a: intermediario){
                        if(a.getNome().equals(nome))
                            index = intermediario.indexOf(a);
                    }
                    
                    intermediario.remove(index);
                    
                    iniciarEscritaNoArquivoNovo();
                    
                    for(Aluno a: intermediario){
                        cadastrarAluno(a);
                    }
                    
                    return true;
                }
            }
        } catch (IOException ex) {
        }
        
        return false;
    }
}
