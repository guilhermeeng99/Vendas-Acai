package br.ucsal.loja.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.ucsal.loja.model.Loja;
import br.ucsal.loja.model.Papel;
import br.ucsal.utilis.ConnectionFactory;

public class LojaDao {

	private Connection connection;

	public LojaDao() {
		this.connection = ConnectionFactory.getConnection();
	}

	public Loja login(String login, String senha) {
		//TODO Usuario Fake Mock
		Loja lojaLogin = new Loja();
		lojaLogin.setLogin(login);
		//usuario.se
		if(login.equals("teste1")) {
			if(senha.equals("123")) {
			Papel papel = new Papel();
			papel.setId(1l);
			lojaLogin.setPapel(papel);
			}else{
				return null;
			}
		}else {
			return null;
		}
		return lojaLogin;
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

	public void remove(Long id) {
		try {
			PreparedStatement stmt = connection.prepareStatement("delete from lojas where id=?");
			stmt.setLong(1, id);
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public void altera(Loja loja) {
		String sql = "update lojas set nome=?, email=? ,login=? ,senha=? ,bairro=? where id=?";
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setString(1, loja.getNome());
			stmt.setString(2, loja.getEmail());
			stmt.setString(3, loja.getLogin());
			stmt.setString(4, loja.getSenha());
			stmt.setString(5, loja.getBairro());
			stmt.setLong(6, loja.getId());
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public List<Loja> getLista() {
		try {
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
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public Loja getLoja(Long id) {
		String sql = "select * from lojas where id=?";
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setLong(1, id);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				Loja loja = new Loja();
				loja.setId(rs.getLong("id"));
				loja.setLogin(rs.getString("login"));
				loja.setNome(rs.getString("nome"));
				loja.setEmail(rs.getString("email"));
				loja.setSenha(rs.getString("senha"));
				loja.setBairro(rs.getString("bairro"));
				return loja;
			}
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		return null;
	}
}