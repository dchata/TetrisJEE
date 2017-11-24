package fr.iia.tetris.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import com.sun.javafx.property.adapter.PropertyDescriptor.Listener;

import fr.iia.tetris.dao.IDAO;
import fr.iia.tetris.model.Tetriminos;
import fr.iia.tetris.model.Utilisateurs;

//@WebServlet("/add")
public class AddTetriminosServlet extends HttpServlet 
{
	@Autowired
	private IDAO<Tetriminos> tetriminosDAO;
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		SpringBeanAutowiringSupport.processInjectionBasedOnServletContext(this, config.getServletContext());
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{	
		this.getServletContext().getRequestDispatcher("/WEB-INF/views/addTetriminos.jsp").forward(request , response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		//doGet(request, response);
		Tetriminos tetrimino = new Tetriminos();
		String name = (String)request.getParameter("name");
		String color = (String)request.getParameter("color");
		
		tetrimino.setName(name);
		tetrimino.setColor(color);
		
		System.out.println(name);
		System.out.println(color);
		
		if(!name.isEmpty() && !color.isEmpty())
			tetriminosDAO.save(tetrimino);//ajout de tetriminos
		
		response.sendRedirect("list");
	}

}
