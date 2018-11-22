package br.ucsal.loja.admin.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.ucsal.usuario.dao.UsuarioDao;

@WebServlet("/ListarUsuariosServlet")
public class ListarUsuariosServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ListarUsuariosServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		UsuarioDao usuarioDao = new UsuarioDao();

		request.setAttribute("usuario", usuarioDao.getLista());
		RequestDispatcher rd = request.getRequestDispatcher("listarUsuarios.jsp");
		rd.forward(request, response);

	}

}