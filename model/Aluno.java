package model;

public class Aluno {
    
    private String nome;
    private int periodoEscolar;
    private int anoDeIngresso;

    public Aluno() {}
    
    public Aluno(String nome, int periodoEscolar, int anoDeingresso){
        this.nome = nome;
        this.periodoEscolar = periodoEscolar;
        this.anoDeIngresso = anoDeingresso;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPeriodoEscolar() {
        return periodoEscolar;
    }

    public void setPeriodoEscolar(int periodoEscolar) {
        this.periodoEscolar = periodoEscolar;
    }

    public int getAnoDeIngresso() {
        return anoDeIngresso;
    }

    public void setAnoDeIngresso(int anoDeIngresso) {
        this.anoDeIngresso = anoDeIngresso;
    }
    
    
}
