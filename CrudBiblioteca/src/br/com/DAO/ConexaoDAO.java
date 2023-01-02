package br.com.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoDAO {
	//variável do tipo Connection recebe valor nulo
	Connection con = null;
	//função do tipo Connection
	public Connection conexaoDB() throws ClassNotFoundException {
		try {
			//classe de conexão mysql que é o driver
			Class.forName("com.mysql.jdbc.Driver");
			//string url que recebe as clausulas
			String url = "jdbc:mysql://localhost:3306/systemabiblioteca?user=root&password=";
			//a variável con recebe o gerenciador que obtem a url
			con = DriverManager.getConnection(url);
		} catch (SQLException e) {
			// TODO: handle exception
		}
		return con;
	}

}
