package br.com.home.produtoDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.home.connectonfactory.ConnectionFactory;
import br.com.home.produto.Produto;

public class produtoDao {
	private Connection connection;
	
	public produtoDao() {
		this.connection = new ConnectionFactory().getConnection();
	}
	
	public void Cria(Produto produto) throws SQLException{
		String sql = "create table produtos" +
				"(id BIGINT NOT NULL AUTO_INCREMENT,"
				+ "nome VARCHAR(255),"
				+ "tipo VARCHAR(255)"
				+ "fornecedor VARCHAR(255),"
				+ "dataEntrega DATE,"
				+ "primaru key (id);";
		try{
		
		PreparedStatement stmt = connection.prepareStatement(sql);
		
		stmt.execute();
		stmt.close();
		
		
		}catch(SQLException e){
			throw new RuntimeException(e);
		}
		
	}
	
	
}
