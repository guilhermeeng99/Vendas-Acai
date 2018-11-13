package br.ucsal.loja.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.ucsal.loja.dao.LojaDao;
import br.ucsal.loja.model.Loja;

@WebServlet("/RemoverLojaServlet")
public class RemoverLojaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public RemoverLojaServlet() {
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

		response.sendRedirect("/ListarProdutoServlet");

	}

}