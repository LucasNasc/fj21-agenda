package br.com.home.main;


import br.com.home.produtoDao.produtoDao;

import java.sql.SQLException;

import br.com.home.produto.Produto;
public class TesteCriaçao {
	public static void main (String[] args) throws SQLException{
		Produto produto = new Produto();
		
		
		produtoDao dao = new produtoDao();
		
		
		dao.Cria(produto);
		System.out.println("Tablea Criada! ");
	}
}
