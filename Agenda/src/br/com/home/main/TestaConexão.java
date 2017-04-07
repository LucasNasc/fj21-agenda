package br.com.home.main;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.home.connectonfactory.ConnectionFactory;

public class TestaConexão {
	public static void main (String[] args) throws SQLException, ClassNotFoundException{
		
		Connection connection = new ConnectionFactory().getConnection();
		System.out.println("Conexão Aberta!");
		connection.close();
	}
}
