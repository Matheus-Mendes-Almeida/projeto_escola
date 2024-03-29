package controller;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


public abstract class FabricaDeConexao {
     protected File arquivo;
    protected DataInputStream lerDoArquivo;
    protected DataOutputStream escreverNoArquivo;
    protected String path;
    protected String fileName;
    
    public abstract void gerarCaminho();
    
    public void iniciarArquivo(){
        gerarCaminho();
        
        File caminho = new File(path);
        if(!caminho.exists())
            caminho.mkdir();
        
        arquivo = new File(caminho, fileName);
        try {
            arquivo.createNewFile();
        } catch (IOException ex) {
        }
    }
    
    public void iniciarLeituraDoArquivo(){
        if(arquivo == null)
            iniciarArquivo();
        
        try {
            lerDoArquivo = new DataInputStream(new FileInputStream(arquivo));
        } catch (FileNotFoundException ex) {
        }
    }
    
    public void iniciarEscritaNoArquivo(){
        if(arquivo == null)
            iniciarArquivo();
        
        try {
            escreverNoArquivo = new DataOutputStream(new FileOutputStream(arquivo, true));
        } catch (IOException ex) {
        }
    }
    
    public void iniciarEscritaNoArquivoNovo(){
        if(arquivo == null)
            iniciarArquivo();
        
        try {
            escreverNoArquivo = new DataOutputStream(new FileOutputStream(arquivo, false));
        } catch (IOException ex) {
        }
    }
    
    public String lerLinha(){
        if(lerDoArquivo == null)
            iniciarLeituraDoArquivo();
        
        try {
            return lerDoArquivo.readUTF();
        } catch (IOException ex) {
        }
        
        return "Erro";
    }
    
    public void inserirTexto(String texto){
        if(escreverNoArquivo == null)
            iniciarEscritaNoArquivo();
        
        try {
            
            escreverNoArquivo.writeUTF(texto + "\n");
            escreverNoArquivo.flush();
        }catch (IOException ex) {
        }
    }
}
