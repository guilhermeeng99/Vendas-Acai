package br.ucsal.loja.controller;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

import br.ucsal.loja.model.Loja;

@WebFilter("/admin/*")
public class AcessoFilter implements Filter {

	public AcessoFilter() {
	}

	public void destroy() {
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest httpServletRequest = (HttpServletRequest) request;
		Loja usuario = (Loja) httpServletRequest.getSession().getAttribute("usuario");
		if (usuario != null && usuario.getPapel().getId() == 1l) {
			chain.doFilter(request, response);
		} else {
			request.setAttribute("erro", "Acesso Proibido");
			request.getRequestDispatcher("/erroLogin.jsp").forward(request, response);
		}

	}

	public void init(FilterConfig fConfig) throws ServletException {
	}

}
