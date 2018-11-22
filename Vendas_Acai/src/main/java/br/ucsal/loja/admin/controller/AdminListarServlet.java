package br.ucsal.loja.admin.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.ucsal.loja.dao.LojaDao;
import br.ucsal.usuario.dao.UsuarioDao;

@WebServlet("/AdminListarServlet")
public class AdminListarServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public AdminListarServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		LojaDao lojaDao = new LojaDao();
		UsuarioDao usuarioDao= new UsuarioDao();

		request.setAttribute("usuario", usuarioDao.getLista());
		request.setAttribute("loja", lojaDao.getLista());
		RequestDispatcher rd = request.getRequestDispatcher("admin.jsp");
		rd.forward(request, response);

	}

}