package br.ucsal.usuario.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.ucsal.usuario.dao.UsuarioDao;
import br.ucsal.usuario.model.Usuario;

@WebServlet("/AdicionarUsuarioServlet")
public class AdicionarUsuarioServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public AdicionarUsuarioServlet() {
		super();

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Usuario usuario = new Usuario();

		String nome = request.getParameter("nome");
		String email = request.getParameter("email");
		String login = request.getParameter("login");
		String senha = request.getParameter("senha");
		String bairro = request.getParameter("bairro");

		usuario.setNome(nome);
		usuario.setEmail(email);
		usuario.setLogin(login);
		usuario.setSenha(senha);
		usuario.setBairro(bairro);

		UsuarioDao usuarioDao = new UsuarioDao();
		usuarioDao.adiciona(usuario);
		usuarioDao.login(usuario);
		Usuario usuarioLogin = usuarioDao.login(usuario);
		HttpSession sessao = request.getSession();
		sessao.setAttribute("usuarioLogin", usuarioLogin);
		response.sendRedirect("/ListarUsuarioServlet");

	}

}