package br.ucsal.cliente.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.ucsal.cliente.dao.LojaDao;
import br.ucsal.cliente.model.Loja;

@WebServlet("/AlterarSenha")
public class AlterarSenha extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public AlterarSenha() {
		super();

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Loja user = (Loja) request.getSession().getAttribute("user");
		String senha = request.getParameter("senha");
		user.setSenha(senha);

		LojaDao lojaDao;

		try {
			lojaDao = new LojaDao();
			if (user.getSenha().equals(null)) {
			}
			lojaDao.alteraSenha(user);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

		response.sendRedirect("/ListaLoja");

	}

}