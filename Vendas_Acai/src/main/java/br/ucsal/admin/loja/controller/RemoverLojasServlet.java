package br.ucsal.admin.loja.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.ucsal.acai.dao.LojaDao;

@WebServlet("/RemoverLojasServlet")
public class RemoverLojasServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public RemoverLojasServlet() {
		super();

	}

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String id = req.getParameter("id");

		LojaDao lojaDao = new LojaDao();

		lojaDao.remove(Long.parseLong(id));

		RequestDispatcher rd = req.getRequestDispatcher("/AdminListarServlet");
		rd.forward(req, resp);
	}
}