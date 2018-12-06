package br.ucsal.loja.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.ucsal.acai.dao.LojaDao;

@WebServlet("/ListarLojaServlet")
public class ListarLojaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ListarLojaServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		LojaDao lojaDao = new LojaDao();

			request.setAttribute("loja", lojaDao.getLista());
			RequestDispatcher rd = request.getRequestDispatcher("listarLoja.jsp");
			rd.forward(request, response);

	}

}