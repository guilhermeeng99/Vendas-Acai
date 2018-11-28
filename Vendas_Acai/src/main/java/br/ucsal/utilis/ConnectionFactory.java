package br.ucsal.utilis;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	private static ConnectionFactory connectionFactory = null;

	private static Connection connection = null;

	private String conStr = "jdbc:hsqldb:hsql://localhost/vendasAcai";
	private String usuario = "sa";
	private String senha = "";

	private ConnectionFactory() {
		try {
			Class.forName("org.hsqldb.jdbcDriver");
			connection = DriverManager.getConnection(conStr, usuario, senha);
			connection.createStatement()
					.execute("CREATE TABLE IF NOT EXISTS LOJAS  ( " + "  ID BIGINT IDENTITY PRIMARY KEY,"
							+ "  NOME VARCHAR(255), EMAIL VARCHAR(255), LOGIN VARCHAR(255), SENHA VARCHAR(255), BAIRRO VARCHAR(255) "
							+ ");");
			connection.createStatement()
			.execute("CREATE TABLE IF NOT EXISTS USUARIO  ( " + "  ID BIGINT IDENTITY PRIMARY KEY,"
					+ "  NOME VARCHAR(255), EMAIL VARCHAR(255), LOGIN VARCHAR(255), SENHA VARCHAR(255), BAIRRO VARCHAR(255) "
					+ ");");
			connection.createStatement()
			.execute("CREATE TABLE IF NOT EXISTS PRODUTO  ( " + "  ID BIGINT IDENTITY PRIMARY KEY,"
					+ "  NOME VARCHAR(255), CONTEUDO VARCHAR(255), GRAMAS VARCHAR(255), PRECO VARCHAR(255), ID_LOJA INT NOT NULL,"
					+ "  FOREIGN KEY (ID_LOJA) REFERENCES LOJAS(ID)"
					+ ");");
		} catch (SQLException | ClassNotFoundException e) {
			throw new RuntimeException(e);
		}

	}

	public static Connection getConnection() {
		if (connectionFactory == null) {
			connectionFactory = new ConnectionFactory();
		}
		return connection;
	}

}