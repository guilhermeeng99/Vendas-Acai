package br.ucsal.produto.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.ucsal.produto.dao.ProdutoDao;

@WebServlet("/ListarProdutoServlet")
public class ListarProdutoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ListarProdutoServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ProdutoDao produtoDao = new ProdutoDao();
		request.setAttribute("produto", produtoDao.getLista());
		RequestDispatcher rd = request.getRequestDispatcher("listarProduto.jsp");
		rd.forward(request, response);
	}

}