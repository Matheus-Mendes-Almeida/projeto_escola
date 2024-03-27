package controller;

import java.io.IOException;
import java.util.ArrayList;
import model.Professor;

public class ProfessorDAO extends FabricaDeConexao{
    @Override
    public void gerarCaminho(){
        path = "C:\\Documentos";
        fileName = "Professores.bin";
    }
    
    public boolean professorExiste(String nome){
        for(Professor p: new ProfessorDAO().exibirProfessor()){
            if(p.getNome().equals(nome))
                
                return true;
        }
        
        return false;
    }
    
    public void cadastrarProfessor(Professor professor){
        inserirTexto(professor.getNome());
        inserirTexto(professor.getFormação());
        inserirTexto(professor.getAreaDeAtuação());
        inserirTexto(Integer.toString(professor.getAnoDeIngresso()));
    }
    
    public ArrayList<Professor> exibirProfessor(){
        ArrayList<Professor> dados = new ArrayList<>();
        
        iniciarLeituraDoArquivo();
        iniciarEscritaNoArquivo();
        
        try {
            while(lerDoArquivo.available() > 0){
                dados.add(new Professor(lerLinha().replace("\n", ""), lerLinha(), lerLinha(),Integer.parseInt(lerLinha().replace("\n", ""))));
            }
        } catch (IOException ex) {
        }

        return dados;
    }
    
    public boolean alterarProfessor(String nomeAntigo, String nomeNovo, String novaFormacao, String novaAreaDeAtuacao, int anoDeIngresso){
        ArrayList<Professor> intermediario;
        
        iniciarLeituraDoArquivo();
        
        try {
            while(lerDoArquivo.available() > 0){
                if(nomeAntigo.equals(lerLinha().replace("\n", ""))){
                    intermediario = new ProfessorDAO().exibirProfessor();
                    
                    for(Professor p: intermediario){
                        if(p.getNome().equals(nomeAntigo)){
                            p.setNome(nomeNovo);
                            p.setFormação(novaFormacao);
                            p.setAreaDeAtuação(novaAreaDeAtuacao);
                            p.setAnoDeIngresso(anoDeIngresso);
                            
                            break;
                        }
                    }
                    
                    iniciarEscritaNoArquivoNovo();
                    
                    for(Professor p: intermediario){
                        cadastrarProfessor(p);
                    }
                    
                    return true;
                }
            }
        } catch (IOException ex) {
        }
        
        return false;
    }
    
    public boolean excluirProfessor(String nome){
        ArrayList<Professor> intermediario;
        
        iniciarLeituraDoArquivo();
        
        try {
            while(lerDoArquivo.available() > 0){
                if(nome.equals(lerLinha().replace("\n", ""))){
                    intermediario = new ProfessorDAO().exibirProfessor();
                    int index = 0;
                    
                    for(Professor p: intermediario){
                        if(p.getNome().equals(nome))
                            index = intermediario.indexOf(p);
                    }
                    
                    intermediario.remove(index);
                    
                    iniciarEscritaNoArquivoNovo();
                    
                    for(Professor p: intermediario){
                        cadastrarProfessor(p);
                    }
                    
                    return true;
                }
            }
        } catch (IOException ex) {
        }
        
        return false;
    }
}
