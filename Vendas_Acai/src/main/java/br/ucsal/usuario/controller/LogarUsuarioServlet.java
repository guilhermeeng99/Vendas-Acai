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

@WebServlet("/LogarUsuarioServlet")
public class LogarUsuarioServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public LogarUsuarioServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession sessao = request.getSession(false);
		if(sessao!=null){
			sessao.invalidate();
			
		}
		response.sendRedirect("loginUsuario.jsp");
	
}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String login = request.getParameter("login");
		String senha = request.getParameter("senha");
		
		Usuario usuario = new Usuario();
		usuario.setLogin(login);
		usuario.setSenha(senha);
		
		UsuarioDao usuarioDao = new UsuarioDao();	 
		
		Usuario usuarioLogin = usuarioDao.login(usuario);
		if (usuarioLogin != null) {
			HttpSession sessao = request.getSession();
			sessao.setAttribute("usuarioLogin", usuarioLogin);
			response.sendRedirect("/ListarUsuarioServlet");

		} else {
			request.setAttribute("erro", "Usuario ou Senha invalidos");
			request.getRequestDispatcher("erroLoginUsuario.jsp").forward(request, response);
			;
		}

	}

}