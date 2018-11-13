package br.ucsal.produto.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.ucsal.loja.dao.LojaDao;
import br.ucsal.produto.dao.ProdutoDao;

@WebServlet("/ListarProdutoServlet")
public class ListarProdutoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ListarProdutoServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			ProdutoDao produtoDao = new ProdutoDao();
			LojaDao lojaDao = new LojaDao();
			request.setAttribute("produto", produtoDao.getLista());
			request.setAttribute("loja", lojaDao.getLista());
			RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
			rd.forward(request, response);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

}