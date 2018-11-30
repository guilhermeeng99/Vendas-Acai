package br.ucsal.loja.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.ucsal.loja.dao.LojaDao;
import br.ucsal.produto.dao.ProdutoDao;

@WebServlet("/RemoverLojaServlet")
public class RemoverLojaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public RemoverLojaServlet() {
		super();

	}

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id = req.getParameter("id");

		ProdutoDao produtoDao = new ProdutoDao();

		produtoDao.remove(Long.parseLong(id));
		LojaDao lojaDao = new LojaDao();
		lojaDao.remove(Long.parseLong(req.getParameter("id")));

		RequestDispatcher rd = req.getRequestDispatcher("/loginLoja.jsp");
		rd.forward(req, resp);
	}
}