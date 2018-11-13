package br.ucsal.loja.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.ucsal.loja.model.Loja;
import br.ucsal.utilis.ConnectionFactory;

public class LojaDao {

	private Connection connection;

	public LojaDao() throws SQLException, ClassNotFoundException {
		this.connection = ConnectionFactory.getConnection();
	}

	public void adiciona(Loja loja) {
		String sql = "insert into lojas " + "(nome,email,login,senha,bairro)" + " values (?,?,?,?,?)";
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setString(1, loja.getNome());
			stmt.setString(2, loja.getEmail());
			stmt.setString(3, loja.getLogin());
			stmt.setString(4, loja.getSenha());
			stmt.setString(5, loja.getBairro());
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}

	}

	public void remove(Loja loja) throws SQLException {

		String sql = "delete from lojas where senha=?";
		PreparedStatement stmt = connection.prepareStatement(sql);
		stmt.setString(1, loja.getSenha());
		stmt.execute();
		stmt.close();

	}

	public void alteraSenha(Loja loja) throws SQLException {
		String sql = "update lojas set senha=? where login=?";

		PreparedStatement stmt = connection.prepareStatement(sql);
		stmt.setString(1, loja.getSenha());
		stmt.setString(2, loja.getLogin());
		stmt.execute();
		stmt.close();

	}

	public void alteraBairro(Loja loja) throws SQLException {
		String sql = "update lojas set bairro=? where login=?";

		PreparedStatement stmt = connection.prepareStatement(sql);
		stmt.setString(1, loja.getBairro());
		stmt.setString(2, loja.getLogin());
		stmt.execute();
		stmt.close();

	}

	public void alteraNome(Loja loja) throws SQLException {
		String sql = "update lojas set nome=? where login=?";

		PreparedStatement stmt = connection.prepareStatement(sql);
		stmt.setString(1, loja.getNome());
		stmt.setString(2, loja.getLogin());
		stmt.execute();
		stmt.close();

	}

	public void alteraEmail(Loja loja) throws SQLException {
		String sql = "update lojas set email=? where login=?";

		PreparedStatement stmt = connection.prepareStatement(sql);
		stmt.setString(1, loja.getEmail());
		stmt.setString(2, loja.getLogin());
		stmt.execute();
		stmt.close();

	}

	public List<Loja> getLista() throws SQLException {

		List<Loja> lojas = new ArrayList<Loja>();

		String sql = "select * from lojas";
		PreparedStatement stmt = this.connection.prepareStatement(sql);
		ResultSet rs = stmt.executeQuery();

		while (rs.next()) {
			Loja loja = new Loja();
			loja.setId(rs.getLong("id"));
			loja.setNome(rs.getString("nome"));
			loja.setEmail(rs.getString("email"));
			loja.setLogin(rs.getString("login"));
			loja.setSenha(rs.getString("senha"));
			loja.setBairro(rs.getString("bairro"));
			lojas.add(loja);
		}
		rs.close();
		stmt.close();
		return lojas;

	}

	public Loja getCadastro(Loja user) throws SQLException {
		String sql = "select * from lojas where login=?";
		Loja loja = new Loja();
		PreparedStatement stmt = this.connection.prepareStatement(sql);
		stmt.setString(1, user.getLogin());
		ResultSet rs = stmt.executeQuery();
		if (rs.next()) {
			loja.setLogin(rs.getString("login"));
			loja.setNome(rs.getString("nome"));
			loja.setEmail(rs.getString("email"));
			loja.setSenha(rs.getString("senha"));
			loja.setBairro(rs.getString("bairro"));
			return loja;
		}
		rs.close();
		stmt.close();
		return null;

	}

}