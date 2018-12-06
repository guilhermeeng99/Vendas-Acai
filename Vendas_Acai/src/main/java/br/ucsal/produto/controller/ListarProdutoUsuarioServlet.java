package br.ucsal.produto.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.ucsal.acai.dao.ProdutoDao;

@WebServlet("/ListarProdutoUsuarioServlet")
public class ListarProdutoUsuarioServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ListarProdutoUsuarioServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ProdutoDao produtoDao = new ProdutoDao();
		request.setAttribute("produto", produtoDao.getLista());
		RequestDispatcher rd = request.getRequestDispatcher("listarProdutoUsuario.jsp");
		rd.forward(request, response);
	}

}