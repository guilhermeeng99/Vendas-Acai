package br.ucsal.produto.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.ucsal.produto.model.Produto;
import br.ucsal.utilis.ConnectionFactory;

public class ProdutoDao {

	private Connection connection;

	public ProdutoDao() throws SQLException, ClassNotFoundException {
		this.connection = ConnectionFactory.getConnection();
	}

	public void adiciona(Produto produto) {
		String sql = "insert into produto " + "(nome,conteudo,gramas,preco)" + " values (?,?,?,?)";
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setString(1, produto.getNome());
			stmt.setString(2, produto.getConteudo());
			stmt.setString(3, produto.getGramas());
			stmt.setString(4, produto.getPreco());
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}

	}

	public void remove(Produto produto) throws SQLException {

		String sql = "delete from produto where nome=?";
		PreparedStatement stmt = connection.prepareStatement(sql);
		stmt.setString(1, produto.getNome());
		stmt.execute();
		stmt.close();

	}

	public void alteraConteudo(Produto produto) throws SQLException {
		String sql = "update produto set conteudo=? where nome=?";

		PreparedStatement stmt = connection.prepareStatement(sql);
		stmt.setString(1, produto.getConteudo());
		stmt.setString(2, produto.getNome());
		stmt.execute();
		stmt.close();

	}

	public void alteraGramas(Produto produto) throws SQLException {
		String sql = "update produto set gramas=? where nome=?";

		PreparedStatement stmt = connection.prepareStatement(sql);
		stmt.setString(1, produto.getGramas());
		stmt.setString(2, produto.getNome());
		stmt.execute();
		stmt.close();

	}

	public void alteraPreco(Produto produto) throws SQLException {
		String sql = "update produto set preco=? where nome=?";

		PreparedStatement stmt = connection.prepareStatement(sql);
		stmt.setString(1, produto.getPreco());
		stmt.setString(2, produto.getNome());
		stmt.execute();
		stmt.close();

	}

	public List<Produto> getLista() throws SQLException {

		List<Produto> produtos = new ArrayList<Produto>();

		String sql = "select * from produto";
		PreparedStatement stmt = this.connection.prepareStatement(sql);
		ResultSet rs = stmt.executeQuery();

		while (rs.next()) {
			Produto produto = new Produto();
			produto.setId(rs.getLong("id"));
			produto.setNome(rs.getString("nome"));
			produto.setConteudo(rs.getString("conteudo"));
			produto.setGramas(rs.getString("gramas"));
			produto.setPreco(rs.getString("preco"));
			produtos.add(produto);
		}
		rs.close();
		stmt.close();
		return produtos;

	}

	public Produto getCadastro(Produto user) throws SQLException {
		String sql = "select * from produto where login=?";
		Produto produto = new Produto();
		PreparedStatement stmt = this.connection.prepareStatement(sql);
		stmt.setString(1, user.getNome());
		ResultSet rs = stmt.executeQuery();
		if (rs.next()) {
			produto.setNome(rs.getString("nome"));
			produto.setConteudo(rs.getString("conteudo"));
			produto.setGramas(rs.getString("gramas"));
			produto.setPreco(rs.getString("preco"));
			return produto;
		}
		rs.close();
		stmt.close();
		return null;

	}

}