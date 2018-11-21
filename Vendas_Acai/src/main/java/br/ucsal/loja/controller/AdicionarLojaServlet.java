package br.ucsal.loja.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.ucsal.loja.dao.LojaDao;
import br.ucsal.loja.model.Loja;

@WebServlet("/AdicionarLojaServlet")
public class AdicionarLojaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public AdicionarLojaServlet() {
		super();

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Loja loja = new Loja();

		String nome = request.getParameter("nome");
		String email = request.getParameter("email");
		String login = request.getParameter("login");
		String senha = request.getParameter("senha");
		String bairro = request.getParameter("bairro");

		loja.setNome(nome);
		loja.setEmail(email);
		loja.setLogin(login);
		loja.setSenha(senha);
		loja.setBairro(bairro);

		LojaDao lojaDao = new LojaDao();
		lojaDao.adiciona(loja);
		lojaDao.login(loja);
		Loja lojaLogin = lojaDao.login(loja);
		HttpSession sessao = request.getSession();
		sessao.setAttribute("lojaLogin", lojaLogin);
		response.sendRedirect("/adicionarProduto.jsp");

	}

}