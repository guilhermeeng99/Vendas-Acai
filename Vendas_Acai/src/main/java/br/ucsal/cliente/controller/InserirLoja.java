package br.ucsal.cliente.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.ucsal.cliente.dao.LojaDao;
import br.ucsal.cliente.model.Loja;

@WebServlet("/InserirLoja")
public class InserirLoja extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public InserirLoja() {
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

		LojaDao lojaDao;
		
		try {
			lojaDao = new LojaDao();
			lojaDao.adiciona(loja);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

		response.sendRedirect("/cadastrarLojaProduto.jsp");

	}

}