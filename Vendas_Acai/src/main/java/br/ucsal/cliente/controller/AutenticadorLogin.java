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
import br.ucsal.cliente.model.Loja;

@WebServlet("/AutenticadorLogin")
public class AutenticadorLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Loja user = new Loja();
		String login = request.getParameter("login");
		String senha = request.getParameter("senha");
		user.setLogin(login);
		user.setSenha(senha);
		if (autenticarUser(user)) {
			request.getSession().setAttribute("user", user);
			response.sendRedirect("escolhaLoja.jsp");
		} else {
			request.setAttribute("erro", "Usuario ou senha invalios!");
			RequestDispatcher d = request.getRequestDispatcher("paginaErro.jsp");
			d.forward(request, response);
		}
	}

	private boolean autenticarUser(Loja user) {
		boolean autenticado = false;
		try {
			LojaDao dao = new LojaDao();
			if (user.getSenha().equals(dao.getCadastro(user).getSenha())){
				autenticado = true;
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return autenticado;
	}

}

