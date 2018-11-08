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

@WebServlet("/AlterarBairro")
public class AlterarBairro extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public AlterarBairro() {
		super();

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Loja user = (Loja) request.getSession().getAttribute("user");
		String bairro = request.getParameter("bairro");
		user.setBairro(bairro);

		LojaDao lojaDao;

		try {
			lojaDao = new LojaDao();
			if (user.getSenha().equals(null)) {
			}
			lojaDao.alteraBairro(user);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

		response.sendRedirect("/ListaLoja");

	}

}