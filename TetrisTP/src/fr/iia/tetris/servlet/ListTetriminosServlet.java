package fr.iia.tetris.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import fr.iia.tetris.dao.IDAO;
import fr.iia.tetris.model.Tetriminos;

@WebServlet("/list")
public class ListTetriminosServlet extends HttpServlet 
{
	@Autowired
	private IDAO<Tetriminos> tetriminosDAO;
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		SpringBeanAutowiringSupport.processInjectionBasedOnServletContext(this, config.getServletContext());
	}
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{		
		List<Tetriminos> tetris = tetriminosDAO.findAll();
		
		request.setAttribute("tetris", tetris);
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/views/listTetriminos.jsp").forward(request , response );
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
