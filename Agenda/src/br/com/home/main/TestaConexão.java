package br.com.home.main;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.home.connectonfactory.ConnectionFactory;

public class TestaConex�o {
	public static void main (String[] args) throws SQLException, ClassNotFoundException{
		
		Connection connection = new ConnectionFactory().getConnection();
		System.out.println("Conex�o Aberta!");
		connection.close();
	}
}
