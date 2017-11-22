package fr.iia.tetris.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.javafx.property.adapter.PropertyDescriptor.Listener;

import fr.iia.tetris.model.Tetriminos;
import fr.iia.tetris.model.Utilisateurs;

/**
 * Servlet implementation class AddTetriminos
 */
@WebServlet("/add")
public class AddTetriminosServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddTetriminosServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {	
		
		ArrayList<Tetriminos> tetriminos = (ArrayList<Tetriminos>)request.getServletContext().getAttribute("tetris");
		
		String name = (String)request.getParameter("name");
		String color = (String)request.getParameter("color");
		
		int lastId = tetriminos.size() + 1;
		
		tetriminos.add(new Tetriminos(lastId, name, color)); //ajout de tetriminos
			
		this.getServletContext().getRequestDispatcher("/WEB-INF/views/addTetriminos.jsp").forward(request , response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
