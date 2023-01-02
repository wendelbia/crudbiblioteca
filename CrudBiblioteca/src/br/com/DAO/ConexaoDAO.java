package br.com.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoDAO {
	//vari�vel do tipo Connection recebe valor nulo
	Connection con = null;
	//fun��o do tipo Connection
	public Connection conexaoDB() throws ClassNotFoundException {
		try {
			//classe de conex�o mysql que � o driver
			Class.forName("com.mysql.jdbc.Driver");
			//string url que recebe as clausulas
			String url = "jdbc:mysql://localhost:3306/systemabiblioteca?user=root&password=";
			//a vari�vel con recebe o gerenciador que obtem a url
			con = DriverManager.getConnection(url);
		} catch (SQLException e) {
			// TODO: handle exception
		}
		return con;
	}

}
