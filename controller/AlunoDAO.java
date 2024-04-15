package controller;

import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Aluno;
import view.TelaInicial;

public class AlunoDAO {
    
    public void cadastrarAluno(Aluno aluno){
        String sql = "INSERT INTO escola.aluno(alu_nome, alu_periodoEscolar, alu_anoDeIngresso) VALUES (?, ?, ?)";
        
        try {
            PreparedStatement stmt = TelaInicial.conexao.prepareStatement(sql);
            
            stmt.setString(1, aluno.getNome());
            stmt.setInt(2, aluno.getPeriodoEscolar());
            stmt.setInt(3, aluno.getAnoDeIngresso());
            
            if(stmt.executeUpdate() > 0) {
		try {
                    TelaInicial.conexao.commit();
		} catch (SQLException e) {}
            }
        } catch (SQLException ex) {}
    }
    
    public ArrayList<Aluno> exibirAlunos(){
        ArrayList<Aluno> dados = new ArrayList<>();
        
        String sql = "SELECT * FROM escola.aluno";
		
	try {
            Statement stmt = TelaInicial.conexao.createStatement();
			
            ResultSet resultado = stmt.executeQuery(sql);
			
                while(resultado.next()) {
                    Aluno a = new Aluno();
				
                    a.setNome(resultado.getString("alu_nome"));
                    a.setPeriodoEscolar(resultado.getInt("alu_periodoEscolar"));
                    a.setAnoDeIngresso(resultado.getInt("alu_anoDeIngresso"));
				
                    dados.add(a);
		}
	} catch (SQLException e) { throw new RuntimeException(e); }
        
        return dados;
    }
    
    public Aluno encontrarAluno(String nome){
        String sql = "SELECT * FROM escola.aluno WHERE alu_nome = ?";
        Aluno a = new Aluno();
        
        try {
            PreparedStatement stmt = TelaInicial.conexao.prepareStatement(sql);
            
            stmt.setString(1, nome);
            
            ResultSet resultado = stmt.executeQuery();
            
            while(resultado.next()){
                a.setNome(resultado.getString("alu_nome"));
                a.setPeriodoEscolar(resultado.getInt("alu_periodoEscolar"));
                a.setAnoDeIngresso(resultado.getInt("alu_anoDeIngresso"));
                
                return a;
            }
        } catch (SQLException ex) {}
    
        return null;
    }
    
    public boolean alterarAluno(String nomeAntigo, String nomeNovo, int novoPeriodoEscolar, int novoAnoDeIngresso){
        String sql = "UPDATE escola.aluno SET alu_nome = ?, alu_periodoEscolar = ?, alu_anoDeIngresso = ? WHERE alu_nome = ?";
        
        try {
            PreparedStatement stmt = TelaInicial.conexao.prepareStatement(sql);
            
            stmt.setString(1, nomeNovo);
            stmt.setInt(2, novoPeriodoEscolar);
            stmt.setInt(3, novoAnoDeIngresso);
            stmt.setString(4, nomeAntigo);
            
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
   
    public boolean excluirAluno(String nome){
        String sql = "DELETE FROM escola.aluno WHERE alu_nome = ?";
		
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
