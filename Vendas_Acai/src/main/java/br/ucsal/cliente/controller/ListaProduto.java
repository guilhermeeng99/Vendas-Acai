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
import br.ucsal.cliente.dao.ProdutoDao;

@WebServlet("/ListaProduto")
public class ListaProduto extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ListaProduto() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			ProdutoDao produtoDao = new ProdutoDao();
			LojaDao lojaDao = new LojaDao();
			request.setAttribute("produto", produtoDao.getLista());
			request.setAttribute("loja", lojaDao.getLista());
			RequestDispatcher rd = request.getRequestDispatcher("listaProduto.jsp");
			rd.forward(request, response);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

}