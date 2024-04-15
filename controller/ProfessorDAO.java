package controller;

import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Professor;
import view.TelaInicial;

public class ProfessorDAO {
    
    public void cadastrarProfessor(Professor professor){
        String sql = "INSERT INTO escola.professor(prof_nome, prof_formacao, prof_areaDeAtuacao, prof_anoDeIngresso) VALUES (?, ?, ?, ?)";
        
        try {
            PreparedStatement stmt = TelaInicial.conexao.prepareStatement(sql);
            
            stmt.setString(1,professor.getNome());
            stmt.setString(2, professor.getFormação());
            stmt.setString(3, professor.getAreaDeAtuação());
            stmt.setInt(4, professor.getAnoDeIngresso());
            
            if(stmt.executeUpdate() > 0) {
		try {
                    TelaInicial.conexao.commit();
		} catch (SQLException e) {}
            }
        } catch (SQLException ex) {}
    }
    
    public ArrayList<Professor> exibirProfessor(){
        ArrayList<Professor> dados = new ArrayList<>();
        
         String sql = "SELECT * FROM escola.professor";
		
	try {
            Statement stmt = TelaInicial.conexao.createStatement();
			
            ResultSet resultado = stmt.executeQuery(sql);
			
                while(resultado.next()) {
                    Professor p = new Professor();
				
                    p.setNome(resultado.getString("prof_nome"));
                    p.setFormação(resultado.getString("prof_formacao"));
                    p.setAreaDeAtuação(resultado.getString("prof_areaDeAtuacao"));
                    p.setAnoDeIngresso(resultado.getInt("prof_anoDeIngresso"));
				
                    dados.add(p);
		}
	} catch (SQLException e) { throw new RuntimeException(e); }
        
        return dados;
    }
    
    public Professor encontrarProfessor(String nome){
        String sql = "SELECT * FROM escola.professor WHERE prof_nome = ?";
        Professor p = new Professor();
        
        try {
            PreparedStatement stmt = TelaInicial.conexao.prepareStatement(sql);
            
            stmt.setString(1, nome);
            
            ResultSet resultado = stmt.executeQuery();
            
            while(resultado.next()){
                p.setNome(resultado.getString("prof_nome"));
                p.setFormação(resultado.getString("prof_formacao"));
                p.setAreaDeAtuação(resultado.getString("prof_areaDeAtuacao"));
                p.setAnoDeIngresso(resultado.getInt("prof_anoDeIngresso"));
                
                return p;
            }
        } catch (SQLException ex) {}
    
        return null;
    }
    
    public boolean alterarProfessor(String nomeAntigo, String nomeNovo, String novaFormacao, String novaAreaDeAtuacao, int novoAnoDeIngresso){
        String sql = "UPDATE escola.professor SET prof_nome = ?, prof_formacao = ?, prof_areaDeAtuacao = ?, prof_anoDeIngresso = ? WHERE prof_nome = ?";
        
        try {
            PreparedStatement stmt = TelaInicial.conexao.prepareStatement(sql);
            
            stmt.setString(1, nomeNovo);
            stmt.setString(2, novaFormacao);
            stmt.setString(3, novaAreaDeAtuacao);
            stmt.setInt(4, novoAnoDeIngresso);
            stmt.setString(5, nomeAntigo);
            
            if(stmt.executeUpdate() > 0) {
                try {
                    TelaInicial.conexao.commit();
                } catch (SQLException e) {}
				
                return true;
            }else{
                return false;
            }
            
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
    public boolean excluirProfessor(String nome){
        String sql = "DELETE FROM escola.professor WHERE prof_nome = ?";
		
        try {
            PreparedStatement stmt = TelaInicial.conexao.prepareStatement(sql);
			
            stmt.setString(1, nome);
			
            if(stmt.executeUpdate() > 0) {
                try {
                    TelaInicial.conexao.commit();
                } catch (SQLException e) {}
				
                return true;
            }else{
                return false;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
