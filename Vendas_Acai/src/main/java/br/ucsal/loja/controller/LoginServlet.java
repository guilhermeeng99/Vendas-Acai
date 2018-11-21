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

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public LoginServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession sessao = request.getSession(false);
		if(sessao!=null){
			sessao.invalidate();
			
		}
		response.sendRedirect("login.jsp");
	
}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String login = request.getParameter("login");
		String senha = request.getParameter("senha");
		
		Loja loj = new Loja();
		loj.setLogin(login);
		loj.setSenha(senha);
		
		LojaDao lojaDao = new LojaDao();	 
		
		Loja lojaLogin = lojaDao.login(loj);
		if (lojaLogin != null) {
			HttpSession sessao = request.getSession();
			sessao.setAttribute("lojaLogin", lojaLogin);
			response.sendRedirect("/ListarLojaServlet");

		} else {
			request.setAttribute("erro", "Usuario ou Senha invalidos");
			request.getRequestDispatcher("erroLogin.jsp").forward(request, response);
			;
		}

	}

}