package controller;

import java.io.IOException;
import java.util.ArrayList;
import model.Materia;

public class MateriaDAO extends FabricaDeConexao{
    @Override
    public void gerarCaminho(){
        path = "C:\\Documentos";
        fileName = "Materias.bin";
    }
    
    public boolean materiaExiste(String nome){
        for(Materia m: new MateriaDAO().exibirMaterias()){
            if(m.getNome().equals(nome))
                
                return true;
        }
        
        return false;
    }
    
    public void cadastrarMateria(Materia materia){
        inserirTexto(materia.getNome());
        inserirTexto(materia.getAreaDeConhecimento());
        inserirTexto(Integer.toString(materia.getPeriodoEscolar()));
    }
    
    public ArrayList<Materia> exibirMaterias(){
        ArrayList<Materia> dados = new ArrayList<>();
        
        iniciarLeituraDoArquivo();
        iniciarEscritaNoArquivo();
        
        try {
            while(lerDoArquivo.available() > 0){
                dados.add(new Materia(lerLinha().replace("\n", ""), lerLinha(), Integer.parseInt(lerLinha().replace("\n", ""))));
            }
        } catch (IOException ex) {
        }

        return dados;
    }
    
    public boolean alterarMateria(String nomeAntigo, String nomeNovo, String novaAreaDeConhecimento, int novoPeriodoEscolar){
        ArrayList<Materia> intermediario;
        
        iniciarLeituraDoArquivo();
        
        try {
            while(lerDoArquivo.available() > 0){
                if(nomeAntigo.equals(lerLinha().replace("\n", ""))){
                    intermediario = new MateriaDAO().exibirMaterias();
                    
                    for(Materia m: intermediario){
                        if(m.getNome().equals(nomeAntigo)){
                            m.setNome(nomeNovo);
                            m.setAreaDeConhecimento(novaAreaDeConhecimento);
                            m.setPeriodoEscolar(novoPeriodoEscolar);
                            
                            break;
                        }
                    }
                    
                    iniciarEscritaNoArquivoNovo();
                    
                    for(Materia m: intermediario){
                        cadastrarMateria(m);
                    }
                    
                    return true;
                }
            }
        } catch (IOException ex) {
        }
        
        return false;
    }
    
    public boolean excluirMateria(String nome){
        ArrayList<Materia> intermediario;
        
        iniciarLeituraDoArquivo();
        
        try {
            while(lerDoArquivo.available() > 0){
                if(nome.equals(lerLinha().replace("\n", ""))){
                    intermediario = new MateriaDAO().exibirMaterias();
                    int index = 0;
                    
                    for(Materia m: intermediario){
                        if(m.getNome().equals(nome))
                            index = intermediario.indexOf(m);
                    }
                    
                    intermediario.remove(index);
                    
                    iniciarEscritaNoArquivoNovo();
                    
                    for(Materia m: intermediario){
                        cadastrarMateria(m);
                    }
                    
                    return true;
                }
            }
        } catch (IOException ex) {
        }
        
        return false;
    }
}
