package br.ucsal.produto.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.ucsal.loja.model.Loja;
import br.ucsal.produto.model.Produto;
import br.ucsal.utilis.ConnectionFactory;

public class ProdutoDao {

	private Connection connection;

	public ProdutoDao(){
		this.connection = ConnectionFactory.getConnection();
	}

	public void adiciona(Produto produto) {
		String sql = "insert into produto " + "(nome,conteudo,gramas,preco,id_loja)" + " values (?,?,?,?,?)";
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setString(1, produto.getNome());
			stmt.setString(2, produto.getConteudo());
			stmt.setString(3, produto.getGramas());
			stmt.setString(4, produto.getPreco());
			stmt.setLong(5, produto.getLoja().getId());
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}

	}

	public void remove(Long id) {
		try {
			PreparedStatement stmt = connection.prepareStatement("delete from produto where id=?");
			stmt.setLong(1, id);
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public void altera(Produto produto) {
		String sql = "update produto set nome=?, conteudo=? ,gramas=? ,preco=? where id=?";
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setString(1, produto.getNome());
			stmt.setString(2, produto.getConteudo());
			stmt.setString(3, produto.getGramas());
			stmt.setString(4, produto.getPreco());
			stmt.setLong(5, produto.getId());
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public List<Produto> getLista(){

		try {
			List<Produto> produtos = new ArrayList<Produto>();
			String sql = "select lojas.nome as loja_nome,lojas.id as loja_id , produto.* from produto INNER JOIN lojas on produto.ID_LOJA = lojas.ID";
			PreparedStatement stmt = this.connection.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				Produto produto = new Produto();
				Loja loja = new Loja();
				
				produto.setId(rs.getLong("id"));
				produto.setNome(rs.getString("nome"));
				produto.setConteudo(rs.getString("conteudo"));
				produto.setGramas(rs.getString("gramas"));
				produto.setPreco(rs.getString("preco"));
				
				loja.setId(rs.getLong("loja_id"));
				loja.setNome(rs.getString("loja_nome"));
				
				produto.setLoja(loja);
				
				produtos.add(produto);
			}
			rs.close();
			stmt.close();
			return produtos;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public Produto getProduto(Long id) {
		String sql = "select * from produto where id=?";
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setLong(1, id);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				Produto produto = new Produto();
				produto.setId(rs.getLong("id"));
				produto.setNome(rs.getString("nome"));
				produto.setConteudo(rs.getString("conteudo"));
				produto.setGramas(rs.getString("gramas"));
				produto.setPreco(rs.getString("preco"));
				return produto;
			}
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		return null;
	}
}
