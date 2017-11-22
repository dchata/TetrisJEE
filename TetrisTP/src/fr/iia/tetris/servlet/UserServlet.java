package fr.iia.tetris.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.jasper.tagplugins.jstl.core.ForEach;

import fr.iia.tetris.model.Utilisateurs;

/**
 * Servlet implementation class UserServlet
 */
@WebServlet("/login")
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ArrayList<Utilisateurs> users = new ArrayList<Utilisateurs>();
		
		users.add(new Utilisateurs(1, "dylan", "not24get"));
		users.add(new Utilisateurs(2, "thomas", "password"));
		
		request.setAttribute("users", users);

		//Récupération valeurs saisies par l'utilisateur		
		String username = (String)request.getParameter("login");
		String password = (String)request.getParameter("password");
		
		for (Utilisateurs utilisateurs : users) //On regarde dans le tableau pour faire une vérif sur name et password
		{
			if(utilisateurs.getUsername().equals(username) && utilisateurs.getPassword().equals(password))//vérification saisie utilisateur pour la connexion
			{
				request.getSession().setAttribute("username", username);
				response.sendRedirect("home");
				return;
			}
		}
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request , response );
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
