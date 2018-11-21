package br.ucsal.loja.admin.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.ucsal.loja.admin.model.Admin;
import br.ucsal.utilis.ConnectionFactory;

public class AdminDao {

	private Connection connection;

	public AdminDao() {
		this.connection = ConnectionFactory.getConnection();
	}

	public Admin login(Admin loja) {
		Admin adminReturn = null;
		String sql = "select * from admin where login=? and senha=?";

		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setString(1, loja.getLogin());
			stmt.setString(2, loja.getSenha());

			ResultSet rs = stmt.executeQuery();

			if (rs.next()) {
				adminReturn = new Admin();
				adminReturn.setId(rs.getInt("id"));
				adminReturn.setNome(rs.getString("nome"));
				adminReturn.setLogin(rs.getString("login"));
				adminReturn.setSenha(rs.getString("senha"));
			}

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

		return adminReturn;

	}
	public void adiciona(Admin admin) {
		String sql = "insert into admin " + "(nome,login,senha)" + " values (?,?,?)";
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setString(1, admin.getNome());
			stmt.setString(2, admin.getLogin());
			stmt.setString(3, admin.getSenha());
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}

	}

	public void remove(Long id) {
		try {
			PreparedStatement stmt = connection.prepareStatement("delete from admin where id=?");
			stmt.setLong(1, id);
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	public List<Admin> getLista() {
		try {
			List<Admin> admins = new ArrayList<Admin>();
			String sql = "select * from admin";
			PreparedStatement stmt = this.connection.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				Admin admin = new Admin();
				admin.setId(rs.getLong("id"));
				admin.setNome(rs.getString("nome"));
				admin.setLogin(rs.getString("login"));
				admin.setSenha(rs.getString("senha"));
				admins.add(admin);
			}
			rs.close();
			stmt.close();
			return admins;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}