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

@WebServlet("/RemoverLoja")
public class RemoverLoja extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public RemoverLoja() {
		super();

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Loja loja = new Loja();

		String senha = request.getParameter("senha");

		loja.setSenha(senha);

		LojaDao lojaDao;
		
		try {
			lojaDao = new LojaDao();
			lojaDao.remove(loja);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

		response.sendRedirect("/ListaProduto");

	}

}