package br.ucsal.usuario.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.ucsal.acai.dao.UsuarioDao;

@WebServlet("/RemoverUsuarioServlet")
public class RemoverUsuarioServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public RemoverUsuarioServlet() {
		super();

	}

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		UsuarioDao usuarioDao = new UsuarioDao();
		usuarioDao.remove(Long.parseLong(req.getParameter("id")));

		RequestDispatcher rd = req.getRequestDispatcher("/loginUsuario.jsp");
		rd.forward(req, resp);
	}
}