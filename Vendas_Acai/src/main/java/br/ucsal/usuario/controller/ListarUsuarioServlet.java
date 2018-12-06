package br.ucsal.usuario.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.ucsal.acai.dao.UsuarioDao;

@WebServlet("/ListarUsuarioServlet")
public class ListarUsuarioServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ListarUsuarioServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		UsuarioDao usuarioDao = new UsuarioDao();

			request.setAttribute("usuario", usuarioDao.getLista());
			RequestDispatcher rd = request.getRequestDispatcher("listarUsuario.jsp");
			rd.forward(request, response);

	}

}