package controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class FabricaDeConexao {
	
	private static FabricaDeConexao conexao;
	
	private FabricaDeConexao() {}
	
	public static FabricaDeConexao getconexao() {
		if(conexao == null)
			conexao = new FabricaDeConexao();
		
		return conexao;
	}
	
	public Connection getConexaoRoot() {
		
		try {
			Properties prop = getProperties();
			
			Connection conexao = DriverManager.getConnection(prop.getProperty("banco.url"), prop.getProperty("banco.usuarioRoot"), prop.getProperty("banco.senhaRoot"));			
			conexao.setAutoCommit(false);
                        
			return conexao;
		} catch (SQLException | IOException e) {
			throw new RuntimeException(e);
		}
	}
	
	private Properties getProperties() throws IOException {
		Properties prop = new Properties();
		
		String caminho = "conexao.properties";
		
		prop.load(FabricaDeConexao.class.getResourceAsStream(caminho));
		
		return prop;
	}
	
}
