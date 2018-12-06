package br.ucsal.produto.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.ucsal.acai.dao.ProdutoDao;

@WebServlet("/RemoverProdutoServlet")
public class RemoverProdutoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public RemoverProdutoServlet() {
		super();

	}

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String id = req.getParameter("id");

		ProdutoDao produtoDao = new ProdutoDao();

		produtoDao.remove(Long.parseLong(id));

		RequestDispatcher rd = req.getRequestDispatcher("/ListarProdutoLojaServlet");
		rd.forward(req, resp);
	}
}