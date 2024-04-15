package model;

public class Materia {
    
    private String nome;
    private String areaDeConhecimento;
    private int periodoEscolar;

    public Materia() {}
    
    public Materia(String nome, String areaDeConhecimento, int periodoEscolar) {
        this.nome = nome;
        this.areaDeConhecimento = areaDeConhecimento;
        this.periodoEscolar = periodoEscolar;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAreaDeConhecimento() {
        return areaDeConhecimento;
    }

    public void setAreaDeConhecimento(String areaDeConhecimento) {
        this.areaDeConhecimento = areaDeConhecimento;
    }

    public int getPeriodoEscolar() {
        return periodoEscolar;
    }

    public void setPeriodoEscolar(int periodoEscolar) {
        this.periodoEscolar = periodoEscolar;
    }
    
    
}
