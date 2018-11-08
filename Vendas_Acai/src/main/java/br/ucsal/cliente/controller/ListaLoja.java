package br.ucsal.cliente.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.ucsal.cliente.dao.LojaDao;

@WebServlet("/ListaLoja")
public class ListaLoja extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ListaLoja() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			LojaDao HorarioDao = new LojaDao();
			request.setAttribute("loja", HorarioDao.getLista());
			RequestDispatcher rd = request.getRequestDispatcher("listaLoja.jsp");
			rd.forward(request, response);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

}