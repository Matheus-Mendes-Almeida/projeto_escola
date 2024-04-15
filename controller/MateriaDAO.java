package controller;

import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Materia;
import view.TelaInicial;

public class MateriaDAO {
    
    public void cadastrarMateria(Materia materia){
        String sql = "INSERT INTO escola.materia(mate_nome, mate_areaDeConhecimento, mate_periodoEscolar) VALUES (?, ?, ?)";
        
        try {
            PreparedStatement stmt = TelaInicial.conexao.prepareStatement(sql);
            
            stmt.setString(1,materia.getNome());
            stmt.setString(2, materia.getAreaDeConhecimento());
            stmt.setInt(3, materia.getPeriodoEscolar());
            
            if(stmt.executeUpdate() > 0) {
		try {
                    TelaInicial.conexao.commit();
		} catch (SQLException e) {}
            }
        } catch (SQLException ex) {}
    }
    
    public ArrayList<Materia> exibirMaterias(){
        ArrayList<Materia> dados = new ArrayList<>();
        
        String sql = "SELECT * FROM escola.materia";
		
	try {
            Statement stmt = TelaInicial.conexao.createStatement();
			
            ResultSet resultado = stmt.executeQuery(sql);
			
                while(resultado.next()) {
                    Materia m = new Materia();
				
                    m.setNome(resultado.getString("mate_nome"));
                    m.setAreaDeConhecimento(resultado.getString("mate_areaDeConhecimento"));
                    m.setPeriodoEscolar(resultado.getInt("mate_periodoEscolar"));
				
                    dados.add(m);
		}
	} catch (SQLException e) { throw new RuntimeException(e); }
        
        return dados;
    }
    
    public Materia encontrarMateria(String nome){
        String sql = "SELECT * FROM escola.materia WHERE mate_nome = ?";
        Materia m = new Materia();
        
        try {
            PreparedStatement stmt = TelaInicial.conexao.prepareStatement(sql);
            
            stmt.setString(1, nome);
            
            ResultSet resultado = stmt.executeQuery();
            
            while(resultado.next()){
                m.setNome(resultado.getString("mate_nome"));
                m.setAreaDeConhecimento(resultado.getString("mate_areaDeConhecimento"));
                m.setPeriodoEscolar(resultado.getInt("mate_periodoEscolar"));
                
                return m;
            }
        } catch (SQLException ex) {}
    
        return null;
    }
    
    public boolean alterarMateria(String nomeAntigo, String nomeNovo, String novaAreaDeConhecimento, int novoPeriodoEscolar){
        String sql = "UPDATE escola.materia SET mate_nome = ?, mate_areaDeConhecimento = ?, mate_periodoEscolar = ? WHERE mate_nome = ?";
        
        try {
            PreparedStatement stmt = TelaInicial.conexao.prepareStatement(sql);
            
            stmt.setString(1, nomeNovo);
            stmt.setString(2, novaAreaDeConhecimento);
            stmt.setInt(3, novoPeriodoEscolar);
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
    
    public boolean excluirMateria(String nome){
        String sql = "DELETE FROM escola.materia WHERE mate_nome = ?";
		
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
