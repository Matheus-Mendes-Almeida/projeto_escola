package model;

public class Professor {
    
    private String nome;
    private String formação;
    private String areaDeAtuação;
    private int anoDeIngresso;

    public Professor(String nome, String formação, String areaDeAtuação, int anoDeIngresso) {
        this.nome = nome;
        this.formação = formação;
        this.areaDeAtuação = areaDeAtuação;
        this.anoDeIngresso = anoDeIngresso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFormação() {
        return formação;
    }

    public void setFormação(String formação) {
        this.formação = formação;
    }

    public String getAreaDeAtuação() {
        return areaDeAtuação;
    }

    public void setAreaDeAtuação(String areaDeAtuação) {
        this.areaDeAtuação = areaDeAtuação;
    }

    public int getAnoDeIngresso() {
        return anoDeIngresso;
    }

    public void setAnoDeIngresso(int anoDeIngresso) {
        this.anoDeIngresso = anoDeIngresso;
    }
    
    
}
