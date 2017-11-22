package fr.iia.tetris.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.iia.tetris.model.Tetriminos;

/**
 * Servlet implementation class ListTetriminos
 */
@WebServlet("/list")
public class ListTetriminosServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListTetriminosServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		ArrayList<Tetriminos> tetris = new ArrayList<Tetriminos>();
		
		tetris.add(new Tetriminos(1, "L", "rouge"));
		tetris.add(new Tetriminos(2, "Z", "jaune"));
		tetris.add(new Tetriminos(3, "T", "vert"));
		request.setAttribute("tetris", tetris);
		
		/*int idT = (int)request.getAttribute("delete");
		tetris.remove(idT);*/
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/views/listTetriminos.jsp").forward(request , response );
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
