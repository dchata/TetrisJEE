package fr.iia.tetris.Filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginFilter  implements javax.servlet.Filter
{
	@Override
	public void doFilter(ServletRequest rq, ServletResponse rp, FilterChain chain) throws IOException, ServletException {
		HttpServletRequest request = (HttpServletRequest)rq;
		HttpServletResponse response = (HttpServletResponse)rp;
		String verif = request.getRequestURI();
		HttpSession  session = request.getSession();
		String username = session.getAttribute("login").toString();
		String pass = session.getAttribute("password").toString();
		
		//Vérification de l'existence d'un utilisateur
		if(username == null )
			if(!verif.contains("/login"))
				return;
			else
				return;
		else
			request.getServletContext().getRequestDispatcher("/WEB-INF/views/home.jsp");
		
		chain.doFilter(request, response);
	}
	
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		Filter.super.init(filterConfig);
		System.out.println("LOGIN FILTER CREATED");
	}
	
	@Override
	public void destroy() {
		Filter.super.destroy();
		System.out.println("LOGIN FILTER DESTROYED");
	}
}
