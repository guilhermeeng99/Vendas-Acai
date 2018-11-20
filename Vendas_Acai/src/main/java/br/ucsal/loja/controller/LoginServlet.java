package br.ucsal.loja.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.ucsal.loja.dao.LojaDao;
import br.ucsal.loja.model.Loja;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public LoginServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String login = request.getParameter("login");
		String senha = request.getParameter("senha");

		// testou se existe no banco
		LojaDao lojaDao = new LojaDao();
		Loja lojaLogin = lojaDao.login(login, senha);
		if (lojaLogin != null) {

			request.getSession().setAttribute("lojaLogin", lojaLogin);
			response.sendRedirect("/ListarLojaServlet");

		} else {
			request.setAttribute("erro", "Usuario ou Senha invalidos");
			request.getRequestDispatcher("erroLogin.jsp").forward(request, response);
			;
		}

	}

}
